
public class ReversedLinkedList {

	static class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	static public Node reverse(Node head)
	{
		Node pre=null;
		Node current=head;
		Node next=null;
		
		while(current!=null)
		{
			next=current.next;//storing next node
			current.next=pre;//reversing the link
			pre=current;//move previous to current
			current=next;//move to the next node
		}
		
		return pre;//new head 
	}
	
   static public void printList(Node head)
   {
	   Node current=head;
	   
	   while(current!=null)
	   {
		   System.out.print(current.data+" ");
		   current=current.next;
	   }
	   
	   System.out.println();
   }
	
	
	public static void main(String[] args) {
		
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		head.next.next.next.next=new Node(5);
		
		System.out.println();
		
		printList(head);
		head=reverse(head);
		printList(head);
		
	}

}
