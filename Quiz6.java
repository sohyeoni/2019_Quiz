package regularity;

import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
		
		int[] arrInputNum = new int[10];
		int[] arrFrequency = new int[10];
		int arrIndex = 0;
		Scanner scan = new Scanner(System.in);
		
		//키보드로부터 1 ~ 9 사이의 정수 값 10개 입력받고 배열에 저장
		while(arrIndex < arrInputNum.length) {
			//정수 값 10개 입력받기
			System.out.print((arrIndex + 1) + "번째 : ");
			int inputValue = scan.nextInt();
			
			//입력받은 값이 1 ~ 9사이면 변수 또는 배열에 저장
			if(0 <= inputValue && inputValue <= 9) {
				arrInputNum[arrIndex++] = inputValue;
			} else {
				//입력받은 값이 1 ~ 9 사이 정수값이 아닐 경우 error msg 출력 후 재입력
				System.out.println("0 ~ 9 사이의 정수를 입력하세요.");
				continue;
			}
		}
		System.out.println();
		
		//입력 받은 값 10개 출력
		System.out.print("입력값 : ");
		for(int i = 0 ; i < arrInputNum.length; i++ ) {
			System.out.print(arrInputNum[i]);
			
			if(i < arrInputNum.length - 1 )
				System.out.print(", ");
		}
		System.out.println("\n");
		
		//입력 받은 값들에 대한 입력 빈도 계산
		for(int i = 0; i < arrFrequency.length; i++) {
			for(int j = 0; j < arrInputNum.length; j++) {
				if(i == arrInputNum[j])
					arrFrequency[i]++;
			}
		}
		
		//입력 빈도 출력
		int count = 0;
		System.out.println("입력 빈도");
		for(int i = 0; i < arrFrequency.length; i++) {
			if(arrFrequency[i] != 0) {
				count++;
				System.out.printf("%d) %d : %d회\n", count, i, arrFrequency[i]);
			}
		}
		System.out.println();
	    
		
		//히스토그램 출력
		System.out.println("히스토그램");
		
		char[][] arrHistogram = new char[12][12];
		
		//x, y축 초기화..?
		for(int i = 0; i < arrHistogram.length; i++) {
			//x축 숫자
			int tmp2 = i - 1;
			if(0 < tmp2 && tmp2 < 10)
				arrHistogram[11][i] = (char)(i - 1 + '0');
			
			//y축 숫자
			int tmp = 10 - i;
			if(tmp % 2 == 0 && tmp != 10 && tmp != 0)
				arrHistogram[i][0] = (char)(tmp + '0');
			
			//y축 |
			arrHistogram[i][1] = '|';
			
			//x축 -
			arrHistogram[10][i] = '-';
		}
		
		//히스토그램 배열에 빈도수 넣기
		for(int i = 1; i < arrFrequency.length; i++) {
			for(int j = 10 - arrFrequency[i]; j < 10; j++) {
				arrHistogram[j][i+1] = '$';
			}
		}
		
		//히스토그램 완성본 출력
		for(int i = 0; i < arrHistogram.length; i++) {
			for(int j = 0; j <arrHistogram[i].length; j++) {
				System.out.print("\t" + arrHistogram[i][j]);
			}
			System.out.println();
		}
	}

}
