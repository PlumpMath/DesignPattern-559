package pattern.adapter;

public class AdapterTwo extends CurrentCase {
	
	public void use50V() {
		System.out.println("使用笔记本电脑的18V电源适配器");
	}
	
	public void use50VWithout220V() {
		this.use50V();
	}

	public void use220V() {
		super.use220V();
		this.use50V();
	}
	
	
}
