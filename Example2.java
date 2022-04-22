package First;

import java.util.Scanner;

public class Example2 {
	
	public static void quotient(int a,int b)
	{
		System.out.println("Division:"+(a/b));
	}
	
	public static void remainder(int a,int b)
	{
		System.out.println("Remainder:"+(a%b));
	}
	
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);

		System.out.println("Enter the second number:");
		int a=s.nextInt();
		System.out.println("Enter the second number:");
		int b=s.nextInt();
		quotient(a, b);
		remainder(a, b);
	}

}
