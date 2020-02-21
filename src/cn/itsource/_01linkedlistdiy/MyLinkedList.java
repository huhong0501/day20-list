package cn.itsource._01linkedlistdiy;

public class MyLinkedList {
	private Node first;
	private int size = 0;
	
	/**
	 * 添加方法，调用一次添加一个元素
	 * 	步骤：
	 * 		1、把传入的ele封装成一个Node对象
	 * 		2、判断first是否为空
	 * 			空  	： 首次添加对象   --》 直接把新的Node对象地址给first
	 * 			非空	： 说明有一些对象了（链已经存在了）
	 * 				  把当前的新Node链接到链表的最后一个对象上（找到整个链表的最后一个Node对象）
	 */
	public void add(Object ele){
		Node node = new Node(ele);
		if(first==null){
			first = node;
		}else{
			//把当前的新Node链接到链表的最后一个对象上（找到整个链表的最后一个Node对象）
			/*
			 * 定义一个空的Node变量，用来依次指向每一个Node对象
			 * 使用循环找到最后一个，
			 * 		何时终止循环temp指向的Node对象的n为null
			 * 		循环体：让temp指向下一个Node
			 */
			Node temp = first;
			while(temp.n != null){
				temp = temp.n;
			}
			//当循环指向完（何时终止循环temp指向的Node对象的n为null） 说明当前的temp指向最后一个Node对象
			//把当前用户准备添加的对象node 赋值给temp.n
			temp.n = node;
		}
		
		size++;
	}
	
	public int getSize(){
		return this.size;
	}
	
	/**
	 * 遍历链表结构，取出每一个用户添加的数据（Node.obj）拼接成一个字符串并返回
	 */
	@Override
	public String toString() {
		String str = "[";
		
		/*遍历链表结构*/
		Node temp = first;
		while(temp != null){
			// 判断是否是最后一个Node
			if(temp.n==null){
				str += temp.obj;
			}else{
				str += temp.obj + ",";
			}
			temp = temp.n;
		}
		
		
		
		str += "]";
		return str;
	}
	
	/**
	 * 查找指定索引处的元素
	 *	使用for循环，通过指定的循环次数来确定对应的元素
	 *	假设  索引为2
	 */
	public Object getElementByIndex(int index){
		if(index<0 || index>=size){
			throw new ArrayIndexOutOfBoundsException("索引越界");
		}
		Node temp = first;
		for(int i=0;i<index;i++){
			temp = temp.n;
		}
		return temp.obj;
	}
	
	/**
	 * 查找指定元素第一次出现的索引
	 * @author Administrator
	 *
	 */
	public int getFirstIndex(Object ele){
		int i = 0;
		/*遍历链表结构*/
		Node temp = first;
		while(temp != null){
			if(temp.obj.equals(ele)){
				return i;
			}
			temp = temp.n;
			i++;
		}
		
		return -1;
	}
	
	/**
	 * 删除指定的元素，如果有多个删除第一个
	 * @author Administrator
	 *
	 */
	public void delete(Object ele){
		// 找到指定的元素
		/*遍历链表结构*/
		Node temp = first;
		// 如果是空容器，直接返回
		if(size==0){
			return;
		}
		
		// 并且要删除的就是第一个
		if(temp.obj.equals(ele)){
			first = temp.n;
			return;
		}
		
		Node shangYiGe = first;
		while(temp != null){
			if(temp.obj.equals(ele)){
				// 把temp的后一个元素地址赋值给temp的前一个Node的n
				shangYiGe.n = temp.n;
			}
			shangYiGe = temp;
			temp = temp.n;
		}
		
		size--;
		
	}
	 
	
	
	private class Node {
		private Object obj;
		private Node n;

		public Node(Object obj) {
			super();
			this.obj = obj;
		}

		public Object getObj() {
			return obj;
		}

		public void setObj(Object obj) {
			this.obj = obj;
		}

		public Node getN() {
			return n;
		}

		public void setN(Node n) {
			this.n = n;
		}
		
	}
}
