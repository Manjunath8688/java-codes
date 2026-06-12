package com.gqt.package_2.shocket;


import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {

	public static void main(String[] args) throws IOException {
		ServerSocket listener = new ServerSocket(4000);
		Socket ssoc=listener.accept();
		InputStream is = ssoc.getInputStream();
		DataInputStream dis = new DataInputStream(is);
	
		
		String message = dis.readUTF();
		System.out.println(message);
		
		

	}

}
