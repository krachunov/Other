package playTech;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
	// Find sum of fibonachi num.
	public static int fibonachiNum(int n) {
		int sum = 0;
		int fibFirst = 1;
		int fibSecond = 2;
		sum += fibFirst;
		sum += fibSecond;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			temp = fibSecond;
			fibSecond += fibFirst;
			fibFirst = temp;
			sum += fibSecond;
		}
		return sum;
	}

	public static int numSum(int n) {
		int m1 = 3;
		int m2 = 5;
		int sum = 0;
		List<Integer> listNumbers = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			listNumbers.add(i);
		}
		for (Integer integer : listNumbers) {
			if (integer % m1 == 0 || integer % m2 == 0) {
				sum += integer;
			}
		}

		return sum;
	}

	// Rounded num if num is 12.53 -> 13 if num is 12.49->12
	public static double round(double num) {
		int current = (int) num;
		double roundenNum = num - current;
		if (roundenNum >= 0.50) {
			return ++current;
		} else {
			return current;
		}
	}

	public static void main(String[] args) {

		System.out.println(fibonachiNum(5));

		System.out.println(numSum(10));

		System.out.println(round(12.49));

	}
}
