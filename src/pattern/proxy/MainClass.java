package pattern.proxy;

import java.lang.reflect.Proxy;

public class MainClass {
	public static void main(String[] args) {
		//���õ�һ����ʵ����
		RealSubject rs = new RealSubject();
		//Ȼ���õ�һ����̬���������뾲̬����һ��������������뱻����Ķ���
		MyHandler mh = new MyHandler();
		mh.setRs(rs);
		
		//���ﴫ�뱻������Ľӿ���ȷ�����ñ��������Ҫִ�еķ��������������������ϴ����ϵ
		Subject sj = (Subject) Proxy.newProxyInstance(rs.getClass().getClassLoader(), rs.getClass().getInterfaces(), mh);
		//�����ýӿ������÷���������Ǿ�̬����Ͷ�̬������������
		sj.sailBook();
	}
}
