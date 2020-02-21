package cn.itsource._02list;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(123);
		list1.add(13);
		list1.add("aaa");
		list1.add(2, "¹ş¹ş¹ş");
		
		System.out.println(list1);
		System.out.println(list1.size());
		
		ArrayList list2 = new ArrayList();
		list2.add("22");
		list2.add("33");
		
//		list1.addAll(list2);
		list1.add(list2);
		
		System.out.println(list1);
		System.out.println(list1.size());
	}

}
