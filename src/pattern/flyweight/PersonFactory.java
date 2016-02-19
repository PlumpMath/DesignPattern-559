package pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

//��Ԫģʽ�ĺ��ġ�����Ԫ��������ʵ���Ǹ�Map������о��ã�û�еĻ�����Ż�����������
public class PersonFactory {
	public Map<String, Person> pool;

	public PersonFactory() {
		pool = new HashMap<String, Person>();
	}
	
	public Person getPerson(String IDNumber) {
		Person ps = pool.get(IDNumber);
		if(ps == null) {
			if(IDNumber.indexOf("X") != -1) {
				Man man = new Man();
				man.setTaller(true);
				ps = man;
			}else {
				ps = new Person();
			}
			
			ps.setIDNumber(IDNumber);
			pool.put(IDNumber, ps);
		}
		return ps;
	}
	
}
