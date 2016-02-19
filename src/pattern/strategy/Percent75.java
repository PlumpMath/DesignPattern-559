package pattern.strategy;

public class Percent75 implements Strategy {
	public double cost(double sum) {
		return sum * 0.75;
	}
}
