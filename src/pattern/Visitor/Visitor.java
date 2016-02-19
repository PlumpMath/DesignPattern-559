package pattern.Visitor;

//抽象访问者，访问方法持有被访问者的实体引用
public interface Visitor {
	public void visit(Park park);
	public void visit(ParkA parkA);
	public void visit(ParkB parkB);
}
