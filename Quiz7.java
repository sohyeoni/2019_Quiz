package report;

import java.util.Scanner;

public class Quiz7 {

	public static void main(String[] args) {
		//문자열 배열의 크기 30
		final int	MAX_SIZE = 30;
		
		//키보드로부터 입력 받은 문자열 저장
		String		inputValues = null;
		  
		//키보드로부터 입력 받은 문자열을 char형 배열로 저장
		//찾아바꾸기 기능 구현시 사용
		char[]		charArray = new char[MAX_SIZE];
		
		//키보드로부터 문자열을 입력받아 string형 저장
		Scanner scan	= new Scanner(System.in);
		
		while(true) {
			System.out.print("30자 이내 문장을 입력하세요.> ");
			inputValues		= scan.nextLine();
			
			if(inputValues.length() <= MAX_SIZE) {
				//저장된 문자열을 char형 array 변수 charArray에 복사
				inputValues.getChars(0, inputValues.length(), charArray, 0);
				
				break;
			}
		}
		//복사된 문자값 출력
		System.out.print("\n입력 문장 : ");
		for(int i = 0; i < charArray.length; i++)
			System.out.print(charArray[i]);
		System.out.print("\n\n");
		
		//키보드로부터 찾을 문자열 입력
		System.out.print("찾을 문자열 : ");
		String		inputFineValues = scan.nextLine();
		
		//찾을 문자열을 char 배열로 변경.
		char[] arrFindWord = new char[inputFineValues.length()];
		inputFineValues.getChars(0, inputFineValues.length(), arrFindWord, 0);
		
		//찾을 문자열과 같은 곳의 위치를 기억
		int equalsCnt = 0;
		int[] rememberPos = new int[10];
		int posIndex = 0, arrFindIndex = 0;
		boolean changeFlag = false;
		
		for(int i = 0; i < charArray.length; i++) {
			if(charArray[i] == arrFindWord[arrFindIndex]) {
				equalsCnt++;
				
				if(arrFindIndex < arrFindWord.length)
					arrFindIndex++;
			} else {
				equalsCnt = 0;
				arrFindIndex = 0;
			}
			
			if(arrFindIndex == arrFindWord.length) {
				rememberPos[posIndex] = i - (arrFindWord.length - 1);
				changeFlag = true;
				posIndex++;
				equalsCnt = 0;
				arrFindIndex = 0;
			}
		}

		posIndex = 0;
		
		if(changeFlag) {
			System.out.print("\n바꿀 문자열 : ");
			String changeStr = scan.nextLine();
			
			char[] arrChangeWord = new char[changeStr.length()];
			changeStr.getChars(0, changeStr.length(), arrChangeWord, 0);
			
			System.out.print("\n결과 : ");
			for(int i = 0; i < charArray.length; i++) {
				if(i != rememberPos[posIndex]) {
					System.out.print(charArray[i]);
				} else {
					for(int j = 0; j < changeStr.length(); j++) {
						System.out.print(arrChangeWord[j]);
					}
					posIndex++;
					
					i = i + (arrFindWord.length - 1);
				}
			}
		} else {
			System.out.print("\n결과 : 찾는 문자열이 없습니다.");
		}
	}
}
