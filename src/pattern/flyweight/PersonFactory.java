package pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

//享元模式的核心——享元工厂，其实就是干Map，如果有就拿，没有的话往里放或者其它处理
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
