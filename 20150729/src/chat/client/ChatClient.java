package chat.client;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient {

	private static String WINDOW_TITLE = "ä�� Ŭ���̾�Ʈ";
	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatClient window = new ChatClient();
					window.frame.setTitle(WINDOW_TITLE);
					window.frame.setVisible(true);
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

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new BorderLayout(0, 0));
		frame.getContentPane().add(topPanel, BorderLayout.NORTH);
		
		JLabel nicknameLabel = new JLabel("��ȭ��");
		topPanel.add(nicknameLabel, BorderLayout.WEST);
		
		textField = new JTextField();
		topPanel.add(textField, BorderLayout.CENTER);
		textField.setColumns(10);
		
		JButton connectButton = new JButton("����");
		topPanel.add(connectButton, BorderLayout.EAST);
		connectButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// ���� ��ư�� �������� �� ����Ǵ� ��
			}
		});
		
		JTextArea receivedMessages = new JTextArea();
		receivedMessages.setEditable(false);
		receivedMessages.setLineWrap(true);
		
		JScrollPane scrollPane = new JScrollPane(receivedMessages,
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new BorderLayout(0, 0));
		frame.getContentPane().add(bottomPanel, BorderLayout.SOUTH);
		
		JTextField messageTextField = new JTextField();
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
				
			}
		});
		bottomPanel.add(sendButton, BorderLayout.EAST);
	}
	
}
