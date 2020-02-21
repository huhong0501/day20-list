package cn.itsource._02list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add("张扬");
		list1.add("吴凡");
		list1.add("凯射1");
		list1.add("凯射2");
		list1.add("凯射3");
		list1.add("凯射4");
		
		System.out.println(list1);
		// 给每一位同学发放一个礼物
		// 方式一： 普通for循环
//		for(int i=0;i<list1.size();i++){
//			System.out.println(list1.get(i)+"神秘大礼包！");
//		}
		
		/*
		 *  方式二： 增强for循环  foreach
		 *  语法：
		 *  	for(源中的元素类型 e : 源){
		 *  		
		 *  	}
		 *  	源：  数组或者集合（Iterable的实例）
		 */
//		for (Object o : list1) {
//			System.out.println(o);
//		}
		
		/*
		 * ArrayList实现了Iterable接口，此接口中有一个方法叫 iterator   ,它能够返回一个迭代器
		 * 下面的代码就调用次方法返回得到了迭代器
		 */
		Iterator it = list1.iterator();
		
		/*
		 * 迭代器是什么？ 有什么用呢？
		 * 可以使用上面的it来遍历ArrayList  list1
		 * 问题： 怎么用呢？ 如何使用迭代器来遍历  ---》 看Iterator的文档
		 * 		boolean hasNext() 如果仍有元素可以迭代，则返回 true。   判断是否有下一个元素
 				Object next() 返回迭代的下一个元素。 
 				void remove() 从迭代器指向的 collection 中移除迭代器返回的最后一个元素（可选操作）。 

		 */
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		
		// 获得双向的迭代器
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
