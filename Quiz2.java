package regularity;

import java.util.Scanner;

public class Quiz2_2 {

	public static void main(String[] args) {
		//String input = "";
		int count = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			//Ű����κ��� ���� �� �Է�
			String input = scan.nextLine();
			
			//q�� �Է��ϸ� ����
			if(input.charAt(0) == 'q') {
				System.out.println("�̿����ּż� �����մϴ�");
				break;
			}
			
			//������ �ٽ� �Է�
			if(input.charAt(0) == '-') {
				System.out.println("1�̻� ����� �Է����ּ���");
				continue;
			}
			
			//����� ���� �ڵ� ����
			//�Է¹��� ���ڿ��� integer�� ��ȯ
			int num = 0;
			num = Integer.parseInt(input);
			
			//�Է°� ���
			System.out.println(++count + "��° �Է� ���� = " + input);
			
			//�Է°��� ¦������ Ȧ������ �Ǻ�
			if(num % 2 == 0)	
				System.out.printf("\t¦�� �Դϴ�.\n");
			else				
				System.out.printf("\tȦ�� �Դϴ�.\n");
			
			//�Է°��� 3�̳� 7�� ������� �Ǻ�
			if(num % 3 == 0)
				System.out.printf("\t3�� ��� �Դϴ�.\n");
			if(num % 7 == 0)
				System.out.printf("\t7�� ��� �Դϴ�.\n");
		}
	}
}
