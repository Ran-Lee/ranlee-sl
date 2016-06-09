package com.orilore.lr.test1;

public class Student {
	
	private String name;
	
	private String number;
	
	public Student(String number,String name){
		
		this.name=name;
		
		this.number=number;
	}
	public String getName(){
		
		return  name;
		
	}
	
	public String setName(String name){
		
		return this.name=name;
		
	}
	
	

}
