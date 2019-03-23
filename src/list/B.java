package list;

import java.util.LinkedList;

public class B 
{
	public static void main(String[] args) 
	{
		LinkedList l=new LinkedList();
		l.add(10);
		l.add(12.3);
		l.add(12.4f);
		l.add('A');
		l.add("abc");
		l.add(null);
		System.out.println(l.peekFirst());
		System.out.println(l.peekLast());
		System.out.println(l.removeFirst());
		System.out.println(l.removeLast());
		System.out.println("********");
		for(Object o:l)
		{
			System.out.println(o);
		}
	}
}
