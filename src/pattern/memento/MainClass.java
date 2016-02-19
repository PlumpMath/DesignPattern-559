package pattern.memento;

public class MainClass {
	
	public static void main(String[] args) {
		Person per = new Person("lifengxing","��",24);
		
//		Memento memento = per.createMemento();
		Caretaker caretaker = new Caretaker();
		caretaker.setMm(per.createMemento());
		
		per.display();
		
		per.setName("beifeng");
		per.setSex("Ů");
		per.setAge(1);
		
		per.display();
		
		per.setMemento(caretaker.getMm());
		per.display();
		
	}
}

