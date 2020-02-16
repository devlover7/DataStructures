package prim.linkedlist;

public class LinkedList {

	Node root;
	
	static class Node
	{
		Node next;
		int value;
		
		Node(int input)
		{
			this.value = input;
			this.next= null;
		}
		
	}
}
