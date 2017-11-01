import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int count = 1;
		int first = a / 10;
		int second = a % 10;
		int result = first + second;

		while (true) {
            if (a < 10) { // 만약 10보다 작다면
				count = 1; 
				break;
			}

			first = second;
			second = result;


			if (first==a/10 && second == a%10) {
				break;
			} else {
				count++;
			}
			result = (first+second) % 10;

		}
		System.out.println(count);
	}
}