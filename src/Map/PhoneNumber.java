package Map;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class PhoneNumber 
{
	public static void main(String[] args)
	{
		TreeMap<String,Long> t=new TreeMap<String,Long>();
		t.put("manoj", 9535960971l);
		t.put("sunil", 9985502431l);
		t.put("santosh", 9090601227l);
		t.put("litu", 1234556789l);
		t.put("lucky", 1236456789l);
		int count=0;
		System.out.println("enter the name");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		Set<String> s=t.keySet();
		for(String str:s)
		{
			//System.out.println(str);
			long phonenos=t.get(str);
			//System.out.println(phonenos);
			if(name.equals(str))
			{
				count++;
				System.out.println(str+" phone number is "+phonenos);
			}
		}
		if(count==0)
		{
			System.out.println("your name is not available in our record, plz go outside and wait sometime");
		}
	}
}
