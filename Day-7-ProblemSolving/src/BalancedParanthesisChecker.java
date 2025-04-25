import java.util.Stack;

public class BalancedParanthesisChecker {

	public static boolean isBalanced(String exp)
	{
		Stack<Character> stack=new Stack<Character>();
		
		for(char ch:exp.toCharArray())
		{
			if(ch=='('||ch=='{'||ch=='[')
			{
				stack.push(ch);
			}
			
			else if(ch==')'||ch=='}'||ch==']')
			{
				if(stack.isEmpty())
				{
					return false;
				}
				
				char top=stack.pop();
				
				if(!isMatchingPair(top, ch))
				{
					return false;
				}
			}
		}
		
		
		return stack.isEmpty();
	}
	
	
	private static boolean isMatchingPair(char open,char close)
	{
		return (open=='(' && close==')')|| (open=='{' && close=='}') || (open=='[' && close==']');
	}
	
	public static void main(String[] args) {
		
		String exp="[{()}]";
		if(isBalanced(exp))
		{
			System.out.println("Balanced");
		}
		else
		{
			System.out.println("Unbalanced");
		}
	}

}
