import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
		int arrSize = 0;
		Scanner scan = new Scanner(System.in);
		
		// N 행렬의 크기 N을 입력, 2 ~ 10 사이의 값, 이외는 예외처리
		System.out.println("행렬 N의 크기를 입력하세요:");
		
		do {
			arrSize = scan.nextInt();
			
			if(!(2 <= arrSize && arrSize <= 10))
				System.out.println("\n2 ~ 10 사이의 값을 입력하세요.");
		} while(!(2 <= arrSize && arrSize <= 10));
		System.out.println("\n====================\n");
		
		// 달팽이 행렬 생성 방향 입력
		System.out.println("달팽이 행렬의 생성 방향은(1: 시계, 2: 반시계):");
		
		int inputDirection = scan.nextInt();
		
		System.out.println("\n\n-------------------------------------\n");
		
		// arrSize크기의 2차원 배열 생성
		int[][] array = new int[arrSize][arrSize];
		
		// 배열에 초기화
		int number = 1;
		int repeatRange = arrSize - 1;
		int index1 = 0, index2 = 0;
		
		// turn 초기값을 생성방향 값으로 설정
		int turn = inputDirection;
		
		while(true) {
			if(turn == 1) {
				// 왼 -> 오
				// index1 고정, index2 증가
				for(int i = 0; i < repeatRange; i++) {
					if(number > arrSize * arrSize)
						break;
					
					array[index1][index2] = number;
					
					index2++;
					number++;
				}
			} else if(turn == 2) {
				// 위 -> 아래
				// index1 증가, index2 고정
				for(int i = 0; i < repeatRange; i++) {
					if(number > arrSize * arrSize)
						break;
					
					array[index1][index2] = number;
					
					index1++;
					number++;
				}
			} else if(turn == 3) {
				// 오 -> 왼
				// index1 고정, index2 감소
				for(int i = 0; i < repeatRange; i++) {
					if(number > arrSize * arrSize)
						break;
					
					array[index1][index2] = number;
					
					index2--;
					number++;
				}
			} else if(turn == 4) {
				// 아래 -> 위
				// index1 감소, index2 고정     
				for(int i = 0; i < repeatRange; i++) {
					if(number > arrSize * arrSize)
						break;
					
					array[index1][index2] = number;
					
					index1--;
					number++;
				}
			}
			
			// 다음에 사용할 index값 세팅
			if((inputDirection == 1 && turn == 4) || (inputDirection == 2 && turn == 3)) {
				index1++;
				index2++;
				
				repeatRange = repeatRange > 2 ? repeatRange - 2 : 1;
			}
			
			// 실행 순서 세팅
			// 시계방향	: 1 > 2 > 3 > 4 > 1 > 2 ...
			// 반시계방향	: 2 > 1 > 4 > 3 > 2 > 1 ...
			if(inputDirection == 1)
				turn = turn < 4 ? turn + 1 : 1 ;
			else if(inputDirection == 2)
				turn = turn > 1 ? turn - 1 : 4 ;
			
			if(number > arrSize * arrSize)
				break;
		}
		
		// 배열 출력
		for(int i = 0; i < arrSize; i++) {
			for(int j = 0; j < arrSize; j++)
				System.out.printf("%-5d", array[i][j]);
			System.out.println();
		}
	}

}
