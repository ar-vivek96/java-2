package dataStructrue;

public class BinarySearchTree {
	Node root;
	class Node
	{
		int data;
		Node left,right;
		Node (int val)
		{
			data=val;
			left=null;
			right=null;
		}
	}
	BinarySearchTree(int val)
	{
		root=new Node(val);
	}
	BinarySearchTree()
	{
		root=null;
	}
	public void insert(int val)
	{
		insert( root,val);
	}
	public Node insert(Node root,int val)
	{
		if(root==null)
			return new Node(val);
		
		
		if(val<root.data)
			root.left=insert(root.left,val);
		else
			root.right=insert(root.right,val);
		
		return root;
	}
	public void inorder(Node r)
	{
		if(r!=null) {
		inorder(r.left);
		System.out.print(r.data+" ");
		inorder(r.right);
		}
	}
	public Node search(Node r,int val)
	{
		if(r==null||r.data==val)
			return r;
		
		if(val<root.data)
		return search(r.left,val);
			
		return search(r.right,val);
		
	}
	public void delete(int val)
	{
		root=delete(root,val);
	}
	
	
	public Node delete(Node root,int val)
	{
		if(root==null)
			return root;
		
		if(val<root.data)
			root.left=delete(root.left,val);
		else if(val>root.data)
			root.right=delete(root.right,val);
		else
		{
			if(root.right==null)
				return root.left;
			else if(root.left==null)
				return root.right;
			else
			{
				root.data=min(root.right);
				root.right=delete(root.right,root.data);
			}
			
		}
		return root;
	}
	public int min(Node root )
	{
		int minval=root.data;
		while(root.left!=null)
		{
			minval=root.left.data;
					root=root.left;
		}
		return minval;
	}
	

	
	

}
