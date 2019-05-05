package zyc.develop.Q25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatClient {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		//����socket����
		Socket socket = new Socket("192.168.42.22", 10012);
		//�����ַ���
		InputStreamReader isr = new InputStreamReader(System.in);
		//�ַ�����װbbuf
		BufferedReader bufr = new BufferedReader(isr);
		
		//�������������
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
