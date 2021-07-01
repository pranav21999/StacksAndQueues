package ds;

import ds.LinkList.Node;

public class StackQueue {

	//creating head node 
	Node head;

	class Node{
		Node next;
		int data;

	
		//constructor 
		public Node(int data) {
			super();
			this.next = next;
			this.data = data;
		}
	}
	
	//uc1 insert data in stack
	public void push(int data) 
	 {
		 Node newNode = new Node(data);
		 newNode.next = head;
		 head = newNode;
	 }
	//display stack
	public void print() 
	 {			 
		 Node temp = head;
		 while (temp != null)
		 {
			 System.out.print(temp.data + " -> ");
			 temp = temp.next;
		 }
		 System.out.println();
	 }
	




}
