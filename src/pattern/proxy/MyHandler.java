package pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler {
	
	private RealSubject rs;
	
	public void setRs(RealSubject rs) {
		this.rs = rs;
	}
	
	//动态代理的核心，实现invoke方法
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		
		this.takePercent();
		
		//在重写的invoke方法中invoke被代理对象，返回值是一个Object实例——动态代理核心
		result = method.invoke(rs, args);
		
		this.takeGift();
		
		return result;
	}
	
	public void takePercent() {
		System.out.println("打折销售");
	}
	
	public void takeGift() {
		System.out.println("赠送代金券");
	}
}
