package cn.itsource._01linkedlistdiy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add("1111");
		arr.add("zhangsan");
		arr.add("111...1");
		arr.add("1111a1");
	//	arr.clear();

		//正向迭代
		ListIterator listiterator = arr.listIterator();
		while (listiterator.hasNext()){
			System.out.println(listiterator.next());
		}
		//反向迭代
		while (listiterator.hasPrevious()){
			System.out.println(listiterator.previous());
		}
		ArrayList arr1 = new ArrayList();
		arr1.add("qqq");
		arr1.add("vvv");
		arr1.add("ccc");
		//对列表进行浅复制
		ArrayList arr2 = (ArrayList) arr1.clone();
		arr2.remove(1);
		System.out.println(arr);
		System.out.println(arr1);
		System.out.println(arr2);
		//返回指定元素在表中出现的第一次索引
		System.out.println(arr1.indexOf("vvv"));
		System.out.println(arr.size());
	}
 
}
