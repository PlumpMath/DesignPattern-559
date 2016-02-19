package pattern.prototype;

import java.util.List;

//实现Cloneable的类的对象才能被克隆
public class Person implements Cloneable{
	private String name;
	private String sex;
	private int age;
	
	private List<String> friends;
	
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person clone() {
		try {
			return (Person)super.clone();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
