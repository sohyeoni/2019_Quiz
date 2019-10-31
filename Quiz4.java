package regularity;

import java.util.Scanner;

public class ReversePyramid {

	public static void main(String[] args) {
		final char	BIG 	= 'A';
		final char	SMALL 	= 'a';
		final char	NUM 	= '1';
		int		sign	= 0;
		char	outChar	= ' ';
		
		//�Ƕ�̵� ���� �Է�
		System.out.print("�� �Ƕ�̵��� ���̸� �Է��ϼ���: ");
		
		Scanner scan = new Scanner(System.in);
		int line = scan.nextInt();
		
		System.out.println("--------------------------");
		
		int outputRange = line * 2 - 1;
		
		//�� �Ƕ�̵� ���
		for(int i=0; i<line; i++) {
			//�������
			for(int j=0; j<i; j++)
				System.out.print(" ");
			
			//��� ���� ���� ����
			if(sign == 0)
				outChar = BIG;
			else if(sign == 1)
				outChar = NUM;
			else if(sign == 2)
				outChar = SMALL;
			
			//���� ���
			for(int k=0; k<outputRange; k++) {
				System.out.print(outChar); 
				
				if(sign == 0 && outChar == 'Z')
					outChar = 'A';
				else if(sign == 1 && outChar == '9')
					outChar = '0';
				else if(sign == 2 && outChar == 'z')
					outChar = 'a';
				else
					outChar++;
			}
			System.out.println();
			
			//��� ���� �缳��
			outputRange = outputRange - 2;
			
			//��¹��� ���� �缳��
			sign = sign < 2 ? ++sign : 0;
		}
	}

}
