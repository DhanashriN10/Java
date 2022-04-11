package First;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int cnt_head=0,cnt_tail=0;
		double head,tail;

		System.out.println("How many times you want to flip coin:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{     
			double value=Math.random();
			System.out.println("Value:"+value*2);
			if(value<0.5)
			{
				cnt_head++;
			}
			else
			{
				cnt_tail++;
			}
		}
		head = cnt_head / (double) n * 100;
		tail = cnt_tail / (double) n * 100;
		System.out.println("Percentage of heads: " + head + "%");
		System.out.println("Percentage of tails: " + tail + "%");
	}
}
