package pattern.adapter;

public class AdapterOne extends CurrentCase {
	
	public void use18V() {
		System.out.println("使用笔记本电脑的18V电源适配器");
	}
	
	public void use18VWithout220V() {
		this.use18V();
	}

	//只重写了现有类的一个方法，不影响现有类的其它方面
	public void use220V() {
		super.use220V();
		this.use18V();
	}
	
	
}
