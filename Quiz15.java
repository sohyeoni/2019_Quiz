package regularity;

import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {
		int studentNumber = 0;
		//float[][] studentScore = new float[3][7];
		Scanner scan = new Scanner(System.in);
		
		// 학생 수 입력
		System.out.print("학생 수를 입력하세요 : ");
		int totalStudentNum = scan.nextInt();
		System.out.println();
		
		// 학생 점수 입력할 배열 생성
		float[][] studentScore = new float[totalStudentNum][7];
		
		// 키보드로부터 각 학생의 국어, 영어, 수학 성적 입력
		for(int i = 0; i < studentScore.length; i++) {
			studentNumber += 1;
			studentScore[i][0] = studentNumber;

			System.out.printf("%d번째 학생의 국어 성적 입력 : ", studentNumber);
			studentScore[i][1] = scan.nextInt();
			
			System.out.printf("%d번째 학생의 영어 성적 입력 : ", studentNumber);
			studentScore[i][2] = scan.nextInt();
			
			System.out.printf("%d번째 학생의 수학 성적 입력 : ", studentNumber);
			studentScore[i][3] = scan.nextInt();
			
			System.out.println();
		}
		
		// 합계
		for(int i = 0; i < studentScore.length; i++) {
			for(int j = 1; j <= 3; j++)
				studentScore[i][4] +=  studentScore[i][j];
		}
		
		// 평균
		for(int i = 0; i < studentScore.length; i++) {
			studentScore[i][5] = studentScore[i][4] / 3;
		}
		
		// 등수
		for(int i = 0; i < studentScore.length; i++) {
			studentScore[i][6] = 1;
			
			for(int j = 0; j < studentScore.length; j++) {
				if(i != j) {
					if(studentScore[i][5] < studentScore[j][5])
						studentScore[i][6]++;
				}
			}
		}
		
		// 테이블 출력, 등수 기준으로 내림차순 정렬
		int printTurn = 1;
		
		System.out.println("학번\t국어\t영어\t수학\t합계\t평균\t등수");
		
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
