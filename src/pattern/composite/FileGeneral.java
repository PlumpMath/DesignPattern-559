package pattern.composite;

import java.util.List;

//还能把接口简化只保留几个公用方法，抽象类实现接口，实体类继承抽象类
public interface FileGeneral {
	public void display();
	public boolean add(FileGeneral fg);
	public boolean remove(FileGeneral fg);
	public List<FileGeneral> getChild();
}
