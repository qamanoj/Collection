package Map;

import java.util.LinkedHashMap;
import java.util.Set;

public class Test 
{
	public static void main(String[] args)
	{
		LinkedHashMap h=new LinkedHashMap();
		h.put(25, 13);
		h.put(22, "abc");
		h.put(23, 12.3f);
		h.put(12, null);
		h.put(null, "xyz");
		h.put(true, "afaf");
		h.put(24, "xyz");
		Set s=h.keySet();
		for(Object obj:s)
		{
			System.out.println(h.get(obj));
		}
	}
}
