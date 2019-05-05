package zyc.develop.Q25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatClient {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		//创建socket对象
		Socket socket = new Socket("192.168.42.22", 10012);
		//创建字符流
		InputStreamReader isr = new InputStreamReader(System.in);
		//字符流包装bbuf
		BufferedReader bufr = new BufferedReader(isr);
		
		//创建输出流对象
		PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
		
		
		String line = null;
		while((line=bufr.readLine())!=null){
			if("over".equals(line)){
				break;
			}
			out.println(line);
		}
		socket.close();
	}
	
	

}
