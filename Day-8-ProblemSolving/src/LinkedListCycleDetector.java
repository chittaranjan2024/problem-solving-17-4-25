
//Floyd's cycle detection
public class LinkedListCycleDetector {
 
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
	
	Node head;
	
	
	public static boolean hasCycle(Node head)
	{
		Node slow=head;
		Node fast=head;
		
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			
			if(slow==fast)
			{
				return true;
			}
			
		
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		head.next.next.next.next=new Node(5);
		head.next.next.next.next.next=head.next;
		//1->2->3->4->5->null
		//1->2->3->4->5->1
		if(hasCycle(head))
		{
			System.out.println("Cycle detected!");
		}
		else
		{
			System.out.println("No Cycle Found!");
		}
			
		
		

	}

}
