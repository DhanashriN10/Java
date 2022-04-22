package First;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter the array element:");
		for(int i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Array element is:");
		for(int i=0;i<5;i++)
		{
			if(i>=1 && i<4) {
				System.out.println(a[i]);
			}

		}





	}

}
