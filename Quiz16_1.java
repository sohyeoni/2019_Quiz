public class Quiz16_1 {

	public static void main(String[] args) {
		int sizeOfArray = 3;
		
		// 5 * 5 �迭 �ΰ� ����
		int[][] arrayA = new int[sizeOfArray][sizeOfArray];
		int[][] arrayB = new int[sizeOfArray][sizeOfArray];
		
		// 0 ~ 100 ���� �ߺ����� arrayA �ʱ�ȭ
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
		
		// 0 ~ 100 ���� �ߺ����� arrayB �ʱ�ȭ
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
		
		// ����� ���� ��� ���� �迭 ����
		int[][] arrayResult = new int[sizeOfArray][sizeOfArray];

		// ��� ���� ����
		for(int i = 0; i < sizeOfArray; i++)
			for(int j = 0; j < sizeOfArray; j++)
				for(int k = 0; k < sizeOfArray; k++)
					arrayResult[i][j] += arrayA[i][k] * arrayB[k][j];
		
		// ��� ���
		for(int i = 0; i < sizeOfArray; i++) {
			for(int j = 0; j < sizeOfArray; j++)
				System.out.print(arrayResult[i][j] + "\t");
			System.out.println();
		}
	}
}

