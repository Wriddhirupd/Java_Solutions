package Numbers;

import java.util.*;

public class Main extends Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		Main m = new Main();

		System.out.println("Sum: " + m.sum(a, b, c));
		System.out.println("Average: " + m.average(a, b, c));
		System.out.println("Product: " + m.product(a, b, c));
		System.out.println("Minimum: " + m.smallest(a, b, c));
		System.out.println("Maximum: " + m.largest(a, b, c));
	}

	public int sum(int a, int b, int c) {
		return (a + b + c);
	}

	public int average(int a, int b, int c) {
		return ((a + b + c) / 3);
	}

	public int product(int a, int b, int c) {
		return (a * b * c);
	}

	public int smallest(int a, int b, int c) {
		int min = 0;
		if (a < b && a < c) {
			min = a;
		} else if (b < a && b < c) {
			min = b;
		} else
			min = c;
		return min;
	}

	public int largest(int a, int b, int c) {
		int max = 0;
		if (a > b && a > c) {
			max = a;
		} else if (b > a && b > c) {
			max = b;
		} else
			max = c;
		return max;

	}
}
