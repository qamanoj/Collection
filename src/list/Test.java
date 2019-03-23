package list;

import java.util.ArrayList;

public class Test 
{
	public static void main(String[] args) 
	{
		ArrayList l=new ArrayList();
		l.add(10);
		l.add(12.3);
		l.add(12);
		l.add('A');
		l.add("abc");
		l.add(null);
		l.add(15);
		int sum=0;
		for (int i = 0; i <=l.size()-1; i++)
		{
			Object obj=l.get(i);
			if(obj instanceof Integer)
			{
				Integer it=(Integer)obj;
				int a=it;
				System.out.println(a);
				sum=sum+a;
			}	
		}
		System.out.println("sum is "+sum);
	}
}
