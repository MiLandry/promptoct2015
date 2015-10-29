package fileScannerInt.Utility;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProgramTwoUtilityTest {

	@Test
	public void testGetTraversalBreadthFirstPath() {
		assertEquals("CEHBFSPD",ProgramTwoUtility.getTraversalPreOrderPath(Node.getExampleTree()));
	}

	@Test
	public void testGetTraversalPreOrderPath() {
		assertEquals("CEFSHBPD", ProgramTwoUtility.getTraversalBreadthFirstPath(Node.getExampleTree()));
	}

}
