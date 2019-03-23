package Map;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class state
{
	public static void main(String[] args)
	{
		HashMap<String,String> h=new HashMap<String,String>();
		h.put("Karnataka", "Bangalore");
		h.put("Odisha", "Bhubaneswar");
		h.put("Maharastra","Mumbai");
		h.put("Bihar", "Patna");
		h.put("Keral", "Triruvanthapuram");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the state");
		String state=sc.next();
		Set<String> s1=h.keySet();
		int count=0;
		for(String obj:s1)
		{
			if(state.equalsIgnoreCase(obj))
			{
				count++;
				System.out.println(state+"------------->"+h.get(obj));
			}
		}
		if(count==0)
		{
			System.out.println("no such state in our map project");
		}
	}
}
