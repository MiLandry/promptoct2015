package fileScannerInt.Utility;

import java.util.LinkedList;
import java.util.List;

public class Node
{
	String data;
	List<Node> children;

	public Node(String data)
	{
		this.data = data;
		this.children = new LinkedList<Node>();
		// TODO Auto-generated constructor stub
	}
	private void addChild(Node n)
	{
		this.children.add(n);
		// TODO Auto-generated method stub
		
	}

	public static Node getExampleTree()
	{
		//root
		Node et = new Node("C");
		
		//first level
		Node e = new Node("E");
		Node f = new Node("F");
		Node s = new Node("S");
		
		//leaves
		Node h = new Node("H");
		Node b = new Node("B");
		Node p = new Node("P");
		Node d = new Node("D");
		
		{
			e.addChild(h);
			e.addChild(b);
			
			s.addChild(p);
			s.addChild(d);
			{
				et.addChild(e);
				et.addChild(f);
				et.addChild(s);
			}
		}
		return et;
	}
}