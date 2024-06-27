package com.yashwanth.inheritenceproj;

public class State extends Country {
	 String statename;
	 String statecm;
	public State() {
		super();
	}
	public State(String name, int area, int countrynumber, int countrypopulation,String statename,String statecm) {
		super(name, area, countrynumber, countrypopulation);
		// TODO Auto-generated constructor stub
		this.statename=statename;
		this.statecm=statecm;
		
	}
	@Override
	public String toString() {
		return "State [statename=" + statename + ", statecm=" + statecm + ", countrynumber=" + countrynumber
				+ ", countrypopulation=" + countrypopulation + ", name=" + name + ", area=" + area + "]";
	}
	
	}
