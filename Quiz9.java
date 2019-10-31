package regularity;

import java.util.Scanner;

public class Quiz9 {

	public static void main(String[] args) {
		int startNum	= 0;
		int endNum		= 0;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			// ���� �� �Է�
			System.out.print("���� ���� �Է��ϼ��� : ");
			startNum = scan.nextInt();
			
			if(!(0 < startNum && startNum < 53)) {
				System.out.println("�߸� �Է� �ϼ̽��ϴ�. �ٽ� �Է��ϼ���!\n");
				continue;
			}
			
			// �� �� �Է�
			System.out.print("�� ���� �Է��ϼ��� : ");
			endNum = scan.nextInt();
			
			if(startNum + endNum > 54) {
				System.out.println("��� �� ������ �ʰ� �Ͽ����ϴ�. �ٽ� �Է��ϼ���.\n");
				continue;
			}
			
			break;
		}
		
		//��� �� ���
		char alphabet = ' ';
		
		if(startNum <= 26)
			alphabet = (char)(startNum + 64);
		else
			alphabet = (char)(startNum + 70);
		
		System.out.print("\n��� �� : ");
		
		for(int i = 0; i < endNum; i++) {
			System.out.print(alphabet);
			
			if(alphabet == 'Z')
				alphabet = 'a';
			else
				alphabet++;
			
			if(i != endNum - 1)
				System.out.print(", ");
		}
	}

}
