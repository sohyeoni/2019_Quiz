package regularity;

import java.util.Scanner;

public class Quiz9 {

	public static void main(String[] args) {
		int startNum	= 0;
		int endNum		= 0;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			// 시작 값 입력
			System.out.print("시작 값을 입력하세요 : ");
			startNum = scan.nextInt();
			
			if(!(0 < startNum && startNum < 53)) {
				System.out.println("잘못 입력 하셨습니다. 다시 입력하세요!\n");
				continue;
			}
			
			// 끝 값 입력
			System.out.print("끝 값을 입력하세요 : ");
			endNum = scan.nextInt();
			
			if(startNum + endNum > 54) {
				System.out.println("출력 값 범위를 초과 하였습니다. 다시 입력하세요.\n");
				continue;
			}
			
			break;
		}
		
		//결과 값 출력
		char alphabet = ' ';
		
		if(startNum <= 26)
			alphabet = (char)(startNum + 64);
		else
			alphabet = (char)(startNum + 70);
		
		System.out.print("\n결과 값 : ");
		
		for(int i = 0; i < endNum; i++) {
			System.out.print(alphabet);
			
			if(alphabet == 'Z')
				alphabet = 'a';
			else
				alphabet++;
			
			if(i != endNum - 1)
				System.out.print(", ");
		}
	}

}
