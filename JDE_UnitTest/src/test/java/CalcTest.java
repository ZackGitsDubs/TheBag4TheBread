import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalcTest {
	@Test
	void testAdd() {
		Calculator clsCalc = new Calculator();
		if(clsCalc.add(1, 4) != 5) {
			fail("Not yet implemented");
		}
	}
	
	@Test
	void testSubtract() {
		assertEquals(Calculator.subtract(7,5),2);
	}
	@Test
	void testMultiply() {
		assertEquals(Calculator.multiply(2,3),6);
		
	}
	@Test
	void testDivide() {
		assertEquals(Calculator.divide(6,2),3);
	}
}

/*
 
 */
