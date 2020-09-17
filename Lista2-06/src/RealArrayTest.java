import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RealArrayTest {
	
	@Test
	final void testCaso01_dividir() {
		RealArray ra1 = new RealArray(3);
		ra1.setValue(2, 0);
		ra1.setValue(-1, 1);
		ra1.setValue(3.5, 2);
		
		RealArray ra2 = new RealArray(1);
		ra2.setValue(3, 0);
		
		assertNull(ra1.division(ra2));
	}
	
	@Test
	final void testCaso02_dividir() {
		RealArray ra1 = new RealArray(3);
		ra1.setValue(2, 0);
		ra1.setValue(-1, 1);
		ra1.setValue(3.5, 2);
		
		RealArray ra2 = new RealArray(3);
		ra2.setValue(3, 0);
		ra2.setValue(2, 1);
		ra2.setValue(1, 2);
		
		RealArray result = ra1.division(ra2);
		double resultArray[] = {0.666666, -0.5, 3.5};
		assertEquals(resultArray.length, result.getSize());
		
		double tolerance = 0.000001;
		
		for (int i = 0; i < result.getSize(); i++) {
			assertEquals(resultArray[i], result.getValue(i), tolerance);
		}

	}

}
