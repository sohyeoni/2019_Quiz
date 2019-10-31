package report;

import java.util.Scanner;

public class Quiz7 {

	public static void main(String[] args) {
		//���ڿ� �迭�� ũ�� 30
		final int	MAX_SIZE = 30;
		
		//Ű����κ��� �Է� ���� ���ڿ� ����
		String		inputValues = null;
		  
		//Ű����κ��� �Է� ���� ���ڿ��� char�� �迭�� ����
		//ã�ƹٲٱ� ��� ������ ���
		char[]		charArray = new char[MAX_SIZE];
		
		//Ű����κ��� ���ڿ��� �Է¹޾� string�� ����
		Scanner scan	= new Scanner(System.in);
		
		while(true) {
			System.out.print("30�� �̳� ������ �Է��ϼ���.> ");
			inputValues		= scan.nextLine();
			
			if(inputValues.length() <= MAX_SIZE) {
				//����� ���ڿ��� char�� array ���� charArray�� ����
				inputValues.getChars(0, inputValues.length(), charArray, 0);
				
				break;
			}
		}
		//����� ���ڰ� ���
		System.out.print("\n�Է� ���� : ");
		for(int i = 0; i < charArray.length; i++)
			System.out.print(charArray[i]);
		System.out.print("\n\n");
		
		//Ű����κ��� ã�� ���ڿ� �Է�
		System.out.print("ã�� ���ڿ� : ");
		String		inputFineValues = scan.nextLine();
		
		//ã�� ���ڿ��� char �迭�� ����.
		char[] arrFindWord = new char[inputFineValues.length()];
		inputFineValues.getChars(0, inputFineValues.length(), arrFindWord, 0);
		
		//ã�� ���ڿ��� ���� ���� ��ġ�� ���
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
			System.out.print("\n�ٲ� ���ڿ� : ");
			String changeStr = scan.nextLine();
			
			char[] arrChangeWord = new char[changeStr.length()];
			changeStr.getChars(0, changeStr.length(), arrChangeWord, 0);
			
			System.out.print("\n��� : ");
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
			System.out.print("\n��� : ã�� ���ڿ��� �����ϴ�.");
		}
	}
}
