package pattern.adapter;

public class AdapterTwo extends CurrentCase {
	
	public void use50V() {
		System.out.println("ʹ�ñʼǱ����Ե�18V��Դ������");
	}
	
	public void use50VWithout220V() {
		this.use50V();
	}

	public void use220V() {
		super.use220V();
		this.use50V();
	}
	
	
}
