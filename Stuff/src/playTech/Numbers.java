package playTech;

public class Numbers {
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

	public static void main(String[] args) {
		int fibonachiNum = fibonachiNum(5);
		System.out.println(fibonachiNum);
	}
}
