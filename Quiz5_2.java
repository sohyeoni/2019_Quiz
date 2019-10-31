package regularity;

public class Quiz5_2 {

	public static void main(String[] args) {
		int printNum = 0;							//라인 당 알파벳 출력 개수
		final int ALPHABET_NUM	= 26;				//알파벳 개수
		final int TOTAL_LINE	= ALPHABET_NUM * 2;	//총 출력 라인수
		
		for(int i = 0 ; i < TOTAL_LINE ; i++) {
			char abc = 'A';
			
			//라인 당 알파벳 출력 개수 설정
			//26번 라인까지는 출력개수 1씩 증가, 27번 라인부터는 출력개수 1씩 감소
			if(i <= ALPHABET_NUM) {
				printNum = i;
			} else {
				printNum = TOTAL_LINE - i;
			}
			
			//출력개수만큼 알파벳 출력
			for(int j = 0 ; j < printNum ; j++) {
				System.out.print(abc++);
			}
			System.out.println();
		}
	}

}
