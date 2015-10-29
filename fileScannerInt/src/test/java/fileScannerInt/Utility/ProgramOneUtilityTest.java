package fileScannerInt.Utility;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class ProgramOneUtilityTest {
	private List<Integer> ints;
	private boolean expected;
	
	public ProgramOneUtilityTest(List<Integer> ints, boolean expected) {
		super();
		this.ints = ints;
		this.expected = expected;
	}


	@Parameters(name = "{index} integer list: {0}, expected: {1} ")
	public static Iterable<Object[]> data1() {
		return Arrays.asList(new Object[][] { 
			{ new ArrayList(Arrays.asList(1, 2, 3)), false},
			{ new ArrayList(Arrays.asList(1, 2,3,-3)), true}
		});
	}

	@Test
	public void testAdd() {	
		assertEquals(expected, ProgramOneUtility.isContainingZeroSummingAddends(ints));
	}


}
