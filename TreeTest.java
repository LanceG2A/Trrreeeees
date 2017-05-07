
public class TreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] test = {"This", "sentence", "repeats", "words", "because", "a", "sentence", "that", "repeats",
				"words", "makes", "a", "good", "example", "sentence"};
		Tree testTree = new Tree();
		for(int i = 0; i < test.length; i++){
			testTree.Insert(test[i]);
		}
		testTree.Traversal();
		testTree.delete("makes");
		testTree.Traversal();
		if(testTree.search("because")){
			System.out.println("Found node containing: because");
		}
		else{
			System.out.println("Node not found");
		}
		
		if(testTree.search("makes")){
			System.out.println("Found node containing: makes");
		}
		else{
			System.out.println("Node not found");
		}
		

	}

}
