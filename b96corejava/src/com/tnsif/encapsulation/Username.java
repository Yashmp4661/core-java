package com.tnsif.encapsulation;
import java.util.Scanner;
public class Username {
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("name:");
		String n=ob.nextLine();
		System.out.println("Enter the source:");
		String source=ob.nextLine();
		System.out.println("Enter the destination:");
		String destination=ob.nextLine();
		System.out.println("Dear " +n+", welcome onboard with service from " +source+" to " +destination+" Thank you for choosing Sky Airlines. Enjoy your flight.");
		
	}

}
