package report;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		int menuNum = 0;
		int dan = 0;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			//메뉴 출력 후 사용자로부터 입력받기
			do {
				System.out.println("---------------------");
				System.out.println("1. 구구단 출력\n2. 프로그램 종료");
				System.out.println("---------------------");
				
				menuNum = scan.nextInt();
				
				//입력값이 1이나 2가 아니면 에러msg출력
				if(menuNum != 1 && menuNum != 2)
					System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			} while(menuNum != 1 && menuNum != 2);
			
			//메뉴 2번을 선택했을 경우 종료msg출력 후 종료
			if(menuNum == 2) {
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}
			
			//메뉴 1번을 선택했을 경우 단입력받은 후 구구단 출력
			if(menuNum == 1) {
				//출력할 단 입력msg출력
				System.out.println("출력할 구구단의 단을 입력하세요. 구구단의 단은 2~9 사이 입력");
				do {
					//단 입력받기
					dan = scan.nextInt();
					
					//입력받은 단이 2~9가 아니면 에러msg출력
					if(!(2 <= dan && dan <= 9))
						System.out.println("2~9사이 정수를 입력해주세요.");
				} while(!(2 <= dan && dan <= 9));
				
				//입력받은 단의 구구단 출력
				for(int i=1; i<=9; i++)
					System.out.printf("%d X %d = %d\n", dan, i, dan*i);
			}
		}
	}

}
