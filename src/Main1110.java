import java.util.Scanner;

public class Main1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		
		int num = sc.nextInt();
		int firstNum = num;
		
		while(true) {
			int val = (num / 10) + (num % 10); // ���ڸ��� ���� ���� ����.
			num = (num % 10) * 10 + (val % 10); 
			cnt++;
			if (firstNum == num) { // ���� ó������ num �� ���ٸ� �ݺ��� ��������.
				break;
			}
		}
		System.out.println(cnt);		
	}

}
