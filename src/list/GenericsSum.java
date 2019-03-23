package list;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsSum 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> l=new ArrayList();
		l.add(10);
		l.add(12);
		l.add(15);
		int sum=0;
		/*Iterator it=l.iterator();
		while(it.hasNext())
		{
			Object obj=it.next();
			if(obj instanceof Integer)
			{
				Integer it1=(Integer)obj;
				int a=it1;
				sum=sum+a;
				System.out.println(a);
			}
		}*/
		
		/*for(Integer i:l)
		{
			int a=i;
			sum=sum+a;
		}
		System.out.println("sum is "+sum);*/
		
		for (int i = 0; i<=l.size()-1; i++) 
		{
			Object obj=l.get(i);
			if(obj instanceof Integer)
			{
				Integer it=(Integer)obj;
				int it1=it;
				sum=sum+it1;
			}
		}
		System.out.println(sum);
	}
}
