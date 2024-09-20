package com.tnsif.threads;

public class Fisrtway extends Thread{
	public void run() {
		System.out.println("Creation of thread by extending thread class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Fisrtway ob=new Fisrtway();
       
       ob.start();//runnable
       ob.stop();
       
	}

}
