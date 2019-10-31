package regularity;

import java.util.Scanner;

public class ReversePyramid {

	public static void main(String[] args) {
		final char	BIG 	= 'A';
		final char	SMALL 	= 'a';
		final char	NUM 	= '1';
		int		sign	= 0;
		char	outChar	= ' ';
		
		//피라미드 높이 입력
		System.out.print("역 피라미드의 높이를 입력하세요: ");
		
		Scanner scan = new Scanner(System.in);
		int line = scan.nextInt();
		
		System.out.println("--------------------------");
		
		int outputRange = line * 2 - 1;
		
		//역 피라미드 출력
		for(int i=0; i<line; i++) {
			//공백출력
			for(int j=0; j<i; j++)
				System.out.print(" ");
			
			//출력 문자 종류 선택
			if(sign == 0)
				outChar = BIG;
			else if(sign == 1)
				outChar = NUM;
			else if(sign == 2)
				outChar = SMALL;
			
			//문자 출력
			for(int k=0; k<outputRange; k++) {
				System.out.print(outChar); 
				
				if(sign == 0 && outChar == 'Z')
					outChar = 'A';
				else if(sign == 1 && outChar == '9')
					outChar = '0';
				else if(sign == 2 && outChar == 'z')
					outChar = 'a';
				else
					outChar++;
			}
			System.out.println();
			
			//출력 범위 재설정
			outputRange = outputRange - 2;
			
			//출력문자 종류 재설정
			sign = sign < 2 ? ++sign : 0;
		}
	}

}
