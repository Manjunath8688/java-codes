package com.gqt.javacodes1.file_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program1 {
public static void main(String[] args) throws IOException {
	String p1="D:\\file handling\\input1.txt";
	String p2="D:\\file handling\\output11.txt";
	FileInputStream fis= new FileInputStream(p1);
	int temp;
	FileOutputStream fos=new FileOutputStream(p2);
	while((temp=fis.read())!=-1) {
		fos.write(temp);
	}
	fos.close();
	fis.close();
}
}
