package pattern.chainofresponsibility;

public class MainClass {
	
	public static void main(String[] args) {
		//���׵ļ�����Ů
		CarHandler head = new CarHeadHandler();
		CarHandler body = new CarBodyHandler();
		CarHandler tail = new CarTailHandler();

		//��װ˳��Ԥ���趨�ã�ע������ķ���ֵ����һ��
		head.nextHandler(body);
		body.nextHandler(tail);
		
		//����ְ��������ͷ����ɲ���
		head.HandlerCar();
		
		//������
		body.nextHandler(head).nextHandler(tail);
		body.HandlerCar();
	}
}