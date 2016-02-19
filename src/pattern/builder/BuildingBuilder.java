package pattern.builder;

//抽象建造者
public interface BuildingBuilder {
	public void makeFloor();
	public void makeWall();
	public void makeTop();
	public Building getHouse();
}
