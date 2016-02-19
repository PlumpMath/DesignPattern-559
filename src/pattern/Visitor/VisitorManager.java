package pattern.Visitor;

public class VisitorManager implements Visitor {

	public void visit(Park park) {
		System.out.println("�쵼������" + park.getName() + "��鹤��");
	}

	public void visit(ParkA parkA) {
		System.out.println("�쵼������԰"+ parkA.getName() +"������鹤��");
	}

	public void visit(ParkB parkB) {
		System.out.println("�쵼������԰"+ parkB.getName() +"������鹤��");
	}

}
