package pattern.factory.method;

public class PearFactory implements FruitFactory {
	public Fruit getFruit() {
		return new Pear();
	}

}
