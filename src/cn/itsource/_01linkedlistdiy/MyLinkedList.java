package cn.itsource._01linkedlistdiy;

public class MyLinkedList {
	private Node first;
	private int size = 0;
	
	/**
	 * ��ӷ���������һ�����һ��Ԫ��
	 * 	���裺
	 * 		1���Ѵ����ele��װ��һ��Node����
	 * 		2���ж�first�Ƿ�Ϊ��
	 * 			��  	�� �״���Ӷ���   --�� ֱ�Ӱ��µ�Node�����ַ��first
	 * 			�ǿ�	�� ˵����һЩ�����ˣ����Ѿ������ˣ�
	 * 				  �ѵ�ǰ����Node���ӵ���������һ�������ϣ��ҵ�������������һ��Node����
	 */
	public void add(Object ele){
		Node node = new Node(ele);
		if(first==null){
			first = node;
		}else{
			//�ѵ�ǰ����Node���ӵ���������һ�������ϣ��ҵ�������������һ��Node����
			/*
			 * ����һ���յ�Node��������������ָ��ÿһ��Node����
			 * ʹ��ѭ���ҵ����һ����
			 * 		��ʱ��ֹѭ��tempָ���Node�����nΪnull
			 * 		ѭ���壺��tempָ����һ��Node
			 */
			Node temp = first;
			while(temp.n != null){
				temp = temp.n;
			}
			//��ѭ��ָ���꣨��ʱ��ֹѭ��tempָ���Node�����nΪnull�� ˵����ǰ��tempָ�����һ��Node����
			//�ѵ�ǰ�û�׼����ӵĶ���node ��ֵ��temp.n
			temp.n = node;
		}
		
		size++;
	}
	
	public int getSize(){
		return this.size;
	}
	
	/**
	 * ��������ṹ��ȡ��ÿһ���û���ӵ����ݣ�Node.obj��ƴ�ӳ�һ���ַ���������
	 */
	@Override
	public String toString() {
		String str = "[";
		
		/*��������ṹ*/
		Node temp = first;
		while(temp != null){
			// �ж��Ƿ������һ��Node
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
	 * ����ָ����������Ԫ��
	 *	ʹ��forѭ����ͨ��ָ����ѭ��������ȷ����Ӧ��Ԫ��
	 *	����  ����Ϊ2
	 */
	public Object getElementByIndex(int index){
		if(index<0 || index>=size){
			throw new ArrayIndexOutOfBoundsException("����Խ��");
		}
		Node temp = first;
		for(int i=0;i<index;i++){
			temp = temp.n;
		}
		return temp.obj;
	}
	
	/**
	 * ����ָ��Ԫ�ص�һ�γ��ֵ�����
	 * @author Administrator
	 *
	 */
	public int getFirstIndex(Object ele){
		int i = 0;
		/*��������ṹ*/
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
	 * ɾ��ָ����Ԫ�أ�����ж��ɾ����һ��
	 * @author Administrator
	 *
	 */
	public void delete(Object ele){
		// �ҵ�ָ����Ԫ��
		/*��������ṹ*/
		Node temp = first;
		// ����ǿ�������ֱ�ӷ���
		if(size==0){
			return;
		}
		
		// ����Ҫɾ���ľ��ǵ�һ��
		if(temp.obj.equals(ele)){
			first = temp.n;
			return;
		}
		
		Node shangYiGe = first;
		while(temp != null){
			if(temp.obj.equals(ele)){
				// ��temp�ĺ�һ��Ԫ�ص�ַ��ֵ��temp��ǰһ��Node��n
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
