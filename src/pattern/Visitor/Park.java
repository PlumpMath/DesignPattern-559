package pattern.Visitor;

public class Park implements ParkElement {
	private String name;
	private ParkA parkA;
	private ParkB parkB;
	
	public Park() {
		this.parkA = new ParkA();
		this.parkB = new ParkB();
		parkA.setName("A");
		parkB.setName("B");
	}

	//不仅得让领导访问整个公园，还得让园丁AB“邀请”领导去参观
	//领导没有专门访问分区的方法，所以需要在公园中明确标出分区(构造方法)，让领导知道
	public void accept(Visitor visitor) {
		visitor.visit(this);
		parkA.accept(visitor);
		parkB.accept(visitor);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
