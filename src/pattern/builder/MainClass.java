package pattern.builder;

public class MainClass {
	public static void main(String[] args) {
		//�ɹ��̶�����
		BuildingBuilder hb = new BuilderOne();
		
		//���������
		//�������÷�������֤���������
		BuildingDirector hd = new BuildingDirector();
		hd.makeHouse(hb);
		
		Building house = hb.getHouse();
		
		System.out.println(house.getFloor());
	}
}
