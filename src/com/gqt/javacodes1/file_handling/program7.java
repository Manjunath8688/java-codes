package com.gqt.javacodes1.file_handling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class program7 {
	public static void main(String[] args) throws IOException {
		String p1="D:\\file handling\\v.mp4";
		String p2="D:\\file handling\\v1.mp4";
		FileInputStream fis= new FileInputStream(p1);
		BufferedInputStream bis=new BufferedInputStream(fis);
		int temp;
		FileOutputStream fos=new FileOutputStream(p2);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		while((temp=bis.read())!=-1) {
				bos.write(temp);
			
		}
		bis.close();
		bos.close();
		fos.close();
		fis.close();

	}

}