package pattern.builder;

//���彨���ߣ��빤��ģʽ�������ǹ�����new����������setter�����Ի�Ҫ��һ���쵼������ʩ��
public class BuilderOne implements BuildingBuilder {
	Building house = new Building();
	
	public void makeFloor() {
		house.setFloor("ľ��");
	}

	public void makeWall() {
		house.setWall("������");
	}

	public void makeTop() {
		house.setTop("����");
	}
	
	public Building getHouse() {
		return house;
	}
}
