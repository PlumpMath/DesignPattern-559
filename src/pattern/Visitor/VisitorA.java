package pattern.Visitor;

/*
 * 园丁A,负责parkA的卫生情况
 */
public class VisitorA implements Visitor {

	public void visit(Park park) {

	}

	public void visit(ParkA parkA) {
		System.out.println("园丁A:完成公园" + parkA.getName()+ "的工作");
	}

	public void visit(ParkB parkB) {

	}

}
