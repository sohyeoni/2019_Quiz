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
			// �Է� Ƚ�� ī��Ʈ 
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
			
			// ����ڷκ��� ���ĺ� �ϳ� �Է¹ޱ�
			System.out.print("% Input your guess : ");
			String inputGuess = scan.nextLine();
			
			// ���� �Է� ���� Ȯ��
			boolean changeFlag = false;
			boolean alreadyInputValFlag = false;
			
			// �̹� �Էµ� �ܾ�����
			int tmp = inputGuess.charAt(0) - 'a';
			
			if(tmp < 0)
				tmp += 32;
			else if(tmp > alphabetBox.length)
				tmp -= 32;

			alphabetBox[tmp]++;
			
			if(alphabetBox[tmp] > 1)
				alreadyInputValFlag = true;
			
			// ����ܾ ���Ե� ���ĺ����� �˻�
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
			
			// �������� �ƴ��� msg ���
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
			
			// ���� inputVlues[] ���
			System.out.print("% Given word (level 5) : ");
			for(int i = 0; i < sizeOfString; i++) {
				System.out.print(inputValue[i] + " ");
			}
			System.out.println("\n");
		}
		
		// ���� msg ���
		System.out.println("% Congratulations ! Correct answer for level 5 word in "
				+ attemptStr + " attempts !");
 	}
}
