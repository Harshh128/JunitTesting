package JUnitestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumbers {

	@Test
	public void test() {
		JUnitFunctions junit = new JUnitFunctions();
		int result= junit.addNumbers(100, 200);
		assertEquals (300,result);
	}

}
