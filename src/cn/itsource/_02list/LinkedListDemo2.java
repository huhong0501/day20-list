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
		 * �����뵯�����е�Ԫ�أ����Ĵ���Ӧ��size��  5��
		 * ѭ����Ӧ��ѭ��5��
		 * ���ǵ���һ����size�ͱ��ˣ�ʵ��ѭ��û��ѭ��5��
		 */
		int len = list.size();
		for (int i = 0; i < len; i++) {
			System.out.println(list.pop());
		}
		
		System.out.println(list);
		
	}

}
