package pattern.composite;

import java.util.List;

//͸�������ģʽ
public class MyFile implements FileGeneral {
	
	private String name = "";
	
	public MyFile(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println("�ļ��������ǣ�" + name);
	}

	public boolean add(FileGeneral fg) {
		return false;
	}

	public boolean remove(FileGeneral fg) {
		return false;
	}

	public List<FileGeneral> getChild() {
		return null;
	}

}
