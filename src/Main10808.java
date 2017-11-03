import java.util.Scanner;

	public class Main10808 {

		public static void main(String[] args) {
		
				Scanner scanner = new Scanner(System.in);
	
				String input = scanner.next();
		
				// A(a) - Z(z) 의 개수(26) 배열 선언
				int[] alpha = new int[26];
		
				for(int i = 0; i < alpha.length; i ++){
					alpha[i] = -1;
					System.out.println("alpha2["+i+"]:"+alpha[i]);
				}
				
				// 알파벳 배열(alpha)의 아스키코드 값 – a(97) 번째 값을 올림
				// ex) charAt(0)이 j라면 j(106) – a(97) = 9
				for(int i = 0; i < input.length(); i ++){
					if(0 > alpha[input.charAt(i) - 'a']) {
						alpha[input.charAt(i) - 'a'] = i;
					
					System.out.println("alpha["+i+"]:"+alpha[i]);
				 }
				}
		
				for(int i = 0; i < alpha.length; i ++){
					 //System.out.print(alpha[i] + " ");
					 System.out.println("alpha["+i+"]:"+alpha[i] + " ");
				}
		}

}
