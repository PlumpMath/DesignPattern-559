package pattern.factory.abstracting;

public class MainClass {
	public static void main(String[] args) {
		FruitFactory ffn = new NorthFactory();
		Fruit applen = ffn.getApple();
		applen.gather();
	}
}