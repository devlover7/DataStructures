package prim.linkedlist.doublelinkedlist;

public class DoubleLinkedList {

	Node root;
	
	static class Node
	{
		Node next;
		Node previous;
		int value;
		Node(int input)
		{
			
			this.value= input;
			next = previous = null;
		}
			
	}
	
	
}
