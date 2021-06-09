package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {

	@Test
	public void entryShouldReturnTwentyPercentOfTotalAmount() {

		Financing fnc = new Financing(100000.0, 2000.0, 80);
		double expectedValue = 20000;

		double result = fnc.entry();

		Assertions.assertEquals(expectedValue, result);
	}

	@Test
	public void quotaShouldReturnQuotasOfEightyPercentofTotalAmount() {

		Financing fnc = new Financing(100000.0, 2000.0, 80);
		double expectedValue = 1000.0;

		double result = fnc.quota();

		Assertions.assertEquals(expectedValue, result);
	}

	@Test
	public void constructorShouldSetValuesWhenValidData() {

		Financing fnc = new Financing(100000.0, 2000.0, 80);

		Assertions.assertEquals(100000.0, fnc.getTotalAmount());
		Assertions.assertEquals(2000.0, fnc.getIncome());
		Assertions.assertEquals(80, fnc.getMonths());
	}

	@Test
	public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fnc = new Financing(100000.0, 2000.0, 79);
		});
	}

	@Test
	public void setTotalAmountShouldSetValueWhenValidData() {

		Financing fnc = new Financing(100000.0, 2000.0, 80);

		fnc.setTotalAmount(90000.0);

		Assertions.assertEquals(90000.0, fnc.getTotalAmount());
	}

	@Test
	public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fnc = new Financing(100000.0, 2000.0, 80);
			fnc.setTotalAmount(110000.0);
		});
	}

	@Test
	public void setIncomeShouldSetValueWhenValidData() {

		Financing fnc = new Financing(100000.0, 2000.0, 80);

		fnc.setIncome(3000.0);

		Assertions.assertEquals(3000.0, fnc.getIncome());
	}

	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fnc = new Financing(100000.0, 2000.0, 80);
			fnc.setIncome(1500.0);
		});
	}

	@Test
	public void setMonthsShouldSetValueWhenValidData() {

		Financing fnc = new Financing(100000.0, 2000.0, 80);

		fnc.setMonths(81);

		Assertions.assertEquals(81, fnc.getMonths());
	}

	@Test
	public void setMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fnc = new Financing(100000.0, 2000.0, 80);
			fnc.setMonths(79);
		});
	}
}
