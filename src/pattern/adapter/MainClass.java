package pattern.adapter;

public class MainClass {
	public static void main(String[] args) {
		
		//������ǰ�������ƵĹ��ܵ���
		/*CurrentCase cc = new CurrentCase();
		cc.use220V();*/
		
		//����������
		CurrentCase cc = new AdapterOne();
		//��Ϲ������������һ��
	
		cc.use220V();
	}
}
