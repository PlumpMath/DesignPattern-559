package pattern.chainofresponsibility;

public class CarBodyHandler extends CarHandler {
	
	public void HandlerCar() {
		
		//做自己的工作
		System.out.println("组装车身");
		
		//如果存在下一棒，下一棒立马接力
		if(this.next != null) {
			this.next.HandlerCar();
		}
	}
}

