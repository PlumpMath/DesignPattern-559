package pattern.decorator;

//第一个包工队
public class DecoratorTeamOne extends HouseDecorator {
	
	//装饰者绑定被装饰者，装饰者只管“修”，而且很可能只修一部分，“装”还得根据公司的标准来
	public DecoratorTeamOne(House home) {
		super(home);
	}
	
	//当前团队完工
	public void makeFloor() {
		System.out.println("把地板铺好了");
	}
	
	
	//由于装修公司实现了房子的接口，所以要实现最顶级的方法——展示成果
	public void showHouse() {
		this.getHome().showHouse();
		this.makeFloor();
		System.out.println("地板铺好，住得更舒服了");
	}
}
