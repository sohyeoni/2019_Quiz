package regularity;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int attempt = 0;
		int endCnt = 0;
		String attemptStr = null;
		int[] alphabetBox = new int[26];
		
		String selectedWord = "Yeungjin";
		int sizeOfString = selectedWord.length();
		
		char answerWord[] = new char[sizeOfString];
		
		selectedWord.getChars(0, sizeOfString, answerWord, 0);
		
		char inputValue[] = new char[sizeOfString];
		
		for(int i = 0; i < sizeOfString; i++) {
			inputValue[i] = '_';
		}
		
		System.out.println("% hangman 5");
		
		System.out.print("% Give word (level 5) : ");
		for(int i = 0; i < sizeOfString; i++) {
			System.out.print(inputValue[i] + " ");
		}
		System.out.println("\n\t(Note : the underlines as the number of characters int the word.)");
		
		while(endCnt < sizeOfString) {
			// 입력 횟수 카운트 
			attempt += 1;
			
			attemptStr = attempt + "";
			
			switch(attempt) {
				case 1:
					attemptStr += "st";
					break;
				case 2:
					attemptStr += "nd";
					break;
				case 3:
					attemptStr += "rd";
					break;
				default:
					attemptStr += "th";
			}
			
			// 사용자로부터 알파벳 하나 입력받기
			System.out.print("% Input your guess : ");
			String inputGuess = scan.nextLine();
			
			// 정답 입력 됨을 확인
			boolean changeFlag = false;
			boolean alreadyInputValFlag = false;
			
			// 이미 입력된 단어인지
			int tmp = inputGuess.charAt(0) - 'a';
			
			if(tmp < 0)
				tmp += 32;
			else if(tmp > alphabetBox.length)
				tmp -= 32;

			alphabetBox[tmp]++;
			
			if(alphabetBox[tmp] > 1)
				alreadyInputValFlag = true;
			
			// 정답단어에 포함된 알파벳인지 검사
			for(int i = 0; i < sizeOfString; i++) {
				if(answerWord[i] == inputGuess.charAt(0)) {
					changeFlag = true;
					
					if(inputValue[i] != inputGuess.charAt(0)) {
						inputValue[i] = inputGuess.charAt(0);
						endCnt++;
					}
				} else {
					if(answerWord[i] == inputGuess.charAt(0) - 32) {
						changeFlag = true;
						
						if(inputValue[i] != inputGuess.charAt(0) - 32) {
							inputValue[i] = answerWord[i];
							endCnt++;
						}
					} else if(answerWord[i] == inputGuess.charAt(0) + 32) {
						changeFlag = true;
						
						if(inputValue[i] != inputGuess.charAt(0) + 32) {
							inputValue[i] = answerWord[i];
							endCnt++;
						}
					}
				}
			}
			
			// 정답인지 아닌지 msg 출력
			System.out.printf("%% Your guess (at %s attempt), %s, ", attemptStr, inputGuess);
			
			if(changeFlag) {
				if(!alreadyInputValFlag)
					System.out.println("is good !");
				else
					System.out.println("was already tried (good) !");
			} else {
				if(!alreadyInputValFlag)
					System.out.println("is wrong !");
				else
					System.out.println("was already tried (wrong) !");
			}
			
			// 현재 inputVlues[] 출력
			System.out.print("% Given word (level 5) : ");
			for(int i = 0; i < sizeOfString; i++) {
				System.out.print(inputValue[i] + " ");
			}
			System.out.println("\n");
		}
		
		// 종료 msg 출력
		System.out.println("% Congratulations ! Correct answer for level 5 word in "
				+ attemptStr + " attempts !");
 	}
}
