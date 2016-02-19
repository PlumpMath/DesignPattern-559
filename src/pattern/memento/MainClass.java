package pattern.memento;

public class MainClass {
	
	public static void main(String[] args) {
		Person per = new Person("lifengxing","ÄĞ",24);
		
//		Memento memento = per.createMemento();
		Caretaker caretaker = new Caretaker();
		caretaker.setMm(per.createMemento());
		
		per.display();
		
		per.setName("beifeng");
		per.setSex("Å®");
		per.setAge(1);
		
		per.display();
		
		per.setMemento(caretaker.getMm());
		per.display();
		
	}
}

