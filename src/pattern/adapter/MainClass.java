package pattern.adapter;

public class MainClass {
	public static void main(String[] args) {
		
		//这是先前不够完善的功能调用
		/*CurrentCase cc = new CurrentCase();
		cc.use220V();*/
		
		//来个适配器
		CurrentCase cc = new AdapterOne();
		//结合工厂，仅需更改一处
	
		cc.use220V();
	}
}
