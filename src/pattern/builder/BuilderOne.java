package pattern.builder;

//具体建造者，与工厂模式的区别是工厂用new，建造者用setter，所以还要多一个领导来发号施令
public class BuilderOne implements BuildingBuilder {
	Building house = new Building();
	
	public void makeFloor() {
		house.setFloor("木质");
	}

	public void makeWall() {
		house.setWall("混凝土");
	}

	public void makeTop() {
		house.setTop("吊顶");
	}
	
	public Building getHouse() {
		return house;
	}
}
