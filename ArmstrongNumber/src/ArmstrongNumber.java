import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int sum = 0, r, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = sc.nextInt();
		temp = num;
		while (num > 0) {
			r = num % 10;
			sum = sum + (r * r * r);
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not a Armstrong Number");
		}
	}
}
