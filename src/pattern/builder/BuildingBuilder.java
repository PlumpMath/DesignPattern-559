package pattern.builder;

//��������
public interface BuildingBuilder {
	public void makeFloor();
	public void makeWall();
	public void makeTop();
	public Building getHouse();
}
