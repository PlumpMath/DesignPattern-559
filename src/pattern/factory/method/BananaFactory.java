package pattern.factory.method;

public class BananaFactory implements FruitFactory {
	public Fruit getFruit() {
		return new Banana();
	}

}
