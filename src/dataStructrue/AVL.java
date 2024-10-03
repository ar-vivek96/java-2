package dataStructrue;

public class AVL {
	Node root;
	class Node
	{
		Node left,right;
		int	data;
		int height;
		Node (int val)
		{
			data=val;
			left=null;
			right=null;
			height=0;
		}
	}
	AVL(int val)
	{
		root=new Node(val);
	}
	
	public int getHeight(Node node)
	{
		if(node==null)
			return -1;
		
		return node.height;
	}
	public  int max(int a,int b)
	{
		return a>b?a:b;
	}
	public void insert(int val)
	{
		root=insert(root,val);
	}
	public Node insert(Node node,int val)
	{
		if(node==null)
			return new Node(val);
		if(val<node.data)
			node.left=insert(node.left,val);
		else if(val>node.data)
			node.right=insert(node.right,val);
		else
			return node;
		node.height=1+max(getHeight(node.left),(getHeight(node.right)));
		int BF=getBlanceFactor(node);			
		//LLcase
		if(BF>1&&val<node.left.data)
		{
			return rightRotate(node);
		}
		//LR case
		if(BF>1&&val>node.left.data)
		{
			node.left=leftRotate(node.left);
			return rightRotate(node);
			
		}
		//RR case
		if(BF<-1&&val>node.right.data)
		{
			return leftRotate(node);
		}
		//RLcase
		if(BF<-1&&val<node.right.data)
		{	node.right=rightRotate(node.right);
			return leftRotate(node);
		}
		return node;
	
	}
	public Node leftRotate(Node z)
	{
		Node y=z.right;
		Node t3=y.left;
		
		y.left=z;
		z.right=t3;
		z.height=1+max(getHeight(z.left),getHeight(z.right));
		y.height=1+max(getHeight(y.left),getHeight(y.right));
		return y;
	}
	public Node rightRotate(Node z)
	{
		Node y=z.left;
		Node t3=y.right;
		
		y.right=z;
		z.left=t3;
		
		z.height=1+max(getHeight(z.left),getHeight(z.right));
		y.height=1+max(getHeight(y.left),getHeight(y.right));
		
		return y;
	}
	public int getBlanceFactor(Node node)
	{
		if(node==null)
			return 0;
		
		return getHeight(node.left)-getHeight(node.right);
	}
	public void inOrder(Node root)
	{
		if(root!=null) {
			
			inOrder(root.left);
			System.out.println(root.data+" Height is "+root.height);
			inOrder(root.right);
		}
	}
	
	

}
