package regularity;

import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		int		round		= 0;
		int[]	result		= new int[3];
		int[]	randomArray = new int[3];
		
		// �ߺ����� 3���� ���� ����
		for(int i = 0; i < randomArray.length; i++) {
			randomArray[i] = (int)(Math.random() * 10);
			
			for(int j = 0; j < i; j++) {
				if(randomArray[j] == randomArray[i])
					i--;
			}
		}
		
		//�����迭 ���
//		for(int i : randomArray)
//			System.out.print(i + " ");
//		System.out.println();
			
		do {
			//�õ� Ƚ�� count
			System.out.println("�õ�Ƚ��: " + ++round);
			
			// Ű����κ��� 3���� ������ �Է� �ޱ�
			System.out.println("���� 3���� �Է��ϼ���~~^__^");
			
			Scanner scan = new Scanner(System.in);
			String inputNum = scan.nextLine();
			System.out.println();
			
			int[]	inputNumArray	= new int[inputNum.length() - 2];
			int 	index			= 0;
			
			// ���ڿ��� �Է¹��� ���� int�迭�� ����
			for(int i = 0; i < inputNum.length(); i++) {
				if(inputNum.charAt(i) != ' ')
					inputNumArray[index++] = inputNum.charAt(i) - '0';
			}
			
			// strike�� ball �ʱ�ȭ
			result[0] = 0;
			result[1] = 0;
			
			// strike, ball�Ǻ�
			for(int i = 0; i < randomArray.length; i++) {
				for(int j = 0; j < inputNumArray.length; j++) {
					if(randomArray[i] == inputNumArray[j]) {
						// i�� j�� ������ strike + 1, �ٸ��� ball + 1
						if(i == j)
							result[0]++;
						else
							result[1]++;
					}
				}
			}
			
			// out �Ǻ�
			if(result[0] == 0 && result[1] == 0)
				result[2]++;
			
			// ��� ���
			if(result[0] == 0 && result[1] == 0) {
				System.out.print("Out: �ƿ� " + result[2] + "��");
			} else {
				if(result[0] != 0)
					System.out.print(result[0] + " Strike ");
				
				if(result[1] != 0)
					System.out.print(result[1] + " Ball ");
			}
			System.out.println("\n\n");
		} while(round < 4 && result[2] != 2 && result[0] != 3);
		
		// ���� ����
		if(round >= 4 || result[2] == 2) {
			if(round >= 4)
				System.out.println("����Ƚ�� �ʰ�");
			
			System.out.println("�Ʊ��~~~���׿�..");
			System.out.printf("������: %d %d %d �Դϴ�.", randomArray[0], randomArray[1], randomArray[2]);
		} else {
			System.out.println("�̰���ϴ�^__^v");
		}
	}

}
