迭代模式也是行为模式的一种，比如此时要访问容器中的某个/某些对象，一般的做法有二：
①自己写一个hasNext方法和一个getNext方法，调用的时候这么写：while(xxx.hasNext()) {YYY yyy = xxx.getNext();yyy.zzz()}
②谁调用，谁自己写for循环，不仅不友善，还暴露容器的细节
这样做有几个弊端：容器的功能不够单纯，如果跟添加删除操作一起进行，就乱套了

迭代模式就是屏蔽所有容器的差异，用统一的方式，另外再起一个类去实现遍历功能
迭代模式的结构：
①迭代接口：在JDK中就是Iterator接口，只包含三个方法：hasNext、next、remove
②迭代接口的实现类：在JDK中就是ConcreteIterator
③容器接口：也就是collection接口，继承了迭代接口，并且包含了一个Iterator方法，表示所有容器都支持迭代。
④容器实现：
	Iterator iter = ls.iterator();而不是Iterator iter = new ConcreteIterator();
	所有容器所实现的iterator()方法内部，都是返回了一个ConcreteIterator类的实例
	而ConcreteIterator其实是具体容器的成员内部类，为什么要用内部类——只有内部类才能知道当前类中有哪些细节，其他类只能访问这个类
