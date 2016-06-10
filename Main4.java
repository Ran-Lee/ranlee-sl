package com.orilore.lr.test1;

import java.util.TreeSet;

import java.util.Iterator;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SelfComparator s=new SelfComparator();

		TreeSet<Student> set=new TreeSet<Student>(s);  //treeset  的优势可以排序
		
		Student a1=new Student("1313","Li");
		
		Student a2=new Student("1314","wang");
		
		Student a3=new Student("1315","liu");
		
		set.add(a1);
		
		set.add(a2);
		
		set.add(a3);
		
		
        Iterator<Student> iter=set.iterator();
        
        while(iter.hasNext()){
        	
        	Student s1=iter.next();
        	
        	System.out.println(s1.getNumber()+"   "+s1.getName());
		
        }
	}

	
		
	
}
