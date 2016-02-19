package pattern.flyweight;

//这个例子有问题，回去重写
public class MainClass {
	public static void main(String[] args) {
		PersonFactory pf = new PersonFactory();
		Person ps1 = pf.getPerson("Y0001");
		System.out.println(ps1.getIDNumber());
	}
}
