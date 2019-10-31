package regularity;

import java.util.Scanner;

public class Quiz3_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//성별 입력
		System.out.print("성별을 입력하세요: <남성 1, 여성 2>: ");
		int gender = scan.nextInt();
		
		//체중 입력
		System.out.print("체중을 입력하세요: ");
		int weight = scan.nextInt();
		
		//몸무게 판단
		if(gender == 1) {
			if(weight >= 85)
				System.out.println("과체중 입니다 운동하세요");
			else if(weight >= 50)
				System.out.println("표준체중 입니다 현 페이스를 유지하세요");
			else
				System.out.println("표준체중 이하 입니다 고기 드세요");
		} else if(gender == 2) {
			if(weight >= 68)
				System.out.println("과체중 입니다 운동하세요");
			else if(weight >= 40)
				System.out.println("표준체중 입니다 현 페이스를 유지하세요");
			else
				System.out.println("표준체중 이하 입니다 고기 드세요");
		}
	}

}
