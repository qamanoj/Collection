package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Test
{
	public static void main(String[] args)
	{
		HashSet t=new HashSet();
		t.add("abc");
		t.add("mhv");
		t.add("jhf");
		t.add("kfs");
		for(Object obj:t)
		{
			System.out.println(obj);
		}
		System.out.println("**********");
		Iterator it=t.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
