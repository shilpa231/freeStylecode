package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayListObjct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList obj=new ArrayList();
		obj.add("shilpa");
		obj.add('a');
		obj.add(21);
		obj.add(true);
		obj.add('a');
		
		System.out.println(obj);
		System.out.println(",,,,,,,,,,,");
		
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		System.out.println(",,,,,,,,,,");
		
		for(Object o:obj)
		{
			System.out.println(o);
		}
		System.out.println(",,,,,,,,,,,,,");
		Iterator itr=obj.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(",,,,,,,,,");
		System.out.println(obj.contains(21));
		
		HashSet hObj=new HashSet(obj);
		//hObj
		System.out.println("HashSet.......");
		for(Object o:hObj) {
			System.out.println(o);
		}
		
		
	}

}
