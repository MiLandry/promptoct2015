package fileScannerInt.Utility;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProgramOneUtility
{
	public static List<Integer> getIntsFromfile(String path) throws IOException
	{
	    BufferedReader br = new BufferedReader(new FileReader(path));
	    List<Integer> ints = new ArrayList<Integer>();
	    try
	    {	
	        String line;
	        while ((line = br.readLine()) != null) 
	        {
	        	ints.add(Integer.parseInt(line));
	        }

	    } 
	    catch (NumberFormatException e)
	    {
	    	throw new IllegalArgumentException("File does not contain parsable integers" +
	    " or is not correctly formatted", e);
	    }
	    finally 
	    {
	        br.close();
	    }
		return ints;
	}
	



	public static boolean isContainingZeroSummingAddends(List<Integer> ints)
	{
		Set<Integer> cache = new HashSet<Integer>();
		for (Integer i: ints)
		{
			boolean newNumber = cache.add(i);
			
			//if we have added a second zero we will return true
			if (!newNumber && (i==0)) return true;
			
			if (newNumber && (i != 0))
			{
				for (Integer j: ints)
				{
					if (j+i==0) return true;
				}
			}
		}
		return false;
	}

}
