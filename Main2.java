package com.orilore.lr.test1;

import java.util.ArrayList;

import java.util.Iterator;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>(); // �̶�������

		list.add(1);

		list.add(2);

		list.add(100); // ����������ڻ�����ô����

//		for (int i = 0; i <= list.size() - 1; i++) {
//
//			// Integer a1=ArrayList<Integer> List(i);
//
//			Integer a1 = list.get(i);       // ����Ҫ��list.get();
//
//			System.out.println(a1);
//
//		}
//
//		Iterator<Integer> a = list.iterator();
//
//		while (a.hasNext()) {
//
//			Integer b = a.next();
//
//			System.out.println(b);
//
//		}

		for (Object r : list) {             //�����
			

			System.out.println(r);

		}

	}

}
