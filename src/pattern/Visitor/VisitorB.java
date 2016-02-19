package pattern.Visitor;

/*
 * 园丁B，负责公园B部分
 */
public class VisitorB implements Visitor {

	public void visit(Park park) {

	}

	public void visit(ParkA parkA) {

	}

	public void visit(ParkB parkB) {
		System.out.println("园丁B:完成公园" + parkB.getName()+"的工作");
	}

}
