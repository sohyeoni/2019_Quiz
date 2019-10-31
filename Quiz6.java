package regularity;

import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
		
		int[] arrInputNum = new int[10];
		int[] arrFrequency = new int[10];
		int arrIndex = 0;
		Scanner scan = new Scanner(System.in);
		
		//Ű����κ��� 1 ~ 9 ������ ���� �� 10�� �Է¹ް� �迭�� ����
		while(arrIndex < arrInputNum.length) {
			//���� �� 10�� �Է¹ޱ�
			System.out.print((arrIndex + 1) + "��° : ");
			int inputValue = scan.nextInt();
			
			//�Է¹��� ���� 1 ~ 9���̸� ���� �Ǵ� �迭�� ����
			if(0 <= inputValue && inputValue <= 9) {
				arrInputNum[arrIndex++] = inputValue;
			} else {
				//�Է¹��� ���� 1 ~ 9 ���� �������� �ƴ� ��� error msg ��� �� ���Է�
				System.out.println("0 ~ 9 ������ ������ �Է��ϼ���.");
				continue;
			}
		}
		System.out.println();
		
		//�Է� ���� �� 10�� ���
		System.out.print("�Է°� : ");
		for(int i = 0 ; i < arrInputNum.length; i++ ) {
			System.out.print(arrInputNum[i]);
			
			if(i < arrInputNum.length - 1 )
				System.out.print(", ");
		}
		System.out.println("\n");
		
		//�Է� ���� ���鿡 ���� �Է� �� ���
		for(int i = 0; i < arrFrequency.length; i++) {
			for(int j = 0; j < arrInputNum.length; j++) {
				if(i == arrInputNum[j])
					arrFrequency[i]++;
			}
		}
		
		//�Է� �� ���
		int count = 0;
		System.out.println("�Է� ��");
		for(int i = 0; i < arrFrequency.length; i++) {
			if(arrFrequency[i] != 0) {
				count++;
				System.out.printf("%d) %d : %dȸ\n", count, i, arrFrequency[i]);
			}
		}
		System.out.println();
	    
		
		//������׷� ���
		System.out.println("������׷�");
		
		char[][] arrHistogram = new char[12][12];
		
		//x, y�� �ʱ�ȭ..?
		for(int i = 0; i < arrHistogram.length; i++) {
			//x�� ����
			int tmp2 = i - 1;
			if(0 < tmp2 && tmp2 < 10)
				arrHistogram[11][i] = (char)(i - 1 + '0');
			
			//y�� ����
			int tmp = 10 - i;
			if(tmp % 2 == 0 && tmp != 10 && tmp != 0)
				arrHistogram[i][0] = (char)(tmp + '0');
			
			//y�� |
			arrHistogram[i][1] = '|';
			
			//x�� -
			arrHistogram[10][i] = '-';
		}
		
		//������׷� �迭�� �󵵼� �ֱ�
		for(int i = 1; i < arrFrequency.length; i++) {
			for(int j = 10 - arrFrequency[i]; j < 10; j++) {
				arrHistogram[j][i+1] = '$';
			}
		}
		
		//������׷� �ϼ��� ���
		for(int i = 0; i < arrHistogram.length; i++) {
			for(int j = 0; j <arrHistogram[i].length; j++) {
				System.out.print("\t" + arrHistogram[i][j]);
			}
			System.out.println();
		}
	}

}
