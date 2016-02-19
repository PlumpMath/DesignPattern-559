package pattern.builder;

//统筹管理工厂
public class BuildingDirector {
	public void makeHouse(BuildingBuilder builder) {
		builder.makeFloor();
		builder.makeWall();
		builder.makeTop();
	}
}
