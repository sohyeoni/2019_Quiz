package regularity;

import java.util.Scanner;

public class J2_Q2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// M값 입력
		System.out.println("M값을 입력하세요");
		int mValue = scan.nextInt();
		
		// N값 입력
		System.out.println("N값을 입력하세요");
		int nValue = scan.nextInt();
		
		// M과 N 크기 비교
		// M < N일 경우, M에서 N까지 정수 출력
		if(mValue < nValue) {
			System.out.printf("M : %d ~ N : %d사이 정수 값은\n", mValue, nValue);
			
			for(int i = mValue; i <= nValue; i++) {
				System.out.print(i);
				
				if(i < nValue)
					System.out.print(", ");
			}
		} else if(mValue > nValue) {
			// M > N일 경우, N에서 M까지 정수 출력
			System.out.printf("N : %d ~ M : %d사이 정수 값은\n", nValue, mValue);
			
			for(int i = mValue; i >= nValue; i--) {
				System.out.print(i);
				
				if(i > nValue)
					System.out.print(", ");
			}
		} else {
			// M == N일 경우, 입력값 출력
			System.out.print("N, M 정수 값 : " + mValue);
		}
		
		// 종료 msg
		System.out.println();
		System.out.println("----감사합니다----");
	}

}
