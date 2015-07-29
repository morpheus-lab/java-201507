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
					// 서버로 부터 메시지 수신
					String message = reader.readLine();
					if (message == null) {
						break;
					}
					// 화면에 표시
					receivedMessages.append(message + "\n");
					// 스크롤 내리기 (커서 맨 마지막으로 옮기기)
					receivedMessages.setCaretPosition(
							receivedMessages.getDocument().getLength());
				}
			} catch (IOException e) {}
		}
		
	}

	private static String WINDOW_TITLE = "채팅 클라이언트";
	private static JTextArea receivedMessages;	// 수신 메시지 출력 화면
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
					window.frame.setVisible(true);	// 화면에 나타나도록
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
			// 서버에 접속
			sock = new Socket("192.168.1.2", 3000);
			reader = new BufferedReader(
					new InputStreamReader(sock.getInputStream()));
			// 메시지 수신 스레드 생성 및 시작
			ReceiveThread rt = new ReceiveThread(reader);
			rt.start();
			
			// writer 객체 생성
			writer = new PrintWriter(sock.getOutputStream());
		} catch (IOException e) {
			System.err.println("에러발생: " + e.getMessage());
			System.exit(1);	// 0: 정상 종료, 그 이외: 비정상 종료
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
	private void initialize() {	// 화면 구성
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new BorderLayout(0, 0));
		frame.getContentPane().add(topPanel, BorderLayout.NORTH);
		
		JLabel nicknameLabel = new JLabel("대화명");
		topPanel.add(nicknameLabel, BorderLayout.WEST);
		
		nicknameTextField = new JTextField();
		topPanel.add(nicknameTextField, BorderLayout.CENTER);
		nicknameTextField.setColumns(10);
		
		JButton connectButton = new JButton("접속");
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
		
		JTextField messageTextField = new JTextField();	// 메시지 입력창
		messageTextField.setEnabled(false);
		messageTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == 10) {
					// 메시지 입력창에서 엔터키 눌러졌을 때 실행 되는 곳
					
					String message = messageTextField.getText();
					
					// 메시지 입력창에 입력된 내용이 빈 문자열이 아니면
					if (!message.trim().equals("")) {
						// 메시지 전송
						writer.println(message.trim());
						writer.flush();
					}
					// 메시지 입력창 비우기
					messageTextField.setText("");
				}
			}
		});
		bottomPanel.add(messageTextField, BorderLayout.CENTER);
		
		JButton sendButton = new JButton("전송");
		sendButton.setEnabled(false);
		sendButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 전송 버튼이 눌러졌을 때 실행 되는 곳
				
				String message = messageTextField.getText();
				
				// 메시지 입력창에 입력된 내용이 빈 문자열이 아니면
				if (!message.trim().equals("")) {
					// 메시지 전송
					writer.println(message.trim());
					writer.flush();
				}
				// 메시지 입력창 비우기
				messageTextField.setText("");
			}
		});
		bottomPanel.add(sendButton, BorderLayout.EAST);
		
		// 접속 버튼 기능
		connectButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// 접속 버튼이 눌러졌을 때 실행되는 곳
				if (connectButton.getText().equals("접속")) {
					String nick = nicknameTextField.getText().trim();
					// 대화명 입력했나?
					if (!nick.equals("")) {
						// 서버에 접속
						connect();
						// 대화명 전송
						writer.println(nick);
						writer.flush();
						// 버튼 텍스트를 "접속" -> "접속종료"
						connectButton.setText("접속종료");
						// 메시지 입력창 활성화
						messageTextField.setEnabled(true);
						// 전송 버튼 활성화
						sendButton.setEnabled(true);
						// 대화명 입력창 비활성화
						nicknameTextField.setEnabled(false);
					}
				}
				// 접속종료
				else {
					// 서버 접속 끊기
					disconnect();
					// 버튼 텍스트를 "접속종료" -> "접속"
					connectButton.setText("접속");
					// 메시지 입력창 비활성화
					messageTextField.setEnabled(false);
					// 전송 버튼 비활성화
					sendButton.setEnabled(false);
					// 대화명 입력창 활성화
					nicknameTextField.setEnabled(true);
				}
			}
		});
	}
	
}
