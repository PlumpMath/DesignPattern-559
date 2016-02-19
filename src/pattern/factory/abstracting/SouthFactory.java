package pattern.factory.abstracting;

public class SouthFactory implements FruitFactory {

	public Fruit getApple() {
		return new SouthApple();
	}
	
	public Fruit getBanana() {
		return new SouthBanana();
	}

}
