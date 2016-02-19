package pattern.bridge;

//耦合，持有另一个对象的引用(桥)，依赖注入
public abstract class Car {
	private Engine eg;
	
	public Car(Engine eg) {
		this.eg = eg;
	}
	
	public Engine getEg() {
		return eg;
	}
	
	public abstract void beTakeEngine();
}
