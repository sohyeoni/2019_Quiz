package regularity;

import java.util.Scanner;

public class Quiz3_3 {

	public static void main(String[] args) {
		int 	input_value = 0;
		Scanner scan 		= new Scanner(System.in);
		
		//성적 입력
		System.out.print("성적을 입력하세요: ");
		input_value = scan.nextInt();
		
		//학점판단 후 출력
		if(input_value >= 95) {
			System.out.println("축하합니다. A+ 입니다");
		} else if(input_value >= 90) {
			System.out.println("축하합니다. A 입니다");
		} else if(input_value >= 85) {
			System.out.println("축하합니다. B+ 입니다");
		} else if(input_value >= 80) {
			System.out.println("축하합니다. B 입니다");
		} else if(input_value >= 75) {
			System.out.println("축하합니다. C+ 입니다");
		} else if(input_value >= 70) {
			System.out.println("축하합니다. C 입니다");
		} else if(input_value >= 65) {
			System.out.println("축하합니다. D+ 입니다");
		} else if(input_value >= 60) {
			System.out.println("축하합니다. D 입니다");
		} else if(input_value < 60) {
			System.out.println("축하합니다. F 입니다 ^^;;");
		}

	}

}
