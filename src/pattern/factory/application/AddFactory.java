package pattern.factory.application;

//�ӹ���
public class AddFactory implements OperationFactory {
	public Operation getFactory() {
		return new AddOperation();
	}
}
