package pattern.chainofresponsibility;

public class MainClass {
	
	public static void main(String[] args) {
		//父亲的几个子女
		CarHandler head = new CarHeadHandler();
		CarHandler body = new CarBodyHandler();
		CarHandler tail = new CarTailHandler();

		//组装顺序预先设定好，注意这里的返回值是下一棒
		head.nextHandler(body);
		body.nextHandler(tail);
		
		//调用职责链的链头来完成操作
		head.HandlerCar();
		
		//简便操作
		body.nextHandler(head).nextHandler(tail);
		body.HandlerCar();
	}
}