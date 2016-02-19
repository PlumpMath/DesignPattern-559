package pattern.strategy;

public class MainClass {
	public static void main(String[] args) {
		//转移注意点：不直接new算法，而是把new一个context，context确定具体的算法
		double sum = 200;
		
		//策略模式，就是做一件事，不直接调用不同的策略，而是调用策略集，缺点就是给策略集指定某个具体的策略
		//这里还能搭配工厂模式，使得代码更加简单
		Context ct = new Context(new Percent75());
		
		//无论策略怎么改，这里不用改
		double actualSum = ct.cost(sum);
		System.out.println("实际付账：" + actualSum);
	}
}
