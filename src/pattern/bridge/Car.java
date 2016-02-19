package pattern.bridge;

//��ϣ�������һ�����������(��)������ע��
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
