package pattern.chainofresponsibility;

//ְ����ģʽ����˼�룺��һ������(����)���кܶ����Ů(����)���������ֻ����һ���£������е���Ů�����ģ���Ĵ�С�ģ��������е���Ů����硣�������ν��ְ����ģʽ
public abstract class CarHandler {
	
	CarHandler next;
	
	public CarHandler nextHandler(CarHandler next) {
		this.next = next;
		return next;
	}
	
	public abstract void HandlerCar(); 
}