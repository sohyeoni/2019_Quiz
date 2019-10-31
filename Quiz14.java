package regularity;

public class Quiz14 {

	public static void main(String[] args) {
		int[] randomDiceValue = new int[3];
		int[] diceValue = new int[6];
		
		// 1 ~ 6 ������ ���� 3���� ����(�ߺ����)
		for(int i = 0; i < randomDiceValue.length; i++) {
			int tmp = (int)(Math.random() * 6) + 1;
			randomDiceValue[i] = tmp;
			diceValue[tmp - 1]++;
			 
			// �ֻ��� ���� �� ���
			System.out.print(tmp + " ");
		}
		System.out.println();
		
		// �ߺ� �� ���� Ȯ�� �� �ߺ� ���� �� ���� (��� 1�� ���̸� �ִ밪 ����)
		int equalsNumFlag = 0;
		int num = 0;
		
		for(int i = 0; i < diceValue.length; i++) {
			if(diceValue[i] == 3) {
				// �ߺ� �� 3���� ���
				equalsNumFlag = 3;
				num = i + 1;
				break;
			} else if(diceValue[i] == 2) {
				// �ߺ� �� 2���� ���
				equalsNumFlag = 2;
				num = i + 1;
				break;
			} else if(diceValue[i] != 0) {
				// �ߺ� �� ���� ���
				equalsNumFlag = 1;
				num = i + 1;
			}
		}
		
		// ��� ���
		int prizeMoney = 0;
		
		if(equalsNumFlag == 3) {
			// 3�� ���� ����
			prizeMoney = 10000 + num * 1000;
		} else if(equalsNumFlag == 2) {
			// 2�� ���� ����
			prizeMoney = 1000 + num * 100;
		} else {
			// �ߺ��� ���� ���� ���
			prizeMoney = num * 100;
		}
		
		// ��� ���
		System.out.println(prizeMoney);
	}

}
