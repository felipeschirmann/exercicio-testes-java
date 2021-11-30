package test.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {

	@Test
	public void contructorShouldCreateObjectWhenDataIsValid() {
		Financing obj = new Financing(100000.00, 4000.00, 40);
		
		Assertions.assertEquals(obj.getTotalAmount(), 100000.00);
		Assertions.assertEquals(obj.getIncome(), 4000.00);
		Assertions.assertEquals(obj.getMonths(), 40);
	}
	
	@Test
	public void contructorShouldThrowIllegalArgumentExceptionExecptionWhenDataIsInvalid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing obj = new Financing(100000.00, 4000.00, 20);
		});
	}
	
	@Test
	public void setTotalAmountShouldUpdateWhenDataAmountIsCorect() {
		Financing obj = new Financing(100000.00, 4000.00, 40);
		Double expected = 80000.00;
		obj.setTotalAmount(expected);
		Assertions.assertEquals(obj.getTotalAmount(), expected);
	}
	
	@Test
	public void setTotalAmountShouldThrowExecptionWhenDataAmountToUpdateIsIncorect() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing obj = new Financing(100000.00, 4000.00, 40);
			obj.setTotalAmount(200000.00);
		});
	}

	@Test
	public void setIncomeShouldUpdateWhenDataIncomeIsCorect() {
		Financing obj = new Financing(100000.00, 4000.00, 40);
		Double expected = 50000.00;
		obj.setIncome(expected);
		Assertions.assertEquals(obj.getIncome(), expected);
	}

	@Test
	public void setIncomeShouldThrowExecptionWhenDataIncomeToUpdateIsIncorect() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing obj = new Financing(100000.00, 2000.00, 40);
		});
	}
	
	@Test
	public void setMonthsShouldUpdateWhenDataMonthIsCorect() {
		Financing obj = new Financing(100000.00, 4000.00, 40);
		obj.setMonths(50);
		Assertions.assertEquals(obj.getMonths(), 50);
	}

	@Test
	public void setMonthsShouldThrowExecptionWhenDataMonthToUpdateIsIncorect() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing obj = new Financing(100000.00, 2000.00, 20);
		});
	}
	
	@Test
	public void entryShouldCalculateEntryWhenDataIsCorect() {
		Financing obj = new Financing(100000.00, 4000.00, 40);
		Assertions.assertEquals(obj.entry(), 20000.00);
	}

	@Test
	public void quotaShouldCalculateQuotaWhenDataIsCorect() {
		Financing obj = new Financing(100000.00, 4000.00, 40);
		Assertions.assertEquals(obj.quota(), 2000.00);
	}
}
