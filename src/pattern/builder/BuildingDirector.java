package pattern.builder;

//ͳ�������
public class BuildingDirector {
	public void makeHouse(BuildingBuilder builder) {
		builder.makeFloor();
		builder.makeWall();
		builder.makeTop();
	}
}
