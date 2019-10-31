package regularity;

import java.util.Scanner;

public class Quiz5_1 {

	public static void main(String[] args) {
		int[] inputNum = new int[5];
		Scanner scan = new Scanner(System.in);
		
		//사용자로부터 정수 5개 입력, 입력 범위 : 1~
		//입력 받은 값 배열에 저장
		System.out.println("정수 5개를 입력하세요.");
		
		int iCount = 0;
		
		while(iCount < 5) {
			System.out.print( (iCount + 1) + "번째 숫자 : " );
			inputNum[iCount] = scan.nextInt();
			
			if(inputNum[iCount] <= 0) {
				System.out.println("잘못 입력하셨습니다. 0보다 큰 수를 입력해주세요.");
				continue;
			}
			
			iCount++;
		}
		System.out.println();
		
		//입력 받은 값 입력 순서대로 출력
		System.out.print("Inserted values: ");
		
		for(int i = 0; i<inputNum.length; i++) {
			System.out.print(inputNum[i]);
			
			if(i < inputNum.length-1)
				System.out.print(", ");
		}
		System.out.println("\n");
		
		//배열 정렬
		for(int i=0; i<inputNum.length-1; i++) {
			for(int j=0; j<inputNum.length-i-1; j++) {
				if(inputNum[j] > inputNum[j+1]) {
					int tmp = inputNum[j];
					inputNum[j] = inputNum[j+1];
					inputNum[j+1] = tmp;
				}
			}
		}
		
		//최대값, 최소값 출력
		System.out.println("Maximum value: " + inputNum[4]);
		System.out.println("Minimum value: " + inputNum[0]);
		
		//중간값 출력
		//n개의 자료 : n = 홀수 (n+1)/2, n = 짝수 n/2
		int medianIndex = 0;
		
		if(inputNum.length / 2 == 0)
			medianIndex = inputNum.length / 2;
		else
			medianIndex = (inputNum.length + 1) / 2;
		
		System.out.println("Median value: " + inputNum[medianIndex-1]);
	}
}
