package com.yashwanth.inheritenceproj;

public class Country extends Continent{
	int countrynumber;
	int countrypopulation;
	public Country() {
		super();
	}
	public Country(String name, int area,int countrynumber,int countrypopulation) {
		super(name, area);
		// TODO Auto-generated constructor stub
		this.countrynumber = countrynumber;
		this.countrypopulation = countrypopulation;
	}
	@Override
	public String toString() {
		return "Country [countrynumber=" + countrynumber + ", countrypopulation=" + countrypopulation + ", name=" + name
				+ ", area=" + area + "]";
	}
	
	
	

}
