package pattern.Visitor;

//被访问者的抽象，被访问方法持有访问者的抽象引用
public interface ParkElement {
	public void accept(Visitor visitor);
}
