package cn.itsource._02list;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add("����");
		list1.add("�ⷲ");
		list1.add("����1");
		list1.add("����2");
		list1.add("����3");
		list1.add("����4");
		list1.add(20);
		list1.add(5);
		
		list1.set(3, "Сǿ");
		list1.remove(2);
		list1.remove("�ⷲ");
		System.out.println(list1);
		System.out.println(list1.size());
		System.out.println(list1.contains("Сǿ"));
		System.out.println(list1.contains("����"));
		
//		list1.remove(20);
		list1.remove(new Integer(20));
		System.out.println(list1);
	}

}
