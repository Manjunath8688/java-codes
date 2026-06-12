package com.gqt.javacodes1.file_handling;

import java.io.File;
import java.io.IOException;

public class file_inbuiltfunctions {
	public static void main(String[] args) throws IOException {
		
	
	String p1="D:\\file handling\\file1.txt";
	File f1=new File(p1);
	f1.createNewFile();//create the file specified in the path
	System.out.println(f1.exists());//checks if the file in the present or not
	System.out.println(f1.canExecute());//check if the file is have execute rights or not
	System.out.println(f1.canWrite());//check if the file have write access or not
	System.out.println(f1.canRead());
	System.out.println(f1.getAbsoluteFile());
	System.out.println(f1.getCanonicalPath());
	System.out.println(f1.getFreeSpace());
	System.out.println(f1.getName());
	System.out.println(f1.getParent());
	System.out.println(f1.getPath());
	System.out.println(f1.getTotalSpace());
	System.out.println(f1.getUsableSpace());
	System.out.println(f1.hashCode());
	System.out.println(f1.isAbsolute());
	System.out.println(f1.isDirectory());
	System.out.println(f1.isFile());
	System.out.println(f1.isHidden());
	File f2=new File("D:\\file handling\\hidden.txt");
	System.out.println(f2.isHidden());
	System.out.println(f1.lastModified());
	System.out.println(f1.length());
//	File f3=new File("D:\\file handling\\File2.txt");
//	System.out.println(f1.renameTo(f3));
//	System.out.println(f1.exists());
}
}