package regularity;

import java.util.Scanner;

public class J2_Q2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// M�� �Է�
		System.out.println("M���� �Է��ϼ���");
		int mValue = scan.nextInt();
		
		// N�� �Է�
		System.out.println("N���� �Է��ϼ���");
		int nValue = scan.nextInt();
		
		// M�� N ũ�� ��
		// M < N�� ���, M���� N���� ���� ���
		if(mValue < nValue) {
			System.out.printf("M : %d ~ N : %d���� ���� ����\n", mValue, nValue);
			
			for(int i = mValue; i <= nValue; i++) {
				System.out.print(i);
				
				if(i < nValue)
					System.out.print(", ");
			}
		} else if(mValue > nValue) {
			// M > N�� ���, N���� M���� ���� ���
			System.out.printf("N : %d ~ M : %d���� ���� ����\n", nValue, mValue);
			
			for(int i = mValue; i >= nValue; i--) {
				System.out.print(i);
				
				if(i > nValue)
					System.out.print(", ");
			}
		} else {
			// M == N�� ���, �Է°� ���
			System.out.print("N, M ���� �� : " + mValue);
		}
		
		// ���� msg
		System.out.println();
		System.out.println("----�����մϴ�----");
	}

}
