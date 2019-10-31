package regularity;

import java.util.Scanner;

public class Quiz12 {

	public static void main(String[] args) {
		//1. 키보드로부터 문자열 입력받아 char형 배열에 저장
		String inputValue = null;
		
		Scanner scan = new Scanner(System.in);
		
		// 키보드로부터 문자열 입력
		System.out.println("문자를 입력하세요!!");
		inputValue = scan.nextLine();
		
		// 입력받은 문자열의 문자 길이
		int sizeOfString = inputValue.length();
		
		// 입력받은 문자열의 길이 만큼 char형 배열 생성
		char charArray[] = new char[sizeOfString];
		
		// inputValue에 저장된 문자열을 charArray 배열에 복사 : String -> char로 문자열 복사
		inputValue.getChars(0, sizeOfString, charArray, 0);
		
		System.out.println("\n--------------------\n");
		
		int spaceCount = 0, alphabetCount = 0;
		
		//2. 입력받은 문자열 내 영단어, 영문자 개수를 카운트 후 결과 값 출력
		for(int i = 0; i < sizeOfString; i++) {
			// 영문자 카운트
			if(('A' <= charArray[i] && charArray[i] <= 'Z') || ('a' <= charArray[i] && charArray[i] <= 'z')) {
				alphabetCount++;
			} else if(charArray[i] == ' ' && charArray[i-1] != ' ') {
				//공백 단위로 단어 카운트
				spaceCount++;
			}
		}
		
		// 결과 출력
		System.out.printf("단어는 총 %d자, 영문자는 %d자 입니다", spaceCount + 1, alphabetCount);
		System.out.println("\n\n");
		System.out.println("컴정 일본 IT기업 주문반 화이팅!!^__^");
	}

}
