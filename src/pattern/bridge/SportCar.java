package pattern.bridge;

public class SportCar extends Car {

	public SportCar(Engine eg) {
		super(eg);
	}

	public void beTakeEngine() {
		System.out.print("�����ܳ���");
		this.getEg().takeEngine();
	}

}
