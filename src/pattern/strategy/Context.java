package pattern.strategy;

//��װ����һ���������˱�����Ʒ�������ã�����û��ʵ�ֲ�Ʒ�ӿ�
public class Context {
	private Strategy st;
	public Context(Strategy st) {
		this.st = st;
	}
	
	public double cost(double sum) {
		return this.st.cost(sum);
	}
}
