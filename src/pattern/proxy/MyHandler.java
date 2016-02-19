package pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler {
	
	private RealSubject rs;
	
	public void setRs(RealSubject rs) {
		this.rs = rs;
	}
	
	//��̬����ĺ��ģ�ʵ��invoke����
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		
		this.takePercent();
		
		//����д��invoke������invoke��������󣬷���ֵ��һ��Objectʵ��������̬�������
		result = method.invoke(rs, args);
		
		this.takeGift();
		
		return result;
	}
	
	public void takePercent() {
		System.out.println("��������");
	}
	
	public void takeGift() {
		System.out.println("���ʹ���ȯ");
	}
}
