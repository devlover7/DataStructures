package prim.linkedlist;

import prim.linkedlist.LinkedList.Node;

public class DriverClass {
public static void main(String[] args) {

	LinkedList ll = new LinkedList();
	ll.root = new Node(1);
	ll.root.next = new Node (2);
	
	System.out.println(ll.root.value);
	System.out.println(ll.root.next.value);
}
}
