package List;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Linkedlist {
	
public static void main(String[] args) {
	List <Integer>li = new LinkedList();
	li.add(100);
	li.add(200);
	li.add(300);
	li.add(300);
	li.add(400);
	li.add(600);
	li.add(700);
	
//	System.out.println("The number of length is" + li.size());
//	
//	System.out.println(li.get(2));
	System.out.println(li.get(3));
	
//for(int i=0; i<li.size(); i++) {
//		System.out.println(li.get(i));
//	}
	
	List <Integer>li2 = new LinkedList();
	
	li2.add(300);
	li2.add(400);
	
	li2.retainAll(li);
	
	System.out.println(li2);
	
	
			for (Integer x:li) {
				System.out.println(x);
			}
	
			Set <Integer>li21 = new LinkedHashSet();
			
			li21.addAll(li);
			
			System.out.println(li21);
			
	
	
}

}
