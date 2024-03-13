package ca.uwaterloo.cs446.designpatterns.strategy;

/**
 * A discount that subtracts a fixed amount from the full price.
 */
public class FlatRateDiscount implements Discount {

	private double amount;

	public FlatRateDiscount(double amount) {
		this.amount = amount;
	}

	@Override
	public double compute(double fullPrice) {
		return Math.max(fullPrice - this.amount, 0);
	}
}
