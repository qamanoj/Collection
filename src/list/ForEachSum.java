package list;

import java.util.ArrayList;

public class ForEachSum 
{
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
		for(Object a:l)
		{
			Object obj=a;
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
