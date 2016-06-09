package com.orilore.lr.test1;

import java.util.LinkedList;

import java.util.Iterator;

public class Main3 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		LinkedList<Student> l1=new LinkedList<Student>();
		
		Student a1=new Student("1313","wang");
		
		Student a2=new Student("1314","lee");		
		
		Student a3=new Student("1315","zhang");
		
		Student a4=new Student("1316","liu");
		
		l1.add(a1);
		
		l1.add(a2);

		l1.addLast(a3);
		
		l1.addFirst(a4);    //相比较ArrayList多了 addFirst  addLast
		
//		l1.remove(0);
//		
//		l1.remove(0);
//
//		l1.removeLast();
//		
		for(Student x:l1){
			
			System.out.println(x.getName());
			
		}
		
	}

}
