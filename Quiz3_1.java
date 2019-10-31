package regularity;

import java.util.Scanner;

public class Quiz3_1 {

	public static void main(String[] args) {	
		System.out.println("다섯자리 정수를 입력하시오!!");
		
		Scanner scan = new Scanner(System.in);
		String inputNum = scan.nextLine();
			
		int sum = 0;
	
		for(int i=0; i<inputNum.length(); i++)
			sum += inputNum.charAt(i) - '0';
		
		System.out.printf("%s + %s + %s + %s + %s = %d\n",
				inputNum.charAt(0), inputNum.charAt(1), inputNum.charAt(2), inputNum.charAt(3), inputNum.charAt(4), sum);
	}

}
