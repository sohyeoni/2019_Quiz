package report;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		int menuNum = 0;
		int dan = 0;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			//�޴� ��� �� ����ڷκ��� �Է¹ޱ�
			do {
				System.out.println("---------------------");
				System.out.println("1. ������ ���\n2. ���α׷� ����");
				System.out.println("---------------------");
				
				menuNum = scan.nextInt();
				
				//�Է°��� 1�̳� 2�� �ƴϸ� ����msg���
				if(menuNum != 1 && menuNum != 2)
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
			} while(menuNum != 1 && menuNum != 2);
			
			//�޴� 2���� �������� ��� ����msg��� �� ����
			if(menuNum == 2) {
				System.out.println("�̿����ּż� �����մϴ�.");
				break;
			}
			
			//�޴� 1���� �������� ��� ���Է¹��� �� ������ ���
			if(menuNum == 1) {
				//����� �� �Է�msg���
				System.out.println("����� �������� ���� �Է��ϼ���. �������� ���� 2~9 ���� �Է�");
				do {
					//�� �Է¹ޱ�
					dan = scan.nextInt();
					
					//�Է¹��� ���� 2~9�� �ƴϸ� ����msg���
					if(!(2 <= dan && dan <= 9))
						System.out.println("2~9���� ������ �Է����ּ���.");
				} while(!(2 <= dan && dan <= 9));
				
				//�Է¹��� ���� ������ ���
				for(int i=1; i<=9; i++)
					System.out.printf("%d X %d = %d\n", dan, i, dan*i);
			}
		}
	}

}
