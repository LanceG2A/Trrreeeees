
public class Tree {
	private TreeNode root; //root node, kept private so that no other class can change it
	
	//Insert function
	public void Insert(String s){
		if(root == null){
			root = new TreeNode(s); 
			return;
		}
		TreeNode temp = root;//start at root
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
	}
	//Traversal method, in order
	public void Traversal(){
		inOrderTraversal(root);
	}
	private void inOrderTraversal(TreeNode x){
		if(x != null){
			inOrderTraversal(x.left);
			System.out.println(x.data);
			inOrderTraversal(x.right);
		}
	}
	

}
