package pattern.strategy;

public class MainClass {
	public static void main(String[] args) {
		//ת��ע��㣺��ֱ��new�㷨�����ǰ�newһ��context��contextȷ��������㷨
		double sum = 200;
		
		//����ģʽ��������һ���£���ֱ�ӵ��ò�ͬ�Ĳ��ԣ����ǵ��ò��Լ���ȱ����Ǹ����Լ�ָ��ĳ������Ĳ���
		//���ﻹ�ܴ��乤��ģʽ��ʹ�ô�����Ӽ�
		Context ct = new Context(new Percent75());
		
		//���۲�����ô�ģ����ﲻ�ø�
		double actualSum = ct.cost(sum);
		System.out.println("ʵ�ʸ��ˣ�" + actualSum);
	}
}
