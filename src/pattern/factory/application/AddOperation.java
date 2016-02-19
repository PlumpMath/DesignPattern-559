package pattern.factory.application;

//具体产品
public class AddOperation extends Operation {
	public double getResult() {
		double result = this.getNum1() + this.getNum2();
		return result;
	}
}
