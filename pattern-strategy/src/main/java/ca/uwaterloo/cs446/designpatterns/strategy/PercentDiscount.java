package ca.uwaterloo.cs446.designpatterns.strategy;

/**
 * A discount that reduces the full price by a percentage.
 */
public class PercentDiscount implements Discount {
	private double percent;

	public PercentDiscount(double percent) {
		this.percent = percent;
	}

	@Override
	public double compute(double fullPrice) {
		return fullPrice * (1 - this.percent / 100);
	}
}
