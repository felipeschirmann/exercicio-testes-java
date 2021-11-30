package test.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {

	@Test
	public void financingShouldCreateObjectWhenDataIsCorrect() {
		Financing obj = new Financing(100000.00, 4000.00, 40);
		Assertions.assertEquals(Financing.class, obj.getClass());
	}
	
	@Test
	public void financingShouldThrowExecptionWhenDataIsIncorrect() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing obj = new Financing(100000.00, 4000.00, 20);
		});
	}
	
	@Test
	public void financingShouldUpdateWhenDataAmountIsCorect() {
		Financing obj = new Financing(100000.00, 4000.00, 40);
		Double expected = 80000.00;
		obj.setTotalAmount(expected);
		Assertions.assertEquals(obj.getTotalAmount(), expected);
	}
	
	@Test
	public void financingShouldThrowExecptionWhenDataAmountToUpdateIsIncorect() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing obj = new Financing(100000.00, 4000.00, 40);
			obj.setTotalAmount(200000.00);
		});
	}

	@Test
	public void financingShouldUpdateWhenDataIncomeIsCorect() {
		Financing obj = new Financing(100000.00, 4000.00, 40);
		Double expected = 50000.00;
		obj.setIncome(expected);
		Assertions.assertEquals(obj.getIncome(), expected);
	}

	@Test
	public void financingShouldThrowExecptionWhenDataIncomeToUpdateIsIncorect() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing obj = new Financing(100000.00, 2000.00, 40);
		});
	}
	
	@Test
	public void financingShouldUpdateWhenDataMonthIsCorect() {
		Financing obj = new Financing(100000.00, 4000.00, 40);
		obj.setMonths(50);
		Assertions.assertEquals(obj.getMonths(), 50);
	}

	@Test
	public void financingShouldThrowExecptionWhenDataMonthToUpdateIsIncorect() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing obj = new Financing(100000.00, 2000.00, 20);
		});
	}
}
