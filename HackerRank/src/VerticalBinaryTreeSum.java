import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Node {
	Node left;
	Node right;
	int data;
}

class BinaryTree {

	public Node createNode(int val) {
		Node nd = new Node();
		nd.left = null;
		nd.right = null;
		nd.data = val;
		return nd;
	}

	public void getVerticalSum(Node node) {
		if (node == null) {
			return;
		}

		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();

		verticalSum(node, 0, mp);

		if (mp != null) {
			System.out.print(mp.values());
		}
	}

	public void verticalSum(Node node, int i, Map<Integer, Integer> mp) {
		if(node ==null) {
			return;
		}
		
		verticalSum(node.left,i-1,mp);
		
		int sum = mp.get(i) == null ?0:mp.get(i);
		mp.put(i, sum+node.data);
		
		verticalSum(node.right,i+1,mp);
		
	}
}

public class VerticalBinaryTreeSum {

	public static void main(String[] args) {

		BinaryTree a = new BinaryTree();
		Node root = a.createNode(2);
		root.left = a.createNode(7);
		root.right = a.createNode(5);
		root.left.left = a.createNode(2);
		root.left.right = a.createNode(6);
		root.left.right.left = a.createNode(5);
		root.left.right.right = a.createNode(11);
		root.right.right = a.createNode(9);
		root.right.right.left = a.createNode(4);

		a.getVerticalSum(root);

	}

}
