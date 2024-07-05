package sec07;

//	클라이언트 gui 구현
//	각 입력 출력 접속 종료 구현

/*
 * 	ChatClient
 *  ---------------
 * 	chatName: String
 * 	socket: Socket
 * 	dis: DataInputStream
 * 	dos: DataOutputStream
 * 
 * 	method
 *  ---------------
 * 	connect: void
 * 	send: void (JSON) 
 * 	receive: void (Thread) 
 * 	unconnect: void
 * 	
 * 	1. connect
 * 	2. 대화명 입력 -> 전송
 * 
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import org.json.JSONObject;

public class ChatClient {
	//필드
	Socket socket;
	DataInputStream dis;
	DataOutputStream dos;
	String chatName;
	
	//메소드: 서버 연결
	public  void connect() throws IOException {
//		생성자 만들어지고 서버 연결 됨
		socket = new Socket("192.168.0.82", 50001);
		dis = new DataInputStream(socket.getInputStream());
		dos = new DataOutputStream(socket.getOutputStream());
		
		System.out.println("[클라이언트] 서버에 연결됨");		
	}
	
	//메소드: JSON 받기
//	내부에 Thread 를 만들어서 처리한다
//	왜: 언제 메시지가 올지 모르기 때문에 기다려야 해서
	public void receive() {
		Thread thread = new Thread(() -> {
			try {
				while(true) {
//					메시지 수신 대기
					String json = dis.readUTF();
					
//					도착하면 메시지 읽어오기
					JSONObject root = new JSONObject(json);
//					도착한 메시지의 JSON 값에서 clientIp를 가져온다
					String clientIp = root.getString("clientIp");
//					도착한 메시지의 JSON 값에서 chatName를 가져온다
					String chatName = root.getString("chatName");
//					도착한 메시지의 JSON 값에서 message 를 가져온다
					String message = root.getString("message");
					
					System.out.println("<" + chatName + "@" + clientIp + "> " + message);
				}
			} 
			catch(Exception e1) {
				System.out.println("[클라이언트] 서버 연결 끊김");
				System.exit(0);
			}
		});
		thread.start();
	}
	
	//메소드: JSON 보내기
//	키보드 입력 시 보내주는 역할
	public void send(String json) throws IOException {
		dos.writeUTF(json);
		dos.flush();
	}
	
	//메소드: 서버 연결 종료
	public void unconnect() throws IOException {
		socket.close();
	}
	
	//메소드: 메인
	public static void main(String[] args) {		
		try {			
			Scanner scanner = new Scanner(System.in);

			ChatClient chatClient = new ChatClient();
			chatClient.connect();
			
			System.out.println("사용자명 입력: ");
			chatClient.chatName = scanner.nextLine();
			
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("command", "incoming");
			jsonObject.put("data", chatClient.chatName);
	
			/*
			 *  {
			 *  	"command": "incoming"
			 *  	"data": "이름"
			 *  }
			 */
			
			String json = jsonObject.toString();
			chatClient.send(json);
			
			chatClient.receive();			
			
			System.out.println("--------------------------------------------------");
			System.out.println("보낼 메시지를 입력하고 Enter");
			System.out.println("채팅를 종료하려면 q 를 입력하고 Enter");
			System.out.println("--------------------------------------------------");
			
			while(true) {
				String message = scanner.nextLine();
				if(message.toLowerCase().equals("q")) {
					break;
				} 
				else {
					jsonObject = new JSONObject();
					jsonObject.put("command", "message");
					jsonObject.put("data", message);
					
					/*
					 *  {
					 *  	"command": "message"
					 *  	"data": message
					 *  }
					 */
					
					json = jsonObject.toString();
					chatClient.send(json);
				}
			}
			scanner.close();
			chatClient.unconnect();
		} 
		catch(IOException e) {
			System.out.println("[클라이언트] 서버 연결 안됨");
		}
	}
}



