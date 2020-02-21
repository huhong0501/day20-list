package cn.itsource._02list;

import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("a");
		list.add("b");
		list.add("d");
		list.add("c");
		System.out.println(list);
		list.addFirst("ͷ");
		System.out.println(list);
//		System.out.println(list.getFirst());
//		System.out.println(list.element());
//		System.out.println(list.peek());
		
//		System.out.println(list.poll());
		System.out.println(list.pop());
		
		System.out.println(list);
		
	}

}
