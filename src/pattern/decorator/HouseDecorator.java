package pattern.decorator;

//抽象装饰者——统领诸多装修队的装修公司，做了两件事，①给装修队分配房子；②让装修队展示成果(房子的基本属性不能丢)
//为何要实现房子接口(装饰者模式的核心)：与被装饰者实现同样的接口可以“隐身”——装饰套装饰
//遗忘的知识点：抽象类无需实现接口中的方法，交由子类去实现
public abstract class HouseDecorator implements House {
	
	//让装饰者持有被装饰对象(被动，房主自己上门)：setter
	//让装饰者获取当前的房子(主动，调取房子信息)：getter
	public House home;
	public void setHome(House home) {
		this.home = home;
	}
	public House getHome() {
		return home;
	}
	
	//一开始干活就要持有房子的引用
	public HouseDecorator(House home) {
		this.home = home;
	}
}
