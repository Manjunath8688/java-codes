package com.gqt.javacodes1.file_handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class program3 {

	public static void main(String[] args) throws IOException {
		String p1="D:\\file handling\\input2.txt";
		String p2="D:\\file handling\\output2.txt";
		FileReader fr= new FileReader(p1);
		BufferedReader br=new BufferedReader(fr);
		int temp;
		FileWriter fw=new FileWriter(p2);
		BufferedWriter bw=new BufferedWriter(fw);
		while((temp=fr.read())!=-1) {
			fw.write(temp);
			
		}
		br.close();
		bw.close();
		fw.close();
		fr.close();

	}

}
