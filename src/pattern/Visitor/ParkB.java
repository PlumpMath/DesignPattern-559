package pattern.Visitor;

/*
 * ��԰��B����
 */
public class ParkB implements ParkElement{
	
	//�����Ǹ��쵼�õģ����Ǹ��������õ�
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//����Է����ߴ�����ֻ���������ṩ����
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
