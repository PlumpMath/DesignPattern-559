package pattern.singleton;

public class Person {
	//����������ʼ���͵�ʵ����һ�����󡪡�����
	//final���ζ����ʾ���úͶ�����������Ƕ����ܶ�,��Ϊ���ε�������
	//public final static Person person = new Person();
	
	//���������õ���ʱ��ų�ʼ�����󡪡����
	private static Person person;
	
	//���캯��˽�л�
	private Person(){}
	
	//�ṩȫ�־�̬����
	public static Person getPerson() {
		//����
		//return person;
		
		//���������ܱ�֤�̰߳�ȫ���̵߳ļ����ʵ������������ʱ���
		//����������̰߳�ȫ����ô�͵���ͬ����synchronized������
		if(person == null) {
			//˫�ؼ�飬ֻ����Ҫͬ�����ĵط�ʹ��,synchronized��ס�Ĳ��Ƕ��󣬶��Ǵ����
			//ÿ��������һ��������monitor��ֻ���ǵ��̻߳�ã�synchronized(����)�����õ��������ļ��������Ӷ���ס�������Ĳ���Ȩ
			//�������������������̶߳�������
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
