package pattern.Visitor;

public class VisitorManager implements Visitor {

	public void visit(Park park) {
		System.out.println("领导：负责" + park.getName() + "检查工作");
	}

	public void visit(ParkA parkA) {
		System.out.println("领导：负责公园"+ parkA.getName() +"分区检查工作");
	}

	public void visit(ParkB parkB) {
		System.out.println("领导：负责公园"+ parkB.getName() +"分区检查工作");
	}

}
