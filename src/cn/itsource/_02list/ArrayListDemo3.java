package cn.itsource._02list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add("����");
		list1.add("�ⷲ");
		list1.add("����1");
		list1.add("����2");
		list1.add("����3");
		list1.add("����4");
		
		System.out.println(list1);
		// ��ÿһλͬѧ����һ������
		// ��ʽһ�� ��ͨforѭ��
//		for(int i=0;i<list1.size();i++){
//			System.out.println(list1.get(i)+"���ش������");
//		}
		
		/*
		 *  ��ʽ���� ��ǿforѭ��  foreach
		 *  �﷨��
		 *  	for(Դ�е�Ԫ������ e : Դ){
		 *  		
		 *  	}
		 *  	Դ��  ������߼��ϣ�Iterable��ʵ����
		 */
//		for (Object o : list1) {
//			System.out.println(o);
//		}
		
		/*
		 * ArrayListʵ����Iterable�ӿڣ��˽ӿ�����һ�������� iterator   ,���ܹ�����һ��������
		 * ����Ĵ���͵��ôη������صõ��˵�����
		 */
		Iterator it = list1.iterator();
		
		/*
		 * ��������ʲô�� ��ʲô���أ�
		 * ����ʹ�������it������ArrayList  list1
		 * ���⣺ ��ô���أ� ���ʹ�õ�����������  ---�� ��Iterator���ĵ�
		 * 		boolean hasNext() �������Ԫ�ؿ��Ե������򷵻� true��   �ж��Ƿ�����һ��Ԫ��
 				Object next() ���ص�������һ��Ԫ�ء� 
 				void remove() �ӵ�����ָ��� collection ���Ƴ����������ص����һ��Ԫ�أ���ѡ�������� 

		 */
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		
		// ���˫��ĵ�����
		ListIterator it2 = list1.listIterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
		
		System.out.println("--------------------");
		while(it2.hasPrevious()){
			System.out.println(it2.previous());
		}
		
	}

}
