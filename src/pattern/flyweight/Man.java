package pattern.flyweight;


//具体享元角色
public class Man extends Person {
	private boolean taller;

	public boolean isTaller() {
		return taller;
	}

	public void setTaller(boolean taller) {
		this.taller = taller;
	}
}
