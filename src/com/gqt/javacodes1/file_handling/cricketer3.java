//package file_handling;
//
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectOutputStream;
//import java.io.Serializable;
//
//class cricketer implements Serializable{
//	String name;
//	String country;
//	transient int runs;
//	int wickets;
//	transient int catches;
//	
//	public cricketer(String name,String country,int runs,int wickets,int catches) {
//		super();
//		this.name=name;
//		this.country=country;
//		this.runs=runs;
//		this.wickets=wickets;
//		this.catches=catches;
//		
//	}
//	void display() {
//		System.out.println(name);
//		System.out.println(country);
//		System.out.println(runs);
//		System.out.println(wickets);
//		System.out.println(catches);
//	}
//}
//
//
//
//public class cricketer3 {
////selective serialization
//
//	public static void main(String[] args) throws IOException {
//		cricketer c1=new cricketer("rohit","ind",1000,30,400);
//		c1.display();
//		String p1="D:\\file handling\\criketer.txt";
//		FileOutputStream fos=new FileOutputStream(p1);
//		ObjectOutputStream oos=new ObjectOutputStream(fos);
//		oos.writeObject(c1);
//		
//
//	}
//
//}
package com;


