package dataStructrue;

public class DemoAvl {

	public static void main(String[] args) {
		AVL tree=new AVL(50);
		tree.insert(tree.root,20);
		tree.insert(60);
		tree.insert(10);
		tree.insert(30);
		tree.insert(40);
		tree.inOrder(tree.root);
		
		

	}

}
