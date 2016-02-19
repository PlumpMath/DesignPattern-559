package pattern.decorator;

//第二个包工队
public class DecoratorTeamTwo extends HouseDecorator {
	
	public DecoratorTeamTwo(House home) {
		super(home);
	}

	public void makeWall(){
		System.out.println("把壁纸贴好了");
	}
	
	//关系是A→B→C，A是接口，B是抽象类同时继承了A，C继承了B实现了A的方法——装饰者模式
	public void showHouse() {
		this.getHome().showHouse();
		this.makeWall();
		System.out.println("有了壁纸，住得更舒服了");
	}
}
