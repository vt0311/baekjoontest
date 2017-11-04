import java.util.Scanner;

	public class Main10809 {

		public static void main(String[] args) {
		
				Scanner scanner = new Scanner(System.in);
	
				// 사용자로부터 단어를 입력받음.
				String word = scanner.next();
		
				// a의 아스키 코드 : 97, z의 아스키 코드 : 122
				for (char i = 97; i <= 122 ; i++) {
					System.out.print(word.indexOf(i) + " ");
				}
					
		}

}
