package com.orilore.lr.test1;

import java.util.HashSet;

public class HashSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		HashSet<Student> set=new HashSet<Student>();
		
		Student a1=new Student("1313","li");
		
		Student a2=new Student("1313","liu");
		
		Student a3=new Student("1313","li");
		
		set.add(a1);
		
		set.add(a2);
		
		System.out.println(set.size());
		
		System.out.println(a1.equals(a3));  //��һ�鸴д��д����
		
		set.add(a3);
		
		System.out.println(set.size());      //�ܽ� ��ArrayList�Ƚ�  HashSet�������ж�ѡ���Ƿ������ͬ����

		
		
		
		
		
		
	}

}
