package regularity;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		String inputValue = null;
		
		Scanner scan = new Scanner(System.in);
		
		inputValue = scan.nextLine();
		
		int sizeOfString = inputValue.length();
		
		char[] charArray = new char[sizeOfString];
		
		inputValue.getChars(0, sizeOfString, charArray, 0);
		
		System.out.print("문자열을 입력하세요 : ");
		for(int i = 0; i < sizeOfString; i++) {
			System.out.print(charArray[i]);
		}
		System.out.println();
		
		// 빈도수 저장 배열 생성
		int[] freq = new int[26];
		int lengthCnt = 0;
		
		for(int i = 0; i < sizeOfString; i++) {
			int index = charArray[i] - 'a';
			
			if(!(0 <= index && index <= 26)) {
				lengthCnt++;
				continue;
			}
			
			freq[index]++;
		}
		
		for(int i = 0; i < freq.length; i++) {
			if(freq[i] != 0) {
				System.out.print((char)(i +'a') + " : " + freq[i]);
				
				lengthCnt = lengthCnt + freq[i];
				
				if(lengthCnt != sizeOfString)
					System.out.print(", ");
			}
		}
	}

}
