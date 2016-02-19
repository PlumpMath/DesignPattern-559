package pattern.bridge;

public class MainClass {
	public static void main(String[] args) {
		
		Engine eg = new EngineOne();
		Car bus = new Bus(eg);
		bus.beTakeEngine();
		
	}
}
