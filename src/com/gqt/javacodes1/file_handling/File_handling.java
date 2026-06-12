package com.gqt.javacodes1.file_handling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_handling {

	public static void main(String[] args) throws IOException {
		String p1="D:\\file handling\\input1.txt";
		String p2="D:\\file handling\\output1.txt";
		FileReader fr= new FileReader(p1);
		int temp;
		FileWriter fw=new FileWriter(p2);
		while((temp=fr.read())!=-1) {
			fw.write(temp);
			
		}
		fw.close();
		fr.close();

	}

}
