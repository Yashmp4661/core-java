package com.tns.lamdaexpression;

import java.util.ArrayList;
import java.util.Scanner;

public class LamdaCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList<Integer> li=new ArrayList<>();
		li.add(22);
		li.add(36);
		li.add(44);
		li.forEach(e->System.out.println(e));*/
		Scanner scan = new Scanner(System.in);
		System.out.println("number");
		int num = scan.nextInt();
		Factorial c=(n)->{
			int f=1;
			for(int i=1;i<=n;i++) {
				f=f*i;
			}
			return f;
		};
		int number = c.fact(num); 
		System.out.println("factorial = "+number);
	}
		
		

	}


