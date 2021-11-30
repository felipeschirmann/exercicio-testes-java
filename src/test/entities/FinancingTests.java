package test.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {

	@Test
	public void financingShouldCreateObjectWhenDataIsCorect() {
		Financing obj = new Financing(100000.00, 4000.00, 40);
		Assertions.assertEquals(Financing.class, obj.getClass());
	}
	
	@Test
	public void financingShouldThrowExecptionWhenDataIsIncorect() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing obj = new Financing(100000.00, 4000.00, 20);
		});
	}
	
	@Test
	public void financingShouldUpdateWhenDataIsIncorect() {
		Financing obj = new Financing(100000.00, 4000.00, 40);
		Double expected = 50000.00;
		obj.setIncome(expected);
		Assertions.assertEquals(obj.getIncome(), expected);
	}
}
