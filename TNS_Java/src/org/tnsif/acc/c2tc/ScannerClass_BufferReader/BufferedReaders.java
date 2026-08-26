package org.tnsif.acc.c2tc.ScannerClass_BufferReader;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class BufferedReaders {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader ("C:\\Users\\Admin\\OneDrive\\Desktop\\Java Fullstack\\demo.txt"));
		String data="";
		while((data=br.readLine())!=null)
		{
			System.out.println(data);
		}
		br.close();
}

}