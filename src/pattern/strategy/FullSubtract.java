package pattern.strategy;

public class FullSubtract implements Strategy{
	public double cost(double sum) {
		if(sum >= 200) {
			return sum - 20;
		}else {
			return sum - 5;
		}
	}
}
