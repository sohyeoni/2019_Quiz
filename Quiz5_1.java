package regularity;

import java.util.Scanner;

public class Quiz5_1 {

	public static void main(String[] args) {
		int[] inputNum = new int[5];
		Scanner scan = new Scanner(System.in);
		
		//����ڷκ��� ���� 5�� �Է�, �Է� ���� : 1~
		//�Է� ���� �� �迭�� ����
		System.out.println("���� 5���� �Է��ϼ���.");
		
		int iCount = 0;
		
		while(iCount < 5) {
			System.out.print( (iCount + 1) + "��° ���� : " );
			inputNum[iCount] = scan.nextInt();
			
			if(inputNum[iCount] <= 0) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. 0���� ū ���� �Է����ּ���.");
				continue;
			}
			
			iCount++;
		}
		System.out.println();
		
		//�Է� ���� �� �Է� ������� ���
		System.out.print("Inserted values: ");
		
		for(int i = 0; i<inputNum.length; i++) {
			System.out.print(inputNum[i]);
			
			if(i < inputNum.length-1)
				System.out.print(", ");
		}
		System.out.println("\n");
		
		//�迭 ����
		for(int i=0; i<inputNum.length-1; i++) {
			for(int j=0; j<inputNum.length-i-1; j++) {
				if(inputNum[j] > inputNum[j+1]) {
					int tmp = inputNum[j];
					inputNum[j] = inputNum[j+1];
					inputNum[j+1] = tmp;
				}
			}
		}
		
		//�ִ밪, �ּҰ� ���
		System.out.println("Maximum value: " + inputNum[4]);
		System.out.println("Minimum value: " + inputNum[0]);
		
		//�߰��� ���
		//n���� �ڷ� : n = Ȧ�� (n+1)/2, n = ¦�� n/2
		int medianIndex = 0;
		
		if(inputNum.length / 2 == 0)
			medianIndex = inputNum.length / 2;
		else
			medianIndex = (inputNum.length + 1) / 2;
		
		System.out.println("Median value: " + inputNum[medianIndex-1]);
	}
}
