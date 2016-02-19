package pattern.Visitor;

/*
 * 公园的B部分
 */
public class ParkB implements ParkElement{
	
	//属性是给领导用的，不是给访问者用的
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//不针对访问者处理，我只给访问者提供参数
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
