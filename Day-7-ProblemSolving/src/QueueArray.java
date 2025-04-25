
public class QueueArray {

	int arr[];
	int front,rear,size,capacity;
	public QueueArray(int capacity)
	{
		this.capacity=capacity;
		arr=new int[capacity];
		front=0;
		rear=-1;
		size=0;
	}
	
	public void enqueue(int data)
	{
		if(size==capacity)
		{
			System.out.println("Queue is full!");
			return;
		}
		
		rear=(rear+1)%capacity;
		arr[rear]=data;
		size++;
	}
	
	
	int dequeue()
	{
		if(size==0)
		{
			System.out.println("Queue is empty!");
			return -1;
		}
		
		int data=arr[front];
		front=(front+1)%capacity;
		size--;
		return data;
		
	}
	
	
	public int peek()
	{
		if(size==0)
		{
		
			return -1;
		}
		
		return arr[front];
	}
	
	public boolean isEmpty()
	{
		return size==0;
	}
	
	
	public void display()
	{
		if(size==0)
		{
			System.out.println("Queue is empty!");
			return ;
		}
		
		System.out.println();
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[(front+i)%capacity]+" ");
		}
	}
	public static void main(String[] args) {
		
		QueueArray queueArray=new QueueArray(5);
		
		queueArray.enqueue(11);
		queueArray.enqueue(22);
		
		queueArray.enqueue(33);
		queueArray.enqueue(44);
		queueArray.display();
		queueArray.dequeue();
		queueArray.dequeue();
		
	System.out.println(queueArray.peek());
	queueArray.display();
	}

}
