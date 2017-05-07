
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
		else{
			if(r.right == null){
				r.right = newNode;
				return;
			}
			else{
				insertRecursive(r.right, newNode);
			}
		}
	}
		/*TreeNode temp = root;//start at root
		while(true){
			if(s.compareTo(temp.data) < 0){//less than, go left
				if(temp.left != null){
					temp = temp.left;
				}else{
					temp.left = new TreeNode(s);
					break;
				}
			}
			else if(s.compareTo(temp.data) > 0){//greater than, go right
				if(temp.right != null){
					temp = temp.right;
				}else{
					temp.right = new TreeNode(s);
					break;
				}
			}else{
				break;
			}
		}	
	}*/
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
	public static TreeNode delete(TreeNode r, String s){
		if(r.data.compareTo(s) > 0){
			r.left = delete(r.left, s);
		}
		else if(r.data.compareTo(s) < 0){
			r.right = delete(r.right, s);
		}
		else{
			
		}
	}
	public boolean search(String s){
		TreeNode temp = root;
		if(temp.data == s){
			return true;
		}
		else if(temp.data.compareTo(s) > 0){
			if(temp.left == null){
				return false;
			}
			else{
				return search(temp.left.data);
			}
		}
		else if(temp.data.compareTo(s) < 0){
			if(temp.right == null){
				return false;
			}
			else{
				return search(temp.right.data);
			}
		}
		return false;
	}

}
