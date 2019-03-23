package Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Demo 
{
	public static void main(String[] args)
	{
		HashSet h=new HashSet();
		h.add(101);
		System.out.println("-------- "+h.add(101));
		h.add(102);
		h.add("A");
		h.add(null);
		h.add("C");
		h.add("B");
		h.add(null);
		h.add("DD");
		for (Object object : h) 
		{
			System.out.println(object);
		}
		System.out.println("=================");
		HashMap h1=new HashMap();
		h1.put(101, "abcd");
		System.out.println("======  "+h1.put(106, "abcd1"));
		h1.put(102, "ffff");
		h1.put('A', "ccff");
		h1.put('B', "bbbb");
		h1.put('C', "ccc");
		h1.put(null, "null");
		h1.put("DD", "dddd");
		h1.put(null,"null");
		Set s=h1.keySet();
		for (Object object : s) 
		{
			System.out.println(object+"---->"+h1.get(object));
		}
	}
}
