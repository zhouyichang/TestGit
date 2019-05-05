package zyc.develop.Q24;

import java.io.*;

public class StringCutTest {
	
	public static void main(String[] args)throws IOException {
		String str = "";
		int len = str.getBytes("gbk").length;
		for (int i = 0; i < len; i++) {
			System.out.println("截取第“+(i+1)+”个字节"+cutStringByByte(str,(i+1)));
		}
	}
	
	public static String cutStringByByte(String str,int len)throws IOException{
		byte[] buf = str.getBytes("gbk");
		int count = 0;
		for (int i = len-1; i >=0; i--) {
			if(buf[i]<0){
				count++;
			}else
				break;
		}
		if(count%2==0){
			return new String(buf,0,len,"gbk");
		}else
			return new String(buf,0,len-1,"gbk");
	}

}
