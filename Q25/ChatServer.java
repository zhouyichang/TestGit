package zyc.develop.Q25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
	
	public static void main(String[] args) throws IOException {
		
		//创建serversocket对象
		ServerSocket ss = new ServerSocket(10012);
		
		while(true){
			//创建socket对象
			Socket socket = ss.accept();
			String str = socket.getInetAddress().getHostAddress();
			System.out.println(str+"连接成功！！时");
			new Thread(new ChatThread(socket)).start();
		}
		
		
		
		
		
		
//		ss.close();
		
	}

}
