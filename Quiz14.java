package regularity;

public class Quiz14 {

	public static void main(String[] args) {
		int[] randomDiceValue = new int[3];
		int[] diceValue = new int[6];
		
		// 1 ~ 6 사이의 변수 3개를 저장(중복허용)
		for(int i = 0; i < randomDiceValue.length; i++) {
			int tmp = (int)(Math.random() * 6) + 1;
			randomDiceValue[i] = tmp;
			diceValue[tmp - 1]++;
			 
			// 주사위 눈의 값 출력
			System.out.print(tmp + " ");
		}
		System.out.println();
		
		// 중복 눈 개수 확인 및 중복 눈의 값 저장 (모두 1개 씩이면 최대값 저장)
		int equalsNumFlag = 0;
		int num = 0;
		
		for(int i = 0; i < diceValue.length; i++) {
			if(diceValue[i] == 3) {
				// 중복 눈 3개일 경우
				equalsNumFlag = 3;
				num = i + 1;
				break;
			} else if(diceValue[i] == 2) {
				// 중복 눈 2개일 경우
				equalsNumFlag = 2;
				num = i + 1;
				break;
			} else if(diceValue[i] != 0) {
				// 중복 눈 없을 경우
				equalsNumFlag = 1;
				num = i + 1;
			}
		}
		
		// 상금 계산
		int prizeMoney = 0;
		
		if(equalsNumFlag == 3) {
			// 3개 눈이 동일
			prizeMoney = 10000 + num * 1000;
		} else if(equalsNumFlag == 2) {
			// 2개 눈이 동일
			prizeMoney = 1000 + num * 100;
		} else {
			// 중복된 눈이 없을 경우
			prizeMoney = num * 100;
		}
		
		// 상금 출력
		System.out.println(prizeMoney);
	}

}
