package pattern.chainofresponsibility;

public class CarHeadHandler extends CarHandler {
	
	public void HandlerCar() {
		//这部分其实已经有了，new出当前类的对象，只需要head.nextHandler(xxxx)即可指定下一棒
		/*CarHandler next;
		
		public CarHandler nextHandler(CarHandler next) {
			this.next = next;
			return next;
		}*/
		
		//完成自己的工作
		System.out.println("组装车头");
		
		//如果存在下一棒，下一棒就得立刻接力
		if(this.next != null) {
			this.next.HandlerCar();
		}
	}
}
