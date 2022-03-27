package patterns.composite;

import java.util.List;

public class TreeLeaf implements ITreeNode {

	private String name = "";

	public TreeLeaf(String name) {
		this.name = name;
	}

	public String getNodeName() {
		return this.name;
	}

	public void addNode(ITreeNode node) {
		System.out.println("Invalid to add node to leaf.");
	}

	public void removeNode(ITreeNode node) {
		System.out.println("No child node in leaf.");
	}

	public void getNodeInfo() {
		System.out.println("This is leaf " + this.getNodeName());
	}

	public List<ITreeNode> getNodeList() {
		return null;
	}
}
