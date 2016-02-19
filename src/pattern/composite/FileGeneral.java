package pattern.composite;

import java.util.List;

//���ܰѽӿڼ�ֻ�����������÷�����������ʵ�ֽӿڣ�ʵ����̳г�����
public interface FileGeneral {
	public void display();
	public boolean add(FileGeneral fg);
	public boolean remove(FileGeneral fg);
	public List<FileGeneral> getChild();
}
