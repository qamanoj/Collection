package Map;

import java.util.HashMap;
import java.util.Set;

public class Sample 
{
	public static void main(String[] args)
	{
		HashMap h=new HashMap();
		h.put(25, 13);
		h.put(22, "abc");
		h.put(23, 12.3f);
		h.put(12, null);
		h.put(null, "xyz");
		h.put(true, "afaf");
		h.put(24, "xyz");
		System.out.println(h.size());
		System.out.println(h.get(12));
		System.out.println(h.get(null));
		System.out.println(h.get(true));
		System.out.println(h.get(25));
		System.out.println(h.get(24));
		System.out.println(h.get(23));
		Set s=h.keySet();
		System.out.println("**********");
		System.out.print(s);
		for(Object obj:s)
		{
			System.out.println(obj+" "+h.get(obj));
		}
	}
}
