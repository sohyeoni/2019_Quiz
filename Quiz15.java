package regularity;

import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {
		int studentNumber = 0;
		//float[][] studentScore = new float[3][7];
		Scanner scan = new Scanner(System.in);
		
		// �л� �� �Է�
		System.out.print("�л� ���� �Է��ϼ��� : ");
		int totalStudentNum = scan.nextInt();
		System.out.println();
		
		// �л� ���� �Է��� �迭 ����
		float[][] studentScore = new float[totalStudentNum][7];
		
		// Ű����κ��� �� �л��� ����, ����, ���� ���� �Է�
		for(int i = 0; i < studentScore.length; i++) {
			studentNumber += 1;
			studentScore[i][0] = studentNumber;

			System.out.printf("%d��° �л��� ���� ���� �Է� : ", studentNumber);
			studentScore[i][1] = scan.nextInt();
			
			System.out.printf("%d��° �л��� ���� ���� �Է� : ", studentNumber);
			studentScore[i][2] = scan.nextInt();
			
			System.out.printf("%d��° �л��� ���� ���� �Է� : ", studentNumber);
			studentScore[i][3] = scan.nextInt();
			
			System.out.println();
		}
		
		// �հ�
		for(int i = 0; i < studentScore.length; i++) {
			for(int j = 1; j <= 3; j++)
				studentScore[i][4] +=  studentScore[i][j];
		}
		
		// ���
		for(int i = 0; i < studentScore.length; i++) {
			studentScore[i][5] = studentScore[i][4] / 3;
		}
		
		// ���
		for(int i = 0; i < studentScore.length; i++) {
			studentScore[i][6] = 1;
			
			for(int j = 0; j < studentScore.length; j++) {
				if(i != j) {
					if(studentScore[i][5] < studentScore[j][5])
						studentScore[i][6]++;
				}
			}
		}
		
		// ���̺� ���, ��� �������� �������� ����
		int printTurn = 1;
		
		System.out.println("�й�\t����\t����\t����\t�հ�\t���\t���");
		
		for(int i = 0; i < studentScore.length; i++) {
			for(int j = 0; j < studentScore.length; j++) {
				if(studentScore[j][6] == printTurn) {
					for(int k = 0; k < studentScore[j].length; k++) {
						if(k != 5)
							System.out.print((int)studentScore[j][k] + "\t");
						else
							System.out.printf("%.1f\t", studentScore[j][k]);
					}
					System.out.println();
				}
			}
			printTurn++;
		}
	}

}
