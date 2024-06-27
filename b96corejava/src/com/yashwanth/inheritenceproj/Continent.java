package com.yashwanth.inheritenceproj;

public class Continent {
String name;
int area;
public Continent() {
	super();
}
public Continent(String name, int area) {
	super();
	this.name = name;
	this.area = area;
}
@Override
public String toString() {
	return "Continent [name=" + name + ", area=" + area + "]";
}


}
