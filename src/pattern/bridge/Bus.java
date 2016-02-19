package pattern.bridge;

public class Bus extends Car {
	public Bus(Engine eg) {
		super(eg);
	}

	public void beTakeEngine() {
		System.out.print("������������");
		this.getEg().takeEngine();
	}
}
