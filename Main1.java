package com.orilore.lr.test1;

import java.util.ArrayList;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a1=new ArrayList();
		
		ArrayList a2=new ArrayList();
		
		a1.add("Hello");
		
		a1.add("java");
		
		a1.add("world!!!");
		
		a1.addAll(2,a1);        // �Լ������Լ������� ������
//		
//		System.out.println(a1);
//		
//		a1.remove(0);        
//		
//		a1.remove(0);        //ÿ��ɾ��һ���±���ƶ�һ��
//		
//		a1.remove(3);
//		
//		System.out.println(a1);
		
		a2.add("hello");
		
		a2.add("java");
		
		a2.add("world!!!");
		
		a2.addAll(3,a2);
		
		a2.addAll(a1);
		
		System.out.println(a2.size());
		
		a2.remove("Hello");      //һ��ɾ��һ��
		
		a2.remove("Hello");
		
		a2.removeAll(a1);        //why?
		
		
		
		System.out.println(a2);    //�����������[hello,hello]   ���ɱ���
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
