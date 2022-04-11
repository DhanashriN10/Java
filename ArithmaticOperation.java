package First;

import java.util.Scanner;

public class ArithmaticOperation {

	public static void add(int a, int b)
	{
		System.out.println("Addition:"+(a+b));
	}

	public static int sub(int a,int b)
	{
		return a-b;
    }
	
	public static void mul(int a, int b)
	{
		System.out.println("Multiplication:"+(a*b));
	}

	public static void div(int a,int b)
	{
		System.out.println("Division:"+(a/b));
	}
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=s.nextInt();
		System.out.println("Enter the second number:");
		int b=s.nextInt();
		add(a, b);
		System.out.println("Substraction:"+sub(a, b));
		mul(a,b);
		div(a, b);
	}
}
