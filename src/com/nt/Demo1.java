package com.nt;

public class Demo1 {

	public static void main(String[] args) {
		String s="abc";
		String sss="abc";
		String s1="aa";
		String s2="bb";
		
		String s3=s+s1+s2;
		String s4=s+s1;
		String s5=s+s1;
		System.out.println(s4.hashCode()==s5.hashCode());
		System.out.println(s4.equals(s5));
		System.out.println(s4==s5);
		System.out.println(s==sss);
		
		
		
		int count=0;
		int[] a=new int[4];
		System.out.println("==== "+a.length);//4
		
		
		a[0]=s.hashCode();
		a[1]=s1.hashCode();
		a[2]=s2.hashCode();
		System.out.println("*********: "+a.length);//4
		a[3]=s3.hashCode();
		
		int[] ffff={10,20,30};
		
		//ffff[3]=20;
		System.out.println(ffff.length);//RE
		
		for(int c=0;c<=3;c++){
			System.out.println(a[c]);
			for(int j=c+1;j<=3;j++){
				if(c!=j){
					count++;
				}
			}
			System.out.println("count:"+ count);
			
		}
		
		
		
		System.out.println(s.hashCode()+" "+s1.hashCode());
		int ss=0;
		if(s.hashCode()!=s1.hashCode()){
			ss++;
			
		}
		System.out.println(ss);
		
	}

}
