package pattern.factory.abstracting;

public class NorthFactory implements FruitFactory {

	public Fruit getApple() {
		return new NorthApple();
	}
	
	public Fruit getBanana() {
		return new NorthBanana();
	}

}
