package regularity;

import java.util.Scanner;

public class Quiz12 {

	public static void main(String[] args) {
		//1. Ű����κ��� ���ڿ� �Է¹޾� char�� �迭�� ����
		String inputValue = null;
		
		Scanner scan = new Scanner(System.in);
		
		// Ű����κ��� ���ڿ� �Է�
		System.out.println("���ڸ� �Է��ϼ���!!");
		inputValue = scan.nextLine();
		
		// �Է¹��� ���ڿ��� ���� ����
		int sizeOfString = inputValue.length();
		
		// �Է¹��� ���ڿ��� ���� ��ŭ char�� �迭 ����
		char charArray[] = new char[sizeOfString];
		
		// inputValue�� ����� ���ڿ��� charArray �迭�� ���� : String -> char�� ���ڿ� ����
		inputValue.getChars(0, sizeOfString, charArray, 0);
		
		System.out.println("\n--------------------\n");
		
		int spaceCount = 0, alphabetCount = 0;
		
		//2. �Է¹��� ���ڿ� �� ���ܾ�, ������ ������ ī��Ʈ �� ��� �� ���
		for(int i = 0; i < sizeOfString; i++) {
			// ������ ī��Ʈ
			if(('A' <= charArray[i] && charArray[i] <= 'Z') || ('a' <= charArray[i] && charArray[i] <= 'z')) {
				alphabetCount++;
			} else if(charArray[i] == ' ' && charArray[i-1] != ' ') {
				//���� ������ �ܾ� ī��Ʈ
				spaceCount++;
			}
		}
		
		// ��� ���
		System.out.printf("�ܾ�� �� %d��, �����ڴ� %d�� �Դϴ�", spaceCount + 1, alphabetCount);
		System.out.println("\n\n");
		System.out.println("���� �Ϻ� IT��� �ֹ��� ȭ����!!^__^");
	}

}
