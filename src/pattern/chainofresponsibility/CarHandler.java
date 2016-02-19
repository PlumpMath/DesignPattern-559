package pattern.chainofresponsibility;

//职责链模式核心思想：有一个父亲(父类)，有很多的子女(子类)，这个父亲只做了一件事：让所有的子女心连心，大的带小的，并且所有的子女都尊崇。这就是所谓的职责链模式
public abstract class CarHandler {
	
	CarHandler next;
	
	public CarHandler nextHandler(CarHandler next) {
		this.next = next;
		return next;
	}
	
	public abstract void HandlerCar(); 
}