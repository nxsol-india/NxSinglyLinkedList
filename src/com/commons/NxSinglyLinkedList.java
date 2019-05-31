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
  
        deleteByKey(nxSinglyLinkList, 1); 
        printData(nxSinglyLinkList); 
        
        deleteByKey(nxSinglyLinkList, 4); 
        printData(nxSinglyLinkList); 
        
        deleteAtPos(nxSinglyLinkList, 0); 
        printData(nxSinglyLinkList); 
        
        deleteAtPos(nxSinglyLinkList, 2); 
        printData(nxSinglyLinkList); 
    } 
} 

