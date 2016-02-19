package pattern.decorator;

//��һ��������
public class DecoratorTeamOne extends HouseDecorator {
	
	//װ���߰󶨱�װ���ߣ�װ����ֻ�ܡ��ޡ������Һܿ���ֻ��һ���֣���װ�����ø��ݹ�˾�ı�׼��
	public DecoratorTeamOne(House home) {
		super(home);
	}
	
	//��ǰ�Ŷ��깤
	public void makeFloor() {
		System.out.println("�ѵذ��̺���");
	}
	
	
	//����װ�޹�˾ʵ���˷��ӵĽӿڣ�����Ҫʵ������ķ�������չʾ�ɹ�
	public void showHouse() {
		this.getHome().showHouse();
		this.makeFloor();
		System.out.println("�ذ��̺ã�ס�ø������");
	}
}
