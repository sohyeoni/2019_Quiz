package regularity;

import java.util.Scanner;

public class Quiz8_2 {

	public static void main(String[] args) {
		final int	MAX_SIZE = 50;
		int			randomValues[] = new int[MAX_SIZE];
		
		Scanner scan = new Scanner(System.in);
		
		// 1 ~ 200 사이의 정수형 난수를 발생하여 배열에 저장 : 50개
		for(int i = 0; i < MAX_SIZE; i++) {
			randomValues[i] = (int)(Math.random() * 200) + 1;
			
			for(int j = 0; j < i; j++) {
				if(randomValues[i] == randomValues[j]) {
					i--;
					break;
				}
			}
		}
		
		// 배열 출력
		for(int i = 0; i < MAX_SIZE; i++) {
			System.out.print("\t" + randomValues[i]);
			
			if((i + 1) % 5 == 0 && i != 0)
				System.out.println();
		}
		
		// 배수 값 입력
		int inputNum = 0;
		
		do {
			System.out.print("\n배수 값 검색 용 정수를 입력하세요(1이상 정수) ");
			inputNum = scan.nextInt();
			
			if(inputNum <= 0) System.out.println("잘못된 입력.");
		} while(inputNum <= 0);
		
		//배수값 출력
		int count = 0;
		
		System.out.println("\n\n" + inputNum + "배수 값");
		for(int i = 0; i < MAX_SIZE; i++) {
			if(randomValues[i] % inputNum == 0) {
				System.out.print("\t" + randomValues[i]);
				count++;
				
				if(count % 5 == 0)
					System.out.println();
			}
		}
		
		// 배수 총 개수 출력
		System.out.println("\n\n" + inputNum + " 배수 값 갯수 : " + count);
	}
}
