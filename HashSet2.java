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
		
		System.out.println(a1.equals(a3));  //第一遍复写都写错了
		
		set.add(a3);
		
		System.out.println(set.size());      //总结 和ArrayList比较  HashSet可以做判断选择是否添加相同对象

		
		
		
		
		
		
	}

}
