package pattern.factory.application;

//×Ó¹¤³§
public class AddFactory implements OperationFactory {
	public Operation getFactory() {
		return new AddOperation();
	}
}
