//Time complexity:0(1)
//Spcace complexity:

import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
  
    Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
          data=d;
          next=null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node nnode=new Node(data);
        nnode.next=null;
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head==null)
        {
          list.head=nnode;
        }
        else
        {
            Node last = list.head;
            while (last.next != null) 
            {
              last = last.next;
            }

              // Insert the new_node at last node 
            last.next = nnode;
        }
        // Return the list by head 
      return list;
        
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        Node currNode = list.head;
        // Traverse through the LinkedList 
        while (currNode != null) 
        {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
  
        // Print the LinkedList 
        printList(list); 
    } 
}
