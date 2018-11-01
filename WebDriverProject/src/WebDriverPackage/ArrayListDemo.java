package WebDriverPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList obj = new ArrayList();
		obj.add(789128);
		obj.add('i');
		obj.add("Selenium");
		obj.add("Selenium");
		obj.add(12.34);
		//System.out.println(obj);
		//System.out.println(obj.get(2));
		
		/* // For loop
		int listsize = obj.size();
		for(int i=0;i<listsize;i++) {
			System.out.println(obj.get(i));
		}*/
		
		/*// Enhanced for loop (size is not requried)
		for(Object abc:obj){
			System.out.println("values are "+abc);
		}*/
		
		// Iterator
		Iterator itr = obj.iterator();
		while(itr.hasNext()) {
			Object obj1 = itr.next();
			System.out.println("values are "+obj1 );
		}
	}

}
