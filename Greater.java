package First;

import java.util.Scanner;

public class Greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("enter the first number:");
		int x=s.nextInt();
		System.out.println("enter the second number:");
		int y=s.nextInt();

		if(x>y)
		{
			System.out.println("x is greater than y");
		}
		else
		{
			System.out.println("y is greater than x");
		}

	}

}
