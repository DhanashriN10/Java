package First;

import java.util.Scanner;

public class Power_base {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the base");
		int base=s.nextInt();
		
		System.out.println("enter the power");
		int power=s.nextInt();
		int result=1;

		for(int i=1;i<=power;i++)
		{
			result=result*base;
		}
		System.out.println("Power of no:"+result);
	}
}
