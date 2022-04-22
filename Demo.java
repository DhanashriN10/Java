package First;

import java.util.Scanner;

public class Demo {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the fname");
		String fnm=s.next();
		System.out.println("Enter the lname");
		String lnm=s.next();

		printFullName(fnm, lnm);
	}
	public static void printFullName(String fnm,String lnm)
	{
		System.out.println("Full Name:"+fnm+"  "+lnm);
	}

}
