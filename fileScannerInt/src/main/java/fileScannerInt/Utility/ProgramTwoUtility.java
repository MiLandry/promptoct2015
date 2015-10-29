package fileScannerInt.Utility;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class ProgramTwoUtility
{

	public static void run()
	{
		System.out.println(
				"This program will a representation of" + 
	" the given Tree object in memory and will then print"
	+ " each node using both a preorder traversal"
	+ " then a breadth-first traversal."
	);
		System.out.println("Preorder: " + getTraversalPreOrderPath(Node.getExampleTree()));
		System.out.println("Depth first: " + getTraversalBreadthFirstPath(Node.getExampleTree()));
		
	}

	public static String getTraversalBreadthFirstPath(Node tree)
	{
		String result = "";
		Queue<Node> queue= new LinkedList<Node>();
		queue.add(tree);
		
		while (!queue.isEmpty())
		{
			Node node = queue.poll();
			result += node.data;
			for (Node child : node.children)
			{
				queue.add(child);
			}		
		}
		
		return result;
	}

	public static String getTraversalPreOrderPath(Node tree)
	{
		//List<String> childrenPaths = new ArrayList<String>();
		String result = tree.data;
		
		while (!tree.children.isEmpty())
		{
			Node child = tree.children.remove(0);
			result += getTraversalPreOrderPath(child);
		}
		
		return result;
	}

}
