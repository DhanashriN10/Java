package First;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println("Enter the year:");
		Scanner s=new Scanner(System.in);
		int year=s.nextInt();

		if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
		{
			System.out.println("Year is leap");
		}
		else
		{
			System.out.println("Year is not leap");
		}
	}

}
