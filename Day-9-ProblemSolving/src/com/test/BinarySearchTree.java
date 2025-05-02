package com.test;

public class BinarySearchTree {
	Node root;
	
	public BinarySearchTree()
	{
		root=null;
	}
	
	//recursive function to insert a new key
	Node insertRec(Node root,int key)
	{
		//Base case: empty tree or leaf node not found
		if(root==null)
		{
			root=new Node(key);
			return root;
		}
		
		
		//otherwise, recur down the tree
		if(key<root.data)
		{
			root.left=insertRec(root.left, key);
		}
		else if(key>root.data)
		{
			root.right=insertRec(root.right, key);
		}
		
		return root;
	}
	
	void insert(int key)
	{
		root=insertRec(root, key);
	}
	
	
	boolean searchRec(Node root,int key)
	{
		if(root==null)
			return false;
		
		if(root.data==key)
		{
			return true;
		}
		
		return key<root.data?searchRec(root.left, key):searchRec(root.right, key);
		
		
	}
	
	
	boolean search(int key)
	{
		return searchRec(root, key);
	}
	
	
	void inOrderRec(Node root)
	{
		if(root!=null)
		{
			inOrderRec(root.left);
			System.out.print(root.data+" ");
			inOrderRec(root.right);
		}
	}

	void inOrder()
	{
		inOrderRec(root);
		System.out.println();
	}
	
	void postOrderRec(Node root)
	{
		if(root!=null)
		{
			postOrderRec(root.left);
			postOrderRec(root.right);
			System.out.print(root.data+" ");
			
		}
	}

	void postOrder()
	{
		postOrderRec(root);
		System.out.println();
	}
	
	void preOrderRec(Node root)
	{
		if(root!=null)
		{
			System.out.print(root.data+" ");
			preOrderRec(root.left);
			preOrderRec(root.right);
			
			
		}
	}

	void preOrder()
	{
		preOrderRec(root);
		System.out.println();
	}
	
	
	Node deleteRec(Node root, int key)
	{
		//base case
		if(root==null)
		{
			return root;
		}
		
		if(key <root.data)
		{
			root.left=deleteRec(root.left, key);
		}
		else if(key >root.data)
		{
			root.right=deleteRec(root.right, key);
		}
		else
		{
			//Node with one child or no child
			if(root.left==null)
			{
				return root.right;
			}
			else if(root.right==null)
			{
				return root.left;
			}
			
			
			//Node with two children : Get the in order successor(smallest in the right subtree)
			root.data=minValue(root.right);
			
			//delete the inorder successor
			root.right=deleteRec(root.right, root.data)	;
		}
		
		return root;
	}
	
	
	void delete(int key)
	{
		root=deleteRec(root, key);
	}
	
	
	int minValue(Node root)
	{
		int minv=root.data;
		while(root.left!=null)
		{
			root=root.left;
			minv=root.data; 
		}
		return minv;
	}
	
	
	
	int heightRec(Node root)
	{
		if(root==null)
		{
			return -1;
		}
		
		else
		{
			int leftHeight=heightRec(root.left);
			int rightHeight=heightRec(root.right);
			
			return 1+Math.max(leftHeight, rightHeight);
		}
	}
	
	
	int height()
	{
		return heightRec(root);
	}
	public static void main(String[] args) {
		
		
		 BinarySearchTree tree=new BinarySearchTree();
		 
		 tree.insert(50);
		 tree.insert(30);
		 tree.insert(70);
		 tree.insert(20);
		 tree.insert(40);
		 tree.insert(60);
		 tree.insert(80);
		
		 
		 System.out.println("Inorder: ");
		 tree.inOrder();
		 
		 System.out.println("PreOrder: ");
		 tree.preOrder();
		 
		 System.out.println("Postorder: ");
		 tree.postOrder();
		 
		 tree.delete(40);
		 
		 System.out.println("Inorder: ");
		 tree.inOrder();
		 
		 System.out.println(tree.search(70));
		 
		 System.out.println(tree.height());
		 
	}

}
