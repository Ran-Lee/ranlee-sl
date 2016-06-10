package com.orilore.lr.test1;

import java.util.Comparator;

public class SelfComparator implements Comparator<Student>{
	
	
	public int compare(Student a,Student b){
		
		int in1 = Integer.parseInt(a.getNumber());
		
		int in2 = Integer.parseInt(b.getNumber());
		
		if(in1>in2){
			
			return 100;
			
			
		}
		if(in1<in2){
			
			
			return -100;
			
		}
		
		return 0;
		
		
		
		
		
	}

	

}
