import java.util.Scanner;

public class Quiz16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 배열의 사이즈
		System.out.println("=======================");
		System.out.println("  행렬 사이즈(N)를 입력 하세요");
		System.out.println("=======================");
		
		//int sizeOfArray = 6;
		int sizeOfArray = scan.nextInt();
		System.out.println();
		
		// 5 * 5 배열 두개 생성
		int[][] arrayA = new int[sizeOfArray][sizeOfArray];
		int[][] arrayB = new int[sizeOfArray][sizeOfArray];
		
		// 0 ~ 100 사이 수로 중복없이 arrayA 초기화
		for(int i = 0; i < sizeOfArray; i++) {
			for(int j = 0; j < sizeOfArray; j++) {
				arrayA[i][j] = (int)(Math.random() * 101);
				
				loopA : 
				for(int k = 0; k <= i; k++)
					for(int m = 0; m < sizeOfArray; m++) {
						if(k == i && m == j)	break;
						
						if(arrayA[i][j] == arrayA[k][m]) {
							j--;
							break loopA;
						}
					}
			}
		}
		
		// 0 ~ 100 사이 수로 중복없이 arrayB 초기화
		for(int i = 0; i < sizeOfArray; i++) {
			for(int j = 0; j < sizeOfArray; j++) {
				arrayB[i][j] = (int)(Math.random() * 101);
				
				loopB : 
				for(int k = 0; k <= i; k++)
					for(int m = 0; m < sizeOfArray; m++) {
						if(k == i && m == j)	break;
						
						if(arrayB[i][j] == arrayB[k][m]) {
							j--;
							break loopB;
						}
					}
			}
		}
		
		// 행렬의 곱셈 결과 저장 배열 생성
		int[][] arrayResult = new int[sizeOfArray][sizeOfArray];

		// 행렬 곱셈 연산
		for(int i = 0; i < sizeOfArray; i++)
			for(int j = 0; j < sizeOfArray; j++)
				for(int k = 0; k < sizeOfArray; k++)
					arrayResult[i][j] += arrayA[i][k] * arrayB[k][j];
		
		// 결과 출력
		drawLine(sizeOfArray);
		
		for(int i = 0; i < sizeOfArray; i++) {
			for(int j = 0; j < sizeOfArray; j++)
				System.out.print(arrayA[i][j] + "\t");
			System.out.println();
		}
		
		drawLine(sizeOfArray);
		
		inputOperator('X', sizeOfArray);
		
		drawLine(sizeOfArray);
		
		for(int i = 0; i < sizeOfArray; i++) {
			for(int j = 0; j < sizeOfArray; j++)
				System.out.print(arrayB[i][j] + "\t");
			System.out.println();
		}
		
		drawLine(sizeOfArray);
		
		inputOperator('=', sizeOfArray);
		
		drawLine(sizeOfArray);
		
		for(int i = 0; i < sizeOfArray; i++) {
			for(int j = 0; j < sizeOfArray; j++)
				System.out.print(arrayResult[i][j] + "\t");
			System.out.println();
		}
		
		drawLine(sizeOfArray);
	}
	
	static void drawLine(int repeatNum) {
		for(int i = 0; i < repeatNum - 1; i++)
			System.out.print("========");
		System.out.println("==");
	}
	
	static void inputOperator(char operator, int sizeOfArray) {
		if(sizeOfArray % 2 == 0) {
			for(int i = 0; i < sizeOfArray - 1; i++)
				System.out.print("    ");
			System.out.println(operator);
		} else {
			for(int i = 0; i < sizeOfArray / 2; i++)
				System.out.print("        ");
			System.out.println(operator);
		}
	}

}

