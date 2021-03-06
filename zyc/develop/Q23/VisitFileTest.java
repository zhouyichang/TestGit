package zyc.develop.Q23;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class VisitFileTest {
	
	
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bufr = new BufferedReader(isr);
		String line = null;
		line = bufr.readLine();
		File f = new File(line);
		listAll(f);
	}
	
	public static void listAll(File f)throws IOException{
		System.out.println(f.getName());
		File[] files = f.listFiles();
		for (int i = 0; i < files.length; i++) {
			if(files[i].isDirectory()){
				listAll(files[i]);
			}else{
				System.out.println(files[i].getName());
			}
		}
	}

}
