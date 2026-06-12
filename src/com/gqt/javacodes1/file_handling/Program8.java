package com.gqt.javacodes1.file_handling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		try {
			String p1="D:\\file handling\\File1.txt";
			FileWriter fw=new FileWriter(p1);
			fw.write("hello welcome to gqt");
			fw.close();
			System.out.println("reading the data from the file: ");
			FileReader fr=new FileReader(p1);
			Scanner sc=new Scanner(fr);
			while(sc.hasNextLine()) {
				String temp=sc.next();
				System.out.print(temp);
				
			}
			sc.close();
			fr.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
