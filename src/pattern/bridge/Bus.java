package pattern.bridge;

public class Bus extends Car {
	public Bus(Engine eg) {
		super(eg);
	}

	public void beTakeEngine() {
		System.out.print("这辆公交车：");
		this.getEg().takeEngine();
	}
}
