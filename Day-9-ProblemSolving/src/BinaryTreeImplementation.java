class Node
{
	int data;
	Node left;
	Node right;
	
	Node(int value)
	{
		data=value;
		left=right=null;
	}
}
public class BinaryTreeImplementation {
	
	Node root;
	
	public BinaryTreeImplementation() {
		
		root=null;
	}
	
	void preOrder(Node node)
	{
		if(node==null)
		{
			return;
		}
		
		System.out.print(node.data+" ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	
	void postOrder(Node node)
	{
		if(node==null)
		{
			return;
		}
		preOrder(node.left);
		preOrder(node.right);
		System.out.print(node.data+" ");
		
	}
	
	void InOrder(Node node)
	{
		if(node==null)
		{
			return;
		}
		preOrder(node.left);
		System.out.print(node.data+" ");
		preOrder(node.right);
		
		
	}

	public static void main(String[] args) {
		
		BinaryTreeImplementation tree=new BinaryTreeImplementation();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		
		/*
		 *        1
		 *       / \
		 *      2   3
		 *     / \
		 *    4   5
		 *    
		 *    
		 * */
		
		System.out.println();
		tree.InOrder(tree.root);
		
		System.out.println();
		tree.postOrder(tree.root);
		
		System.out.println();
		tree.preOrder(tree.root);

	}

}
