package regularity;

public class Quiz5_2 {

	public static void main(String[] args) {
		int printNum = 0;							//���� �� ���ĺ� ��� ����
		final int ALPHABET_NUM	= 26;				//���ĺ� ����
		final int TOTAL_LINE	= ALPHABET_NUM * 2;	//�� ��� ���μ�
		
		for(int i = 0 ; i < TOTAL_LINE ; i++) {
			char abc = 'A';
			
			//���� �� ���ĺ� ��� ���� ����
			//26�� ���α����� ��°��� 1�� ����, 27�� ���κ��ʹ� ��°��� 1�� ����
			if(i <= ALPHABET_NUM) {
				printNum = i;
			} else {
				printNum = TOTAL_LINE - i;
			}
			
			//��°�����ŭ ���ĺ� ���
			for(int j = 0 ; j < printNum ; j++) {
				System.out.print(abc++);
			}
			System.out.println();
		}
	}

}
