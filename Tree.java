
public class Tree {
	TreeNode root; //root node, kept private so that no other class can change it
	
	//Insert function
	public void Insert(String s){
		TreeNode node = new TreeNode(s);
		if(root == null){
			root = node; 
			return;
		}
		insertRecursive(root, node);
	}
	public void insertRecursive(TreeNode r, TreeNode newNode){
		if(r.data.compareTo(newNode.data) > 0){
			if(r.left == null){
				r.left = newNode;
				return;
			}
			else{
				insertRecursive(r.left, newNode);
			}
		}
		else if(r.data.compareTo(newNode.data) < 0){
			if(r.right == null){
				r.right = newNode;
				return;
			}
			else{
				insertRecursive(r.right, newNode);
			}
		}
		else{
			return;
		}
		}
	

	//Traversal method, in order
	public void Traversal(){
		TreeNode temp = root;
		inOrderTraversal(temp);
	}
	private void inOrderTraversal(TreeNode x){
		if(x.left != null){
			inOrderTraversal(x.left);
		}
		System.out.println(x.data);
		if(x.right != null){
			inOrderTraversal(x.right);
		}
	}
	public static TreeNode minimum(TreeNode r){
		if(r.left == null){
			return r;
		}
		else{
			return minimum(r.left);
		}
	}
	public void delete(String s){
		root = delete(root, s);
	}
	public TreeNode delete(TreeNode node, String s){
		if(node.data.compareTo(s) < 0){
			node.right = delete(node.right, s);
		}
		else if(node.data.compareTo(s) > 0){
			node.left = delete(node.left, s);
		}
		else{
			if(node.right == null){
				return node.left;
			}
			if(node.left == null){
				return node.right;
			}
			TreeNode temp = node;
			node = minimum(node.right);
			node.right = deleteMinimum(node.right);
			node.left = temp.left;
		}
		return node;
	}
	private TreeNode deleteMinimum(TreeNode node){
		if(node.left == null){
			return node.right;
		}
		node.left = deleteMinimum(node.left);
		return node;
	}
	public boolean search(String s){
		System.out.println("Searching for: " + s);
		TreeNode temp = root;
		while(temp != null){
			if(temp.data == s){
				return true;
			}
			else if(temp.data.compareTo(s) > 0){
				temp = temp.left;
			}
			else if(temp.data.compareTo(s) < 0){
				temp = temp.right;
			}
	}
		return false;
		

	}


}
