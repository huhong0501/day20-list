package cn.itsource._02list;

import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.pop());
//		}
		/*
		 * 本意想弹出所有的元素，弹的次数应该size次  5次
		 * 循环本应该循环5次
		 * 但是弹出一个后size就变了，实际循环没有循环5次
		 */
		int len = list.size();
		for (int i = 0; i < len; i++) {
			System.out.println(list.pop());
		}
		
		System.out.println(list);
		
	}

}
