package List;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	
	public static void main(String[] args) {
		Map <Integer,String> ha = new LinkedHashMap <Integer,String>();
		
		ha.put(10, "java");
		ha.put(20, "sql");
		ha.put(30, "oops");
		ha.put(40, "oracle");
		
		System.out.println(ha);
		
		
		for (Map.Entry xs: ha.entrySet()) {
			
			System.out.println(xs.getKey());
			
			
		}
		
			
		
	}

}
