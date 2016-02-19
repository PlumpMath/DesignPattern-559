package pattern.proxy;

import java.lang.reflect.Proxy;

public class MainClass {
	public static void main(String[] args) {
		//先拿到一个真实主题
		RealSubject rs = new RealSubject();
		//然后拿到一个动态代理，这里与静态代理一样，给代理对象传入被代理的对象
		MyHandler mh = new MyHandler();
		mh.setRs(rs);
		
		//这里传入被代理类的接口是确定调用被代理对象要执行的方法，传入代理对象是整合代理关系
		Subject sj = (Subject) Proxy.newProxyInstance(rs.getClass().getClassLoader(), rs.getClass().getInterfaces(), mh);
		//可以用接口来调用方法，这就是静态代理和动态代理最大的区别
		sj.sailBook();
	}
}
