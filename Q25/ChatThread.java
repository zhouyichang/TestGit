package zyc.develop.Q25;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ChatThread implements Runnable{
	private Socket socket ;
	public ChatThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		
		try {
			//创建输入流
			InputStreamReader isr = new InputStreamReader(socket.getInputStream());
			//包装字符流
			BufferedReader bufr = new BufferedReader(isr);
					
			String line = null;
			while ((line=bufr.readLine())!=null){
				if("over".equals(line)){
					break;
				}
				System.out.println(line);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(socket!=null){
				try {
					socket.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
		
		
		
	}

}
