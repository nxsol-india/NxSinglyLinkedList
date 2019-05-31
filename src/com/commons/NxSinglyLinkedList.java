package com.commons;

public class NxSinglyLinkedList { 

	Node head; // head of list 
	static class Node { 

		int data; 
		Node next; 

		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 

	// **************INSERTION************** 

	public static NxSinglyLinkedList insert(NxSinglyLinkedList list, int data) 
	{ 
		Node new_node = new Node(data); 
		new_node.next = null; 

		if (list.head == null) { 
			list.head = new_node; 
		} 
		else { 
			Node last = list.head; 
			while (last.next != null) { 
				last = last.next; 
			} 

			last.next = new_node; 
		} 


		System.out.println(data + " inserted."); 
		return list; 
	} 

	// **************TRAVERSAL************** 

	// Method to print the LinkedList. 
	public static void printData(NxSinglyLinkedList list) 
	{ 
		Node currNode = list.head; 

		System.out.print("\n Now, NxSinglyLinkedList: "); 

		while (currNode != null) { 
			System.out.print(currNode.data + " "); 
			currNode = currNode.next; 
		} 
		System.out.println("\n"); 
	} 

	// **************DELETION BY KEY************** 
	public static NxSinglyLinkedList deleteByKey(NxSinglyLinkedList list, int key) 
	{ 
		Node currNode = list.head, prev = null; 
		if (currNode != null && currNode.data == key) { 
			list.head = currNode.next; // Changed head 
			System.out.println(key + " found and deleted"); 
			return list; 
		} 
		while (currNode != null && currNode.data != key) { 
			prev = currNode; 
			currNode = currNode.next; 
		} 
		if (currNode != null) { 
			prev.next = currNode.next; 
			System.out.println(key + " found and deleted"); 
		} 
		if (currNode == null) { 
			System.out.println(key + " not found"); 
		} 
		return list; 
	} 

	// **************DELETION AT A POSITION************** 

	public static NxSinglyLinkedList deleteAtPos(NxSinglyLinkedList list, int index) 
	{ 
		Node currNode = list.head, prev = null; 

		if (index == 0 && currNode != null) { 
			list.head = currNode.next; // Changed head 
			System.out.println(index + " position element deleted"); 
			return list; 
		} 
		int counter = 0; 
		while (currNode != null) { 
			if (counter == index) { 
				prev.next = currNode.next; 
				System.out.println(index + " position element deleted"); 
				break; 
			} 
			else { 
				prev = currNode; 
				currNode = currNode.next; 
				counter++; 
			} 
		} 
		if (currNode == null) { 
			System.out.println(index + " position element not found"); 
		} 

		return list; 
	} 

	public static Node removeTailNode(NxSinglyLinkedList nxSinglyLinkedList) 
	{ 

		Node head = nxSinglyLinkedList.head;

		if (head == null) 
			return null; 

		if (head.next == null) { 
			return null; 
		} 

		// Find the second last node 
		Node second_last = head; 
		while (second_last.next.next != null) 
			second_last = second_last.next; 

		// Change next of second last 
		second_last.next = null; 
		System.out.println("Remove Tail node");
		return head; 
	} 

	public static Node removeNodes(Node start, int x) {
		System.out.println("Remove All node is grater than : "+x);
		if(start == null) return start;

		if(start.data > x && start.next == null) return null;

		//find first head node
		Node cur = start;
		Node prev = null;

		//4,5,3,2,1,6 --- where x = 2
		while(cur != null && cur.data > x) {
			prev = cur;
			cur = cur.next;
		}

		if(prev != null) prev.next = null;

		Node newHead = cur;

		while(cur.next != null) {
			if(cur.next.data > x) {
				cur.next = cur.next.next;
			} else {
				cur = cur.next;
			}
		}

		return newHead;
	}


	// **************MAIN METHOD************** 
	public static void main(String[] args) 
	{ 
		NxSinglyLinkedList nxSinglyLinkList = new NxSinglyLinkedList(); 
		printData(nxSinglyLinkList); 

		nxSinglyLinkList = insert(nxSinglyLinkList, 1); 
		printData(nxSinglyLinkList); 

		nxSinglyLinkList = insert(nxSinglyLinkList, 2); 
		printData(nxSinglyLinkList); 

		nxSinglyLinkList = insert(nxSinglyLinkList, 3); 
		printData(nxSinglyLinkList); 

		nxSinglyLinkList = insert(nxSinglyLinkList, 4); 
		printData(nxSinglyLinkList); 

		nxSinglyLinkList = insert(nxSinglyLinkList, 5); 
		printData(nxSinglyLinkList); 

		nxSinglyLinkList = insert(nxSinglyLinkList, 6); 
		printData(nxSinglyLinkList); 

		nxSinglyLinkList = insert(nxSinglyLinkList, 7); 
		printData(nxSinglyLinkList); 

		nxSinglyLinkList = insert(nxSinglyLinkList, 8); 
		printData(nxSinglyLinkList); 

		removeTailNode(nxSinglyLinkList);
		printData(nxSinglyLinkList); 

		removeNodes(nxSinglyLinkList.head, 5);
		printData(nxSinglyLinkList); 

	} 
} 

