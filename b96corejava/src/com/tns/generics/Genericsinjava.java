package com.tns.generics;

import java.util.ArrayList;

public class Genericsinjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList list=new ArrayList();
		ArrayList<String> list=new ArrayList<String>();
		list.add("Java");
		//list.add(123);
		for(Object object:list)
		{
			String str = (String) object;
			System.out.println(str);
		}
		
		

	}

}
