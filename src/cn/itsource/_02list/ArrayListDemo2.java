package cn.itsource._02list;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add("’≈—Ô");
		list1.add("Œ‚∑≤");
		list1.add("ø≠…‰1");
		list1.add("ø≠…‰2");
		list1.add("ø≠…‰3");
		list1.add("ø≠…‰4");
		list1.add(20);
		list1.add(5);
		
		list1.set(3, "–°«ø");
		list1.remove(2);
		list1.remove("Œ‚∑≤");
		System.out.println(list1);
		System.out.println(list1.size());
		System.out.println(list1.contains("–°«ø"));
		System.out.println(list1.contains("’≈—Ô"));
		
//		list1.remove(20);
		list1.remove(new Integer(20));
		System.out.println(list1);
	}

}
