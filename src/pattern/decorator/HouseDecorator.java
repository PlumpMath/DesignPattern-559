package pattern.decorator;

//����װ���ߡ���ͳ�����װ�޶ӵ�װ�޹�˾�����������£��ٸ�װ�޶ӷ��䷿�ӣ�����װ�޶�չʾ�ɹ�(���ӵĻ������Բ��ܶ�)
//Ϊ��Ҫʵ�ַ��ӽӿ�(װ����ģʽ�ĺ���)���뱻װ����ʵ��ͬ���Ľӿڿ��ԡ���������װ����װ��
//������֪ʶ�㣺����������ʵ�ֽӿ��еķ�������������ȥʵ��
public abstract class HouseDecorator implements House {
	
	//��װ���߳��б�װ�ζ���(�����������Լ�����)��setter
	//��װ���߻�ȡ��ǰ�ķ���(��������ȡ������Ϣ)��getter
	public House home;
	public void setHome(House home) {
		this.home = home;
	}
	public House getHome() {
		return home;
	}
	
	//һ��ʼ�ɻ��Ҫ���з��ӵ�����
	public HouseDecorator(House home) {
		this.home = home;
	}
}
