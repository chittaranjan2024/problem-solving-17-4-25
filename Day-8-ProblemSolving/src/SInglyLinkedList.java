//head--> [12,next]---->[23,next]----->[77,next]--->[67,next]---->[34, next]-->[25,next]

import java.awt.DisplayMode;

class Node
{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}


public class SInglyLinkedList {
	
	Node head;
	
	public void insertAtBeginning(int data)
	{
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
		
	}
	
	public void insertAtTheEnd(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			return;
		}
		
		Node tmp=head;
		while(tmp.next!=null)
		{
			tmp=tmp.next;
		}
		tmp.next=newNode;
	}
	
	
	public void insertAtPosition(int data, int position)
	{
		if(position<1)
		{
			System.out.println("Invalid position");
			return;
		}
		if(position==1)
		{
			insertAtBeginning(data);
			return;
		}
		
		Node newNode=new Node(data);
		
		Node temp=head;
		for(int i=1;temp!=null && i<position-1;i++)
		{
			temp=temp.next;
		}
		
		
		if(temp ==null)
		{
			System.out.println("Position out of bounds");
			return;
		}
		
		newNode.next=temp.next;
		temp.next=newNode;
		
	}
	
	
	public void deleteFromBeginning()
	{
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		
		head=head.next;
	}
	
	public void deleteFromLast()
	{
		if(head==null)
		{
			System.out.println("List is empty!!");
			return;
		}
		
		if(head.next==null)
		{
			head=null;
			return;
		}
		
		Node tmp=head;
		while(head.next.next!=null)
		{
			tmp=tmp.next;
		}
		
		tmp.next=null;
	}
	
	
	public void deleteAtPosition(int position)
	{
		if(position<1 || head==null)
		{
		  System.out.println("Invalid position or List is empty");	
		  return;
		}
		if(position==1)
		{
			head=head.next;
			return;
		}
		Node tmp=head;
		for(int i=1;i<position-1 && tmp!=null;i++)
		{
			tmp=tmp.next;
		}
		
		if(tmp==null||tmp.next==null)
		{
			System.out.println("Position is out of bounds!");
			return;
		}
		
		tmp.next=tmp.next.next;
		
	}
	
	
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
		System.out.println("Null");
	}

	public static void main(String[] args) {
	
		SInglyLinkedList list=new SInglyLinkedList();
		list.insertAtBeginning(11);
		list.insertAtTheEnd(78);
		list.insertAtPosition(55, 2);
		
		list.display();
		
		list.deleteAtPosition(1);
		list.display();
		
		list.deleteFromBeginning();
		list.display();
		
		list.deleteFromLast();
		list.display();
		
		
		
	}

}
