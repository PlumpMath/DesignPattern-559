package pattern.builder;

public class MainClass {
	public static void main(String[] args) {
		//由工程队来修
		BuildingBuilder hb = new BuilderOne();
		
		//设计者来管
		//还可以用反射来保证最大的灵活性
		BuildingDirector hd = new BuildingDirector();
		hd.makeHouse(hb);
		
		Building house = hb.getHouse();
		
		System.out.println(house.getFloor());
	}
}
