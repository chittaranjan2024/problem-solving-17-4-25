

public class FindMiddleElement {
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
	
	// Add element to the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

	
 // Print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
   
   
   public void findMiddle()
   {
	   Node slow=head;
	   Node fast=head;
	   
	   if(head==null)
	   {
		   System.out.println("List is empty!");
		   return;
	   }
	   
	   while(fast!=null && fast.next!=null)
	   {
		   slow=slow.next;
		   fast=fast.next.next;
	   }
	   
	   System.out.println("Middle elemenet:"+slow.data);
   }
	
	
	public static void main(String[] args) {
		
		FindMiddleElement list=new FindMiddleElement();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(55);
		list.add(66);
		
		list.printList();
		list.findMiddle();
		
		
	}

}
