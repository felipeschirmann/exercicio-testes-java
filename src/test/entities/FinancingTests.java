package test.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {

	@Test
	public void createObjectWithDataIsCorect() {
		Financing obj = new Financing(100000.00, 4000.00, 40);
		Assertions.assertEquals(Financing.class, obj.getClass());
	}
}
