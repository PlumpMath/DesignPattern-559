package pattern.decorator;

public class MainClass {
	public static void main(String[] args) {
		
		House home = new BasicHouse();
		
		HouseDecorator hdFloor = new DecoratorTeamOne(home);
		
		HouseDecorator hdWall = new DecoratorTeamTwo(hdFloor);
		
		hdWall.showHouse();
		
	}
}
