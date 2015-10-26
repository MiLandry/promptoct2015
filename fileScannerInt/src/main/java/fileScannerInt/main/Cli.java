package fileScannerInt.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import fileScannerInt.Utility.ProgramOneUtility;

public class Cli {

	public static boolean processFileReadingProgram()
	{
	System.out.print("Enter a path: ");
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String input = null;
	try
	{
		input = br.readLine();
	}
	catch (IOException ioe)
	{
		System.out.println(ioe);
		System.exit(1);
	}
	
	if (input.equals("/exit"))
		{
		System.out.println("Bye!");
		return false;
		}
	try
	{
		List<Integer> ints = ProgramOneUtility.getIntsFromfile(input);
		System.out.println(ProgramOneUtility.isContainingZeroSummingAddends(ints));

	}
	catch(IllegalArgumentException e)
	{
		System.out.println(e.getMessage());
	} catch (IOException e)
	{ 
		System.out.println("File not found");
		
	}
	return true;
	}

}
