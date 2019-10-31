package regularity;

import java.util.Scanner;

public class Quiz2_2 {

	public static void main(String[] args) {
		//String input = "";
		int count = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			//키보드로부터 정수 값 입력
			String input = scan.nextLine();
			
			//q를 입력하면 종료
			if(input.charAt(0) == 'q') {
				System.out.println("이용해주셔서 감사합니다");
				break;
			}
			
			//음수면 다시 입력
			if(input.charAt(0) == '-') {
				System.out.println("1이상 양수를 입력해주세요");
				continue;
			}
			
			//양수면 여기 코드 실행
			//입력받은 문자열을 integer로 변환
			int num = 0;
			num = Integer.parseInt(input);
			
			//입력값 출력
			System.out.println(++count + "번째 입력 값은 = " + input);
			
			//입력값이 짝수인지 홀수인지 판별
			if(num % 2 == 0)	
				System.out.printf("\t짝수 입니다.\n");
			else				
				System.out.printf("\t홀수 입니다.\n");
			
			//입력값이 3이나 7의 배수인지 판별
			if(num % 3 == 0)
				System.out.printf("\t3의 배수 입니다.\n");
			if(num % 7 == 0)
				System.out.printf("\t7의 배수 입니다.\n");
		}
	}
}
