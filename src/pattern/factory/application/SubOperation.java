package pattern.factory.application;

//�����Ʒ
public class SubOperation extends Operation {
	public double getResult() {
		double result = this.getNum1() - this.getNum2();
		return result;
	}
}
