package pattern.flyweight;

//������������⣬��ȥ��д
public class MainClass {
	public static void main(String[] args) {
		PersonFactory pf = new PersonFactory();
		Person ps1 = pf.getPerson("Y0001");
		System.out.println(ps1.getIDNumber());
	}
}
