package pattern.adapter;

public class AdapterOne extends CurrentCase {
	
	public void use18V() {
		System.out.println("ʹ�ñʼǱ����Ե�18V��Դ������");
	}
	
	public void use18VWithout220V() {
		this.use18V();
	}

	//ֻ��д���������һ����������Ӱ�����������������
	public void use220V() {
		super.use220V();
		this.use18V();
	}
	
	
}
