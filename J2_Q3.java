package regularity;

import java.util.Scanner;

public class J2_Q3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 배열 개수 입력
		System.out.println("배열의 개수를 입력하세요.");
		
		int arrayLength = 0;
		
		while(true) {
			arrayLength = scan.nextInt();
			
			// 1보다 작을 경우 error msg 출력 후 재입력
			if(arrayLength < 1) {
				System.out.println("1 이상의 값을 입력하세요.");
				continue;
			}
				
			break;
		}
		System.out.println();
		
		// 배열의 개수 출력
		System.out.println("배 열 의    개수 : " + arrayLength);
		
		// arrayLength개의 정수형 배열 선언
		int[] randomArray = new int[arrayLength];
		
		for(int i = 0; i < arrayLength; i++) {
			// -50 ~ 50 사이의 난수 발생
			randomArray[i] = (int)(Math.random() * 101) - 50;
			
			// 배열에 있는 수면 제외
			for(int j = 0; j < i; j++) {
				if(randomArray[i] == randomArray[j]) {
					i--;
					break;
				}
			}
		}
		
		// 배열 내 난수 출력
		System.out.print("배열 내 난수 값 : ");
		
		for(int i = 0; i < arrayLength; i++) {
			System.out.print(randomArray[i]);
			
			if(i < arrayLength - 1)
				System.out.print(", ");
		}
		System.out.println();
		
		// 배열 sort
		for(int i = 0; i < arrayLength - 1; i++) {
			for(int j = 0; j < arrayLength - 1 - i; j++) {
				// 앞 인덱스의 값이 뒤 인덱스의 값보다 클 경우 자리 바꿈
				if(randomArray[j] > randomArray[j + 1]) {
					int tmp = randomArray[j];
					randomArray[j] = randomArray[j + 1];
					randomArray[j + 1] = tmp;
				}
			}
		}
		
		// 최대값 출력
		System.out.println("최     대      값 : " + randomArray[arrayLength - 1]);
		
		// 최소값 출력
		System.out.println("최     소      값 : " + randomArray[0]);
		
		// 평균값 출력
		float avgValue = 0;
		
		for(int i = 0; i < arrayLength; i++)
			avgValue += randomArray[i];
		
		avgValue = avgValue / arrayLength;
		
		System.out.println("평     균      값 : " + avgValue);
		System.out.println();
		
		// 히스토그램 출력
		int range1 = -50, range2 = -41;
		
		System.out.println("히스토그램");
		
		for(int i = 0; i < 10; i++) {
			System.out.printf(" %3s ~ %3s : ", range1 + "", range2 != -1 ? range2 + "" : "- 1");
			
			for(int j = 0; j < arrayLength; j++) {
				if(range1 <= randomArray[j] && randomArray[j] <= range2) {
					System.out.print("*");
				}
			}
			System.out.println();
			
			range1 += 10;
			range2 += 10;
			
			if(range2 == 49) range2++;
		}
	}

}
