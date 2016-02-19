package pattern.strategy;

//与装饰者一样，持有了被“产品”的引用，但是没有实现产品接口
public class Context {
	private Strategy st;
	public Context(Strategy st) {
		this.st = st;
	}
	
	public double cost(double sum) {
		return this.st.cost(sum);
	}
}
