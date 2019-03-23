package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

import javax.naming.ldap.HasControls;

public class Sample 
{
	public static void main(String[] args)
	{
		LinkedHashSet l=new LinkedHashSet();
		l.add(10);
		l.add(12.3);
		l.add(false);
		l.add('A');
		l.add("abc");
		l.add(null);
		for(Object obj:l)
		{
			System.out.println(obj);
		}
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
