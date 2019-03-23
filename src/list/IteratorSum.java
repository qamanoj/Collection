package list;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorSum {
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(10);
		l.add(12.3);
		l.add(12);
		l.add('A');
		l.add("abc");
		l.add(null);
		l.add(15);
		int sum=0;
		Iterator a= l.iterator();
		while(a.hasNext())
		
		{
			Object obj=a.next();
			if(obj instanceof Integer)
			{
				Integer it=(Integer)obj;
				int a1=it;
				System.out.println(a1);
				sum=sum+a1;
			}	
		}
		
		System.out.println("sum is "+sum);
	}
}
