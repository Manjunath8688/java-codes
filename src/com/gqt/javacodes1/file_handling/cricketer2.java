package com.gqt.javacodes1.file_handling;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

class cricketer implements Serializable{
	String name;
	String country;
	int runs;
	int wickets;
	int catches;
	
	public cricketer(String name,String country,int runs,int wickets,int catches) {
		super();
		this.name=name;
		this.country=country;
		this.runs=runs;
		this.wickets=wickets;
		this.catches=catches;
		
	}
	void display() {
		System.out.println(name);
		System.out.println(country);
		System.out.println(runs);
		System.out.println(wickets);
		System.out.println(catches);
	}
}



public class cricketer2 {
//deserializable
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String p1="D:\\file handling\\criketer.txt";
		FileInputStream fis=new FileInputStream(p1);
		ObjectInputStream ois=new ObjectInputStream(fis);
		cricketer c1=(cricketer)ois.readObject();
		c1.display();
		

	}

}
