
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

	}

}
