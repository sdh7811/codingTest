package codingTest;

class Add {
	private static Add add  = null;

	private Add() {
		super();
	}
	public static Add singleton() {
		if(add == null) {
			add = new Add();
		}
		return add;
	}

	public int add (int num1 , int num2) {
		int answer = -1;

		//num1, num2 파라미터 값 체크
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		//제한 사항
		if(num1 >= -50000 && num1 <= 50000) {
			System.out.println(num1 + " 이므로 첫번째 제한 사항 OK!!!");
			if(num2 >= -50000 && num2 <= 50000) {
				System.out.println(num2 + " 이므로 첫번째 제한 사항 OK!!!");
				answer = num1 + num2;
			}else if(num2 < -50000) {
				System.out.println(num2 + " 값 이 -50000 보다 작습니다.");
			}else if(num2 > 50000) { 
				System.out.println(num2 + " 값 이 50000 보다 큽니다.");
			}else {
				System.out.println("잘 못 된 값 입니다.");
			}
		}else if(num1 < -50000) {
			System.out.println(num1 + " 값 이 -50000 보다 작습니다.");
		}else if(num1 > 50000) {
			System.out.println(num1 + " 값 이 50000 보다 큽니다");
		}else {
			System.out.println("잘 못 된 값 입니다.");
		}

		System.out.println("answer 의 값 = " + answer);

		return answer;
	}
}

class A  {
	public A() {
		super();
	}
}

public class CodingTest_03 {
	public static void main (String[] args) {
		Add add = Add.singleton();
		Add add2 = Add.singleton();
//		System.out.println(add.getClass()); //해당 패키지 의 해당 클래스
//		System.out.println(add.toString()); //codingTest.Add@17776a8 주소
//		System.out.println(add.hashCode());
//		System.out.println(add2.toString());
//		System.out.println(add2.hashCode());
		int num1 = 100;
		int num2 = 102;
		add2.add(num1, num2);

		A a = new A();
		A a_one = new A();

//		System.out.println(a.hashCode());
//		System.out.println(a_one.hashCode());
//		System.out.println(a_one.toString());
//		System.out.println(a.toString());

	}
}
