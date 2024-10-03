package dataStructrue;

public class DemoBi {

	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree(50);
		bst.insert(bst.root, 20);
		bst.insert(bst.root, 70);
		bst.insert(10);
		bst.insert(25);
		bst.insert(60);
		bst.insert(90);
		bst.inorder(bst.root);
		if(bst.search(bst.root, 70)==null)
			System.out.println("Not found");
		else
			System.out.println("Found");
		bst.delete(bst.root, 20);
		bst.delete(50);
		bst.inorder(bst.root);
	}

}
