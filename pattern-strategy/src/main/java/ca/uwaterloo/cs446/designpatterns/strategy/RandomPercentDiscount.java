package ca.uwaterloo.cs446.designpatterns.strategy;

/**
 * A discount strategy that reduces the full price by a percentage randomly selected within a range.
 */
public class RandomPercentDiscount implements Discount {
    private double minPercent;
    private double maxPercent;

    public RandomPercentDiscount(double minPercent, double maxPercent) {
        this.minPercent = minPercent;
        this.maxPercent = maxPercent;
    }

    @Override
    public double compute(double fullPrice) {
        double percent = this.minPercent + Math.random() * (this.maxPercent - this.minPercent);
        return fullPrice * (1 - percent / 100);
    }
}
