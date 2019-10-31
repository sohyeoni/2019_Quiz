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
		
		if(inputDirection == 1) {
			while(true) {
				// �� -> ��
				// index1 ����, index2 ����
				for(int i = 0; i < repeatRange; i++) {
					if(number > arrSize * arrSize)
						break;
					
					array[index1][index2] = number;
					
					index2++;
					number++;
				}
				
				// �� -> �Ʒ�
				// index1 ����, index2 ����
				for(int i = 0; i < repeatRange; i++) {
					if(number > arrSize * arrSize)
						break;
					
					array[index1][index2] = number;
					
					index1++;
					number++;
				}
				
				// �� -> ��
				// index1 ����, index2 ����
				for(int i = 0; i < repeatRange; i++) {
					if(number > arrSize * arrSize)
						break;
					
					array[index1][index2] = number;
					
					index2--;
					number++;
				}
				
				// �Ʒ� -> ��
				// index1 ����, index2 ����     
				for(int i = 0; i < repeatRange; i++) {
					if(number > arrSize * arrSize)
						break;
					
					array[index1][index2] = number;
					
	//				if(i < repeatRange - 1)		index1--;
	//				else						index2++;
					index1--;
					number++;
					
					// ������ ����� index�� ����
					if(i == repeatRange - 1) {
						index1++;
						index2++;
					}
				}
				
				repeatRange -= 2;
				
				if(number > arrSize * arrSize)
					break;
			}
		} else if(inputDirection == 2){
			while(true) {
				// �� -> �Ʒ�
				// index1 ����, index2 ����
				for(int i = 0; i < repeatRange; i++) {
					if(number > arrSize * arrSize)
						break;
					
					array[index1][index2] = number;
					
					index1++;
					number++;
				}
				
				// �� -> ��
				// index1 ����, index2 ����
				for(int i = 0; i < repeatRange; i++) {
					if(number > arrSize * arrSize)
						break;
					
					array[index1][index2] = number;
					
					index2++;
					number++;
				}
				
				// �Ʒ� -> ��
				// index1 ����, index2 ����     
				for(int i = 0; i < repeatRange; i++) {
					if(number > arrSize * arrSize)
						break;
					
					array[index1][index2] = number;
					
					index1--;
					number++;
				}
				
				// �� -> ��
				// index1 ����, index2 ����
				for(int i = 0; i < repeatRange; i++) {
					if(number > arrSize * arrSize)
						break;
					
					array[index1][index2] = number;
					
					index2--;
					number++;
					
					// ������ ����� index�� ����
					if(i == repeatRange - 1) {
						index1++;
						index2++;
					}
				}
				
				repeatRange -= 2;
				
				if(number > arrSize * arrSize)
					break;
			}
		}
		
		// �迭 ���
		for(int i = 0; i < arrSize; i++) {
			for(int j = 0; j < arrSize; j++)
				System.out.printf("%-5d", array[i][j]);
			System.out.println();
		}
	}

}