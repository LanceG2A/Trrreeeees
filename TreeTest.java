
public class TreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] test = {"this", "sentence", "repeats", "words", "because", "a", "sentence", "that", "repeats",
				"words", "makes", "a", "good", "example", "sentence"};
		Tree testTree = new Tree();
		for(int i = 0; i < test.length; i++){
			testTree.Insert(test[i]);
		}
		System.out.println("added sentence: " + "\nthis sentence repeats words because a "
				+ "sentence that repeats words makes a good example sentence." + "\nTo a binary search tree."
						+ " Printing in order: ");
		testTree.Traversal();
		System.out.println("deleting nodes containing makes and then printing in order:");
		testTree.delete("makes");
		testTree.Traversal();
		System.out.println("Searching for: because, and makes: ");
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
		System.out.println("Printing the tree in order with frequency of words: ");
		testTree.frequency();
		

	}

}
