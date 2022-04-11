package First;

public class Power_of_Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int num, mul = 1;

				
				num = Integer.parseInt(args[5]);

				
				if (num > 31) {
					System.out.println("value of number should be less than 31");
					return;
				}

				// COMPUTATION
				else {
					//System.out.println(mul);
					for (int j = 1; j <= num; j++) {
						mul = mul * 2;
						System.out.println(mul);
					}
				}
	}

}
