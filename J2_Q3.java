package regularity;

import java.util.Scanner;

public class J2_Q3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// �迭 ���� �Է�
		System.out.println("�迭�� ������ �Է��ϼ���.");
		
		int arrayLength = 0;
		
		while(true) {
			arrayLength = scan.nextInt();
			
			// 1���� ���� ��� error msg ��� �� ���Է�
			if(arrayLength < 1) {
				System.out.println("1 �̻��� ���� �Է��ϼ���.");
				continue;
			}
				
			break;
		}
		System.out.println();
		
		// �迭�� ���� ���
		System.out.println("�� �� ��    ���� : " + arrayLength);
		
		// arrayLength���� ������ �迭 ����
		int[] randomArray = new int[arrayLength];
		
		for(int i = 0; i < arrayLength; i++) {
			// -50 ~ 50 ������ ���� �߻�
			randomArray[i] = (int)(Math.random() * 101) - 50;
			
			// �迭�� �ִ� ���� ����
			for(int j = 0; j < i; j++) {
				if(randomArray[i] == randomArray[j]) {
					i--;
					break;
				}
			}
		}
		
		// �迭 �� ���� ���
		System.out.print("�迭 �� ���� �� : ");
		
		for(int i = 0; i < arrayLength; i++) {
			System.out.print(randomArray[i]);
			
			if(i < arrayLength - 1)
				System.out.print(", ");
		}
		System.out.println();
		
		// �迭 sort
		for(int i = 0; i < arrayLength - 1; i++) {
			for(int j = 0; j < arrayLength - 1 - i; j++) {
				// �� �ε����� ���� �� �ε����� ������ Ŭ ��� �ڸ� �ٲ�
				if(randomArray[j] > randomArray[j + 1]) {
					int tmp = randomArray[j];
					randomArray[j] = randomArray[j + 1];
					randomArray[j + 1] = tmp;
				}
			}
		}
		
		// �ִ밪 ���
		System.out.println("��     ��      �� : " + randomArray[arrayLength - 1]);
		
		// �ּҰ� ���
		System.out.println("��     ��      �� : " + randomArray[0]);
		
		// ��հ� ���
		float avgValue = 0;
		
		for(int i = 0; i < arrayLength; i++)
			avgValue += randomArray[i];
		
		avgValue = avgValue / arrayLength;
		
		System.out.println("��     ��      �� : " + avgValue);
		System.out.println();
		
		// ������׷� ���
		int range1 = -50, range2 = -41;
		
		System.out.println("������׷�");
		
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
