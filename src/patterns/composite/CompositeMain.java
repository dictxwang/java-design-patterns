package patterns.composite;

public class CompositeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ITreeNode root = new TreeBranch("root");
		createTree(root);
		root.getNodeInfo();
	}

	private static void createTree(ITreeNode root) {
		ITreeNode node1 = new TreeBranch("node 1");
		ITreeNode node11 = new TreeBranch("node 11");
		ITreeNode leaf111 = new TreeLeaf("leaf 111");
		ITreeNode leaf12 = new TreeLeaf("leaf 12");

		node11.addNode(leaf111);
		node1.addNode(node11);
		node1.addNode(leaf12);

		ITreeNode node2 = new TreeBranch("node2");
		ITreeNode leaf21 = new TreeLeaf("leaf 21");
		ITreeNode leaf22 = new TreeLeaf("leaf 22");
		node2.addNode(leaf21);
		node2.addNode(leaf22);
		
		ITreeNode leaf222 = new TreeLeaf("leaf 222");
		leaf22.addNode(leaf222);

		root.addNode(node1);
		root.addNode(node2);
	}
}
