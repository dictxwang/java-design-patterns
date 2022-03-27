package patterns.composite;

import java.util.List;

public interface ITreeNode {

	public String getNodeName();
	public void addNode(ITreeNode node);
	public void removeNode(ITreeNode node);
	public void getNodeInfo();
	public List<ITreeNode> getNodeList();
}
