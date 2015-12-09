package digit;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Pi implements TestInterface{
	public static void main(String[] args) {
		
	
		System.out.println("Enter the number of digit after dot");
		Scanner sc = new Scanner(System.in);
		final int N = 1000;
		final int digitAfterDot = sc.nextInt();
		sc.close();

		BigDecimal sum = new BigDecimal(0); 
		BigDecimal term = new BigDecimal(0); 
		BigDecimal sign = new BigDecimal(1.0); 

		BigDecimal one = new BigDecimal(1.0);
		BigDecimal two = new BigDecimal(2.0);

		for (int k = 0; k < N; k++) {
			BigDecimal count = new BigDecimal(k);
			// term = 1.0/(2.0*k + 1.0);
			BigDecimal temp1 = two.multiply(count);
			BigDecimal temp2 = temp1.add(one);
			term = one.divide(temp2, digitAfterDot, BigDecimal.ROUND_FLOOR);

			// sum = sum + sign*term;
			BigDecimal temp3 = sign.multiply(term);
			sum = sum.add(temp3);

			sign = sign.negate();
		}
		BigDecimal pi = new BigDecimal(0);
		BigDecimal four = new BigDecimal(4);
		pi = sum.multiply(four);

		System.out.println("pi: " + pi);
	
	}

	@Override
	public void someMethod() {
		// TODO Auto-generated method stub
		
	}

}
