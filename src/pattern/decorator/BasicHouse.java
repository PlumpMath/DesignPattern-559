package pattern.decorator;

//具体的房子——毛坯房
public class BasicHouse implements House {
	public void showHouse() {
		System.out.println("毛坯房能入住");
		System.out.println("毛坯房待装修");
	}
}
