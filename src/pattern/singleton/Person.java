package pattern.singleton;

public class Person {
	//饿汉——初始化就得实例化一个对象——饿了
	//final修饰对象表示引用和对象绑死，但是对象还能动,因为修饰的是引用
	//public final static Person person = new Person();
	
	//懒汉——用到的时候才初始化对象——慵懒
	private static Person person;
	
	//构造函数私有化
	private Person(){}
	
	//提供全局静态方法
	public static Person getPerson() {
		//饿汉
		//return person;
		
		//懒汉，不能保证线程安全，线程的间隔比实例化对象所用时间短
		//如果让懒汉线程安全，那么就得用同步锁synchronized来修饰
		if(person == null) {
			//双重检查，只在需要同步锁的地方使用,synchronized锁住的不是对象，而是代码块
			//每个对象都有一个监听器monitor，只能是单线程获得，synchronized(对象)就是拿到这个对象的监听器，从而锁住这个对象的操作权
			//这样不会阻塞其它的线程堵在这里
			synchronized(Person.class) {
				if(person == null) {
					person = new Person();
				}
			}
		}
		return person;
	}
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
