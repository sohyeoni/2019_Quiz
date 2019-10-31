package regularity;

import java.util.Scanner;

public class Quiz8_2 {

	public static void main(String[] args) {
		final int	MAX_SIZE = 50;
		int			randomValues[] = new int[MAX_SIZE];
		
		Scanner scan = new Scanner(System.in);
		
		// 1 ~ 200 ������ ������ ������ �߻��Ͽ� �迭�� ���� : 50��
		for(int i = 0; i < MAX_SIZE; i++) {
			randomValues[i] = (int)(Math.random() * 200) + 1;
			
			for(int j = 0; j < i; j++) {
				if(randomValues[i] == randomValues[j]) {
					i--;
					break;
				}
			}
		}
		
		// �迭 ���
		for(int i = 0; i < MAX_SIZE; i++) {
			System.out.print("\t" + randomValues[i]);
			
			if((i + 1) % 5 == 0 && i != 0)
				System.out.println();
		}
		
		// ��� �� �Է�
		int inputNum = 0;
		
		do {
			System.out.print("\n��� �� �˻� �� ������ �Է��ϼ���(1�̻� ����) ");
			inputNum = scan.nextInt();
			
			if(inputNum <= 0) System.out.println("�߸��� �Է�.");
		} while(inputNum <= 0);
		
		//����� ���
		int count = 0;
		
		System.out.println("\n\n" + inputNum + "��� ��");
		for(int i = 0; i < MAX_SIZE; i++) {
			if(randomValues[i] % inputNum == 0) {
				System.out.print("\t" + randomValues[i]);
				count++;
				
				if(count % 5 == 0)
					System.out.println();
			}
		}
		
		// ��� �� ���� ���
		System.out.println("\n\n" + inputNum + " ��� �� ���� : " + count);
	}
}
