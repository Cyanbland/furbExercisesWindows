import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TaxpayerTest {

	@Test
	final void testCase_01_GetTaxToPay_income_3000() {
		Taxpayer t = new Taxpayer();
		t.setAnualIncome(3000);
		assertEquals(0, t.getTaxToPay());	
	}
	
	@Test
	final void testCase_02_GetTaxToPay_income_9000() {
		Taxpayer t = new Taxpayer();
		t.setAnualIncome(9000);
		assertEquals(522, t.getTaxToPay());	
	}	
	
	@Test
	final void testCase_03_GetTaxToPay_income_10000() {
		Taxpayer t = new Taxpayer();
		t.setAnualIncome(10000);
		assertEquals(1500, t.getTaxToPay());	
	}
	
	@Test
	final void testCase_04_GetTaxToPay_income_34911_73() {
		Taxpayer t = new Taxpayer();
		t.setAnualIncome(34911.73);
		double tolerance = 0.009;
		assertEquals(9600.72, t.getTaxToPay(), tolerance);	
	}
	
	@Test
	final void testCase_05_CheckNegativeAnualIncome_minus818_50() {
		Taxpayer t = new Taxpayer();
		t.setAnualIncome(5000);
		t.setAnualIncome(-818.50);
		assertEquals(5000, t.getAnualIncome());	
	}
	
	@Test
	final void testCase_06_SetUF_SC() {
		Taxpayer t = new Taxpayer();
		t.setUf("SC");
		assertEquals("SC", t.getUf());
	}
	
	@Test
	final void testCase_07_SetUF_PR() {
		Taxpayer t = new Taxpayer();
		t.setUf("PR");
		assertEquals("PR", t.getUf());
	}
	
	@Test
	final void testCase_08_SetUF_RS() {
		Taxpayer t = new Taxpayer();
		t.setUf("RS");
		assertEquals("RS", t.getUf());
	}
	
	@Test
	final void testCase_09_SetUF_SP() {
		Taxpayer t = new Taxpayer();
		t.setUf("RS");
		t.setUf("SP");
		assertEquals("RS", t.getUf());
	}
	
	@Test
	final void testCase_10_SetUF_RJ() {
		Taxpayer t = new Taxpayer();
		t.setUf("RS");
		t.setUf("RJ");
		assertEquals("RS", t.getUf());
	}

	

}
