package pattern.singleton;

public class MainClass {
	public static void main(String[] args) {
		Person p1 = Person.getPerson();
		Person p2 = Person.getPerson();
		p1.setName("����");
		p2.setName("����");
		
		System.out.println(p1.getName());
		System.out.println(p2.getName());
	}
}
