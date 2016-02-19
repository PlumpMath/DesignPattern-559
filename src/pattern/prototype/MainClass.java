package pattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		List<String> friends = new ArrayList<>();
		friends.add("Kobe");
		friends.add("James");
		
		Person p1 = new Person();
		p1.setName("С��");
		p1.setAge(10);
		p1.setSex("��");
		p1.setFriends(friends);
		
		
//		Person p2 = new Person();
//		p2.setName("С��");
//		p2.setAge(10);
//		p2.setSex("��");
		
		//�ɴ˿ɼ����������������ƶȺܸߣ�����������
		Person p2 = p1.clone();
		p2.setName("С��");
		p2.getFriends().add("Kevin");
		
		System.out.println(p2.getAge());
		System.out.println(p1.getFriends());
		
	}
}
