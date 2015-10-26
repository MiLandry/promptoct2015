package fileScannerInt.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import fileScannerInt.Utility.ProgramTwoUtility;


public class Main
{

	public static void main(String[] args) 
	{
		System.out.println("1: Two Addends summing to zero");
		System.out.println("2: Tree-Traversal Utility");
		
		System.out.print("choose a program: ");
		
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
		
		if (input.equals("1"))
		{
			System.out.println(
					"This program will determine whether or not a give file of integers contains two integers which sum to zero."
							+ "\n type /exit to quit."
					);
			boolean cont = true;
			do
			{
				cont = Cli.processFileReadingProgram();	
			}
			
			while(cont);
			
		}
		
		else if(input.equals("2"))
		{
			ProgramTwoUtility.run();
			
		}
		else
		{
			System.out.println("invalid program choice");
		}
		
		
	}
}
