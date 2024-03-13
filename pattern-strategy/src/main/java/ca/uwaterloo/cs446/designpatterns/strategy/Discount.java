package ca.uwaterloo.cs446.designpatterns.strategy;

/** 
 * The common interface for discount strategies.
 */
public interface Discount {
	/** Given the full price, computes the price after applying the discount. */
	public double compute(double fullPrice);
}
