package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class Sample 
{
	public static void main(String[] args) 
	{
		LinkedList l=new LinkedList();
		System.out.println(l.isEmpty());
		l.add(10);
		l.add(12.3);
		l.add(12.4f);
		l.add('A');
		l.add("abc");
		l.add(null);
		System.out.println(l.isEmpty());
		System.out.println(l.size());
		for (int i = 0; i <=l.size()-1; i++)
		{
			System.out.println(l.get(i));
		}
		for(Object obj:l)
		{
			System.out.println(obj);
		}
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		ListIterator it1=l.listIterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		while(it1.hasPrevious())
		{
			System.out.println(it1.previous());
		}
		
	}
}
