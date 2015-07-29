package chat.client;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient {
	
	public static class ReceiveThread extends Thread {
		
		private BufferedReader reader;
		
		public ReceiveThread(BufferedReader reader) {
			this.reader = reader;
		}
		
		@Override
		public void run() {
			try {
				while (true) {
					// ������ ���� �޽��� ����
					String message = reader.readLine();
					if (message == null) {
						break;
					}
					// ȭ�鿡 ǥ��
					receivedMessages.append(message + "\n");
					// ��ũ�� ������ (Ŀ�� �� ���������� �ű��)
					receivedMessages.setCaretPosition(
							receivedMessages.getDocument().getLength());
				}
			} catch (IOException e) {}
		}
		
	}

	private static String WINDOW_TITLE = "ä�� Ŭ���̾�Ʈ";
	private static JTextArea receivedMessages;	// ���� �޽��� ��� ȭ��
	private JFrame frame;
	private JTextField nicknameTextField;
	private Socket sock;
	private BufferedReader reader;
	private PrintWriter writer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatClient window = new ChatClient();
					window.frame.setTitle(WINDOW_TITLE);
					window.frame.setVisible(true);	// ȭ�鿡 ��Ÿ������
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ChatClient() {
		initialize();
	}

	private void connect() {
		try {
			// ������ ����
			sock = new Socket("192.168.1.2", 3000);
			reader = new BufferedReader(
					new InputStreamReader(sock.getInputStream()));
			// �޽��� ���� ������ ���� �� ����
			ReceiveThread rt = new ReceiveThread(reader);
			rt.start();
			
			// writer ��ü ����
			writer = new PrintWriter(sock.getOutputStream());
		} catch (IOException e) {
			System.err.println("�����߻�: " + e.getMessage());
			System.exit(1);	// 0: ���� ����, �� �̿�: ������ ����
		}
	}
	
	private void disconnect() {
		if (reader != null) {
			try {
				reader.close();
			} catch (IOException e) {}
		}
		if (writer != null) {
			writer.close();
		}
		if (sock != null) {
			try {
				sock.close();
			} catch (IOException e) {}
		}
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {	// ȭ�� ����
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new BorderLayout(0, 0));
		frame.getContentPane().add(topPanel, BorderLayout.NORTH);
		
		JLabel nicknameLabel = new JLabel("��ȭ��");
		topPanel.add(nicknameLabel, BorderLayout.WEST);
		
		nicknameTextField = new JTextField();
		topPanel.add(nicknameTextField, BorderLayout.CENTER);
		nicknameTextField.setColumns(10);
		
		JButton connectButton = new JButton("����");
		topPanel.add(connectButton, BorderLayout.EAST);
		
		receivedMessages = new JTextArea();
		receivedMessages.setEditable(false);
		receivedMessages.setLineWrap(true);
		
		JScrollPane scrollPane = new JScrollPane(receivedMessages,
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new BorderLayout(0, 0));
		frame.getContentPane().add(bottomPanel, BorderLayout.SOUTH);
		
		JTextField messageTextField = new JTextField();	// �޽��� �Է�â
		messageTextField.setEnabled(false);
		messageTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == 10) {
					// �޽��� �Է�â���� ����Ű �������� �� ���� �Ǵ� ��
					
					String message = messageTextField.getText();
					
					// �޽��� �Է�â�� �Էµ� ������ �� ���ڿ��� �ƴϸ�
					if (!message.trim().equals("")) {
						// �޽��� ����
						writer.println(message.trim());
						writer.flush();
					}
					// �޽��� �Է�â ����
					messageTextField.setText("");
				}
			}
		});
		bottomPanel.add(messageTextField, BorderLayout.CENTER);
		
		JButton sendButton = new JButton("����");
		sendButton.setEnabled(false);
		sendButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// ���� ��ư�� �������� �� ���� �Ǵ� ��
				
				String message = messageTextField.getText();
				
				// �޽��� �Է�â�� �Էµ� ������ �� ���ڿ��� �ƴϸ�
				if (!message.trim().equals("")) {
					// �޽��� ����
					writer.println(message.trim());
					writer.flush();
				}
				// �޽��� �Է�â ����
				messageTextField.setText("");
			}
		});
		bottomPanel.add(sendButton, BorderLayout.EAST);
		
		// ���� ��ư ���
		connectButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// ���� ��ư�� �������� �� ����Ǵ� ��
				if (connectButton.getText().equals("����")) {
					String nick = nicknameTextField.getText().trim();
					// ��ȭ�� �Է��߳�?
					if (!nick.equals("")) {
						// ������ ����
						connect();
						// ��ȭ�� ����
						writer.println(nick);
						writer.flush();
						// ��ư �ؽ�Ʈ�� "����" -> "��������"
						connectButton.setText("��������");
						// �޽��� �Է�â Ȱ��ȭ
						messageTextField.setEnabled(true);
						// ���� ��ư Ȱ��ȭ
						sendButton.setEnabled(true);
						// ��ȭ�� �Է�â ��Ȱ��ȭ
						nicknameTextField.setEnabled(false);
					}
				}
				// ��������
				else {
					// ���� ���� ����
					disconnect();
					// ��ư �ؽ�Ʈ�� "��������" -> "����"
					connectButton.setText("����");
					// �޽��� �Է�â ��Ȱ��ȭ
					messageTextField.setEnabled(false);
					// ���� ��ư ��Ȱ��ȭ
					sendButton.setEnabled(false);
					// ��ȭ�� �Է�â Ȱ��ȭ
					nicknameTextField.setEnabled(true);
				}
			}
		});
	}
	
}
