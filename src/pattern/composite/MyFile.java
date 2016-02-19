package pattern.composite;

import java.util.List;

//透明化组合模式
public class MyFile implements FileGeneral {
	
	private String name = "";
	
	public MyFile(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println("文件的名称是：" + name);
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
