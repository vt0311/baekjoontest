import java.util.Scanner;

public class Main1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		
		int num = sc.nextInt();
		int firstNum = num;
		
		while(true) {
			int val = (num / 10) + (num % 10); // 각자리의 수의 합을 더함.
			num = (num % 10) * 10 + (val % 10); 
			cnt++;
			if (firstNum == num) { // 만약 처음값과 num 이 같다면 반복문 빠져나옴.
				break;
			}
		}
		System.out.println(cnt);		
	}

}
