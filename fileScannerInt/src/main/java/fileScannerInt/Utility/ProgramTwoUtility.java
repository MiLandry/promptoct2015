package fileScannerInt.Utility;

import java.util.ArrayList;
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
		Node tree = Node.getExampleTree();
		System.out.println(getTraversalPreOrderPath(tree));
		System.out.println(getTraversalBreadthFirstPath(tree));
		
	}

	private static String getTraversalBreadthFirstPath(Node tree)
	{
		String result = "";
		Queue<Node> queue= new PriorityQueue<Node>();
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

	private static String getTraversalPreOrderPath(Node tree)
	{
		List<String> childrenPaths = new ArrayList<String>();
		for (Node child : tree.children)
		{
			childrenPaths.add(getTraversalPreOrderPath(child));
		}
			
		return tree.data + childrenPaths;
	}
}
