package regularity;

import java.util.Scanner;

public class Quiz3_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//���� �Է�
		System.out.print("������ �Է��ϼ���: <���� 1, ���� 2>: ");
		int gender = scan.nextInt();
		
		//ü�� �Է�
		System.out.print("ü���� �Է��ϼ���: ");
		int weight = scan.nextInt();
		
		//������ �Ǵ�
		if(gender == 1) {
			if(weight >= 85)
				System.out.println("��ü�� �Դϴ� ��ϼ���");
			else if(weight >= 50)
				System.out.println("ǥ��ü�� �Դϴ� �� ���̽��� �����ϼ���");
			else
				System.out.println("ǥ��ü�� ���� �Դϴ� ��� �弼��");
		} else if(gender == 2) {
			if(weight >= 68)
				System.out.println("��ü�� �Դϴ� ��ϼ���");
			else if(weight >= 40)
				System.out.println("ǥ��ü�� �Դϴ� �� ���̽��� �����ϼ���");
			else
				System.out.println("ǥ��ü�� ���� �Դϴ� ��� �弼��");
		}
	}

}
