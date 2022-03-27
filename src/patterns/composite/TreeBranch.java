package patterns.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TreeBranch implements ITreeNode {

	private String name = "";
	private List<ITreeNode> nodelist = new ArrayList<ITreeNode>();

	public TreeBranch(String name) {
		this.name = name;
	}

	public String getNodeName() {
		return this.name;
	}

	public void addNode(ITreeNode node) {
		if (!this.nodelist.contains(node)) {
		    this.nodelist.add(node);
		}
		System.out.println("Add node " + node.getNodeName());
	}

	public void removeNode(ITreeNode node) {
		if (this.nodelist.contains(node)) {
		    this.nodelist.remove(node);
		}
		System.out.println("Remove node " + node.getNodeName());
	}

	public List<ITreeNode> getNodeList() {
		return this.nodelist;
	}

	public void getNodeInfo() {
		System.out.println("This is node " + this.getNodeName());
	    Iterator<ITreeNode> iterator = this.nodelist.iterator();
	    while(iterator.hasNext()) {
	    	ITreeNode item = iterator.next();
	    	item.getNodeInfo();
	    }
	}
}
