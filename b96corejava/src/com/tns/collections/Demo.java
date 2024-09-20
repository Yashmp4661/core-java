package com.tns.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Laptop>laps=new ArrayList<Laptop>();
		laps.add(new Laptop("dell",1550,12));
		laps.add(new Laptop("hp",155,9));
		laps.add(new Laptop("mac",155000,10));
		Collections.sort(laps);
		for(Laptop l: laps) {
			System.out.println(l);
		}
		
	}

}
