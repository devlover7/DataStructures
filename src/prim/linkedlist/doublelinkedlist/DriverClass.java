package prim.linkedlist.doublelinkedlist;

import prim.linkedlist.doublelinkedlist.DoubleLinkedList.Node;

public class DriverClass 
{
	public static void main(String[] args) {
		DoubleLinkedList doublelinkedlist = new DoubleLinkedList();
		doublelinkedlist.root = new Node(1);
		Node rootnode = doublelinkedlist.root;
		doublelinkedlist.root.next = new Node(2);
		Node firstnode = doublelinkedlist.root.next;
		firstnode.previous = doublelinkedlist.root;
		System.out.println(rootnode.value);
		System.out.println(firstnode.value);
		System.out.println(firstnode.previous.value);
	}

}
