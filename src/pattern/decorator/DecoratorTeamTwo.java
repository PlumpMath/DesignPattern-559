package pattern.decorator;

//�ڶ���������
public class DecoratorTeamTwo extends HouseDecorator {
	
	public DecoratorTeamTwo(House home) {
		super(home);
	}

	public void makeWall(){
		System.out.println("�ѱ�ֽ������");
	}
	
	//��ϵ��A��B��C��A�ǽӿڣ�B�ǳ�����ͬʱ�̳���A��C�̳���Bʵ����A�ķ�������װ����ģʽ
	public void showHouse() {
		this.getHome().showHouse();
		this.makeWall();
		System.out.println("���˱�ֽ��ס�ø������");
	}
}
