package list;

import java.util.ArrayList;

public class A
{
	public static void main(String[] args)
	{
		ArrayList l=new ArrayList();
		for(int i=0;i<=10;i++)
		{
			l.add(i);
		}
		System.out.println(l.size());
		l.add(11);
		
		System.out.println(l);
		
		System.out.println(l.size());
	}
}
