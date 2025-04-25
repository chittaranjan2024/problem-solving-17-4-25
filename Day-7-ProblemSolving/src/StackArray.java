
public class StackArray {

	private int stack[];
	private int top;
	private int capacity;
	
	public StackArray(int size)
	{
		stack=new int[size];
		capacity=size;
		top=-1;
	}
	
	public void push(int x)
	{
	  if(top==capacity-1)
	  {
		  System.out.println("Stack Overflow!");
		  return;
		  
	  }
	  
	  stack[++top]=x;
	}
	
	public boolean isEmpty()
	{
		return top==-1;
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack underflow!");
			return -1;
		}
		
		return stack[--top]; 
	}
	
	
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("Stack underflow!");
		}
		
		return stack[top]; 
	}
	
	public void display()
	{
		if(!isEmpty())
		{
			for(int i=0;i<=top;i++)
			{
				System.out.print(stack[i]+" ");
			}
		}
		
		else
		{
			System.out.println("Stack is empty!");
		}
	}
	
	public static void main(String[] args) {
		
		StackArray stack=new StackArray(5);
		stack.push(11);
		stack.push(22);
		stack.push(33);
		stack.push(44);
		stack.push(55);
		stack.push(66);
		stack.display();
		System.out.println();
		stack.pop();
		stack.pop();
		stack.display();
		System.out.println();
		System.out.println(stack.peek());

	}

}
