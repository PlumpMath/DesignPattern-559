package pattern.factory.method;

public class MainClass {
	public static void main(String[] args) {
		//这时就不能直接调用工厂来生产对象了，因为工厂是个抽象的，先获得工厂之后才能获得产品
		FruitFactory ff = new PearFactory();
		Fruit pear = ff.getFruit();
		pear.gather();
	}
}
