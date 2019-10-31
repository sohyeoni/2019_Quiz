package regularity;

import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		int		round		= 0;
		int[]	result		= new int[3];
		int[]	randomArray = new int[3];
		
		// 중복없는 3개의 정수 생성
		for(int i = 0; i < randomArray.length; i++) {
			randomArray[i] = (int)(Math.random() * 10);
			
			for(int j = 0; j < i; j++) {
				if(randomArray[j] == randomArray[i])
					i--;
			}
		}
		
		//랜덤배열 출력
//		for(int i : randomArray)
//			System.out.print(i + " ");
//		System.out.println();
			
		do {
			//시도 횟수 count
			System.out.println("시도횟수: " + ++round);
			
			// 키보드로부터 3개의 정수를 입력 받기
			System.out.println("정수 3개를 입력하세용~~^__^");
			
			Scanner scan = new Scanner(System.in);
			String inputNum = scan.nextLine();
			System.out.println();
			
			int[]	inputNumArray	= new int[inputNum.length() - 2];
			int 	index			= 0;
			
			// 문자열로 입력받은 수를 int배열에 저장
			for(int i = 0; i < inputNum.length(); i++) {
				if(inputNum.charAt(i) != ' ')
					inputNumArray[index++] = inputNum.charAt(i) - '0';
			}
			
			// strike와 ball 초기화
			result[0] = 0;
			result[1] = 0;
			
			// strike, ball판별
			for(int i = 0; i < randomArray.length; i++) {
				for(int j = 0; j < inputNumArray.length; j++) {
					if(randomArray[i] == inputNumArray[j]) {
						// i와 j가 같으면 strike + 1, 다르면 ball + 1
						if(i == j)
							result[0]++;
						else
							result[1]++;
					}
				}
			}
			
			// out 판별
			if(result[0] == 0 && result[1] == 0)
				result[2]++;
			
			// 결과 출력
			if(result[0] == 0 && result[1] == 0) {
				System.out.print("Out: 아웃 " + result[2] + "번");
			} else {
				if(result[0] != 0)
					System.out.print(result[0] + " Strike ");
				
				if(result[1] != 0)
					System.out.print(result[1] + " Ball ");
			}
			System.out.println("\n\n");
		} while(round < 4 && result[2] != 2 && result[0] != 3);
		
		// 게임 종료
		if(round >= 4 || result[2] == 2) {
			if(round >= 4)
				System.out.println("게임횟수 초과");
			
			System.out.println("아까비~~~졌네용..");
			System.out.printf("정답은: %d %d %d 입니다.", randomArray[0], randomArray[1], randomArray[2]);
		} else {
			System.out.println("이겼습니다^__^v");
		}
	}

}
