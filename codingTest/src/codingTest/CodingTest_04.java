package codingTest;

class Subtraction {
	public Subtraction() {
		super();
	}

	public int soultion (int num1, int num2) {
		int answer = 0;
		int minNumber = -50000;
		int maxNumber = 50000;

		//파라미터 값 체크
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		if(num1 >= minNumber && num2 <= maxNumber) {
			System.out.println("num1 의 값 이" + num1 + " 이 므로 OK!!!");
			if(num2 >= minNumber && num2 <= maxNumber) {
				System.out.println("num2 의 값 이" + num2 + " 이 므로 OK!!!");
				answer = num1 - num2;
			}else if(num2 < minNumber) {
				System.out.println(num2 + "의 값이 " + minNumber +" 보다 작습니다.");
			}else if(num2 > maxNumber) {
				System.out.println(num2 + "의 값이 " + maxNumber +" 보다 큽니다.");
			}else {
				System.out.println("잘 못 된 값 입니다.");
			}
		}else if(num1 < minNumber) {
			System.out.println(num1 + "의 값이 " + minNumber +" 보다 작습니다.");
		}else if(num1 > maxNumber) {
			System.out.println(num1 + "의 값이 " + maxNumber +" 보다 큽니다.");
		}else {
			System.out.println("잘 못 된 값 입니다.");
		}

		System.out.println("최종 answer = " + answer);

		return  answer;
	}
}

public class CodingTest_04 {
	public static void main (String[] args) {
		int num1 = 2;
		int num2 = 3;
		Subtraction subtraction = new Subtraction();
		subtraction.soultion(num1, num2);
	}
}
