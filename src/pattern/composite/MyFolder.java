package pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class MyFolder implements FileGeneral {
	
	private String name = "";
	private List<FileGeneral> child = null;
	
	public MyFolder(String name) {
		this.name = name;
		child = new ArrayList<FileGeneral>();
	}

	public void display() {
		System.out.println("目录的名称是：" + name);
	}

	public boolean add(FileGeneral fg) {
		return child.add(fg);
	}

	public boolean remove(FileGeneral fg) {
		return child.remove(fg);
	}

	public List<FileGeneral> getChild() {
		return child;
	}

}
