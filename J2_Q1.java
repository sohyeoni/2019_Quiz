package regularity;

public class J2_Q1 {

	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				// ¦���� ���
				if(i % 2 == 0)
					System.out.printf("%d X %d = %d\t", i, j, i * j);
				
				// �ٹٲ�
				if(i % 2 == 0 && j % 3 == 0)
					System.out.println();
			}
			
			if(i % 2 == 1)
				System.out.println();
		}
	}

}
