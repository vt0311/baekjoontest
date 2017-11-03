import java.util.Scanner;

	public class Main10809 {

		public static void main(String[] args) {
		
				Scanner scanner = new Scanner(System.in);
	
				String input = scanner.next();
		
				// A(a) - Z(z) 의 개수(26) 배열 선언
				int[] alpha = new int[26];
		
				// 알파벳 배열(alpha)의 아스키코드 값 – a(97) 번째 값을 올림
				// ex) charAt(0)이 j라면 j(106) – a(97) = 9
				for(int i = 0; i < input.length(); i ++){
					alpha[input.charAt(i) - 'a'] ++;
				}
		
				for(int i = 0; i < alpha.length; i ++){
					 System.out.print(alpha[i] + " ");
				}
		}

}
