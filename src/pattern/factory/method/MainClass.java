package pattern.factory.method;

public class MainClass {
	public static void main(String[] args) {
		//��ʱ�Ͳ���ֱ�ӵ��ù��������������ˣ���Ϊ�����Ǹ�����ģ��Ȼ�ù���֮����ܻ�ò�Ʒ
		FruitFactory ff = new PearFactory();
		Fruit pear = ff.getFruit();
		pear.gather();
	}
}
