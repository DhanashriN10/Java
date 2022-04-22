package First;

import java.util.Scanner;

public class Example {
	
	public static void intnumber(int  a)
	{
		System.out.println("Integer Number:"+a);
	}
	
	public static void add(int a, int b)
	{
		System.out.println("Addition:"+(a+b));
	}
	
	public static void floatmulti(float p, float q)
	{
		System.out.println("Multiplication:"+(p*q));
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=s.nextInt();
		intnumber(a);
		
		System.out.println("Enter the First number:");
		int x=s.nextInt();
		System.out.println("Enter the second number:");
		int y=s.nextInt();
		add(x, y);
		
		System.out.print("Enter the float no:");
		float p=s.nextFloat();
		System.out.print("Enter the second float number");
		float q=s.nextFloat();
		floatmulti(p, q);
	}



}
