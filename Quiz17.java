import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
		int arrSize = 0;
		Scanner scan = new Scanner(System.in);
		
		// N ����� ũ�� N�� �Է�, 2 ~ 10 ������ ��, �ܴ̿� ����ó��
		System.out.println("��� N�� ũ�⸦ �Է��ϼ���:");
		
		do {
			arrSize = scan.nextInt();
			
			if(!(2 <= arrSize && arrSize <= 10))
				System.out.println("\n2 ~ 10 ������ ���� �Է��ϼ���.");
		} while(!(2 <= arrSize && arrSize <= 10));
		System.out.println("\n====================\n");
		
		// ������ ��� ���� ���� �Է�
		System.out.println("������ ����� ���� ������(1: �ð�, 2: �ݽð�):");
		
		int inputDirection = scan.nextInt();
		
		System.out.println("\n\n-------------------------------------\n");
		
		// arrSizeũ���� 2���� �迭 ����
		int[][] array = new int[arrSize][arrSize];
		
		// �迭�� �ʱ�ȭ
		int number = 1;
		int repeatRange = arrSize - 1;
		int index1 = 0, index2 = 0;
		
		// turn �ʱⰪ�� �������� ������ ����
		int turn = inputDirection;
		
		while(true) {
			if(turn == 1) {
				// �� -> ��
				// index1 ����, index2 ����
				for(int i = 0; i < repeatRange; i++) {
					if(number > arrSize * arrSize)
						break;
					
					array[index1][index2] = number;
					
					index2++;
					number++;
				}
			} else if(turn == 2) {
				// �� -> �Ʒ�
				// index1 ����, index2 ����
				for(int i = 0; i < repeatRange; i++) {
					if(number > arrSize * arrSize)
						break;
					
					array[index1][index2] = number;
					
					index1++;
					number++;
				}
			} else if(turn == 3) {
				// �� -> ��
				// index1 ����, index2 ����
				for(int i = 0; i < repeatRange; i++) {
					if(number > arrSize * arrSize)
						break;
					
					array[index1][index2] = number;
					
					index2--;
					number++;
				}
			} else if(turn == 4) {
				// �Ʒ� -> ��
				// index1 ����, index2 ����     
				for(int i = 0; i < repeatRange; i++) {
					if(number > arrSize * arrSize)
						break;
					
					array[index1][index2] = number;
					
					index1--;
					number++;
				}
			}
			
			// ������ ����� index�� ����
			if((inputDirection == 1 && turn == 4) || (inputDirection == 2 && turn == 3)) {
				index1++;
				index2++;
				
				repeatRange = repeatRange > 2 ? repeatRange - 2 : 1;
			}
			
			// ���� ���� ����
			// �ð����	: 1 > 2 > 3 > 4 > 1 > 2 ...
			// �ݽð����	: 2 > 1 > 4 > 3 > 2 > 1 ...
			if(inputDirection == 1)
				turn = turn < 4 ? turn + 1 : 1 ;
			else if(inputDirection == 2)
				turn = turn > 1 ? turn - 1 : 4 ;
			
			if(number > arrSize * arrSize)
				break;
		}
		
		// �迭 ���
		for(int i = 0; i < arrSize; i++) {
			for(int j = 0; j < arrSize; j++)
				System.out.printf("%-5d", array[i][j]);
			System.out.println();
		}
	}

}
