package codingTest;

import java.util.Arrays;

class Taller {
	public Taller() {  // Taller 생성자 작성
		super(); //Object 기본 생성자 호출
	}
	public static int solution(int[]array , int height) {
		int answer = 0;

		//array , height 파라미터 값 체크
		System.out.println("array = " + Arrays.toString(array));
		System.out.println("array.length = " + array.length);
		System.out.println("height = " + height);

		int array_length = array.length; //배열 파라미터 의 길이 
		//길이는 1부터 시작 index 는 0부터 시작

		//제한 사항
		if(array_length>=1 && array_length <=100) {
			if(height >=1 && height <=200) {
				for(int i = 0; i<array_length; i++) {
					if(array[i]>= 1 && array[i] <= 200) {
						if(height < array[i]) {
							System.out.println("OK!!!");
							System.out.println(height + " 보다 " + array[i] + " 의 값이 큽니다");
							answer++;
						}else {
							System.out.println("Fail!!!");
							System.out.println(height + " 보다 " + array[i] + " 의 값이 작습니다");
						}
					}else if (array[i]<1) {
						System.out.println("array [" + i +"] =" + array[i] + ", 1 보다 작습니다");
					}else if (array[i]>200) {
						System.out.println("array [" + i +"] =" + array[i] + ", 200 보다 큽니다");
					}else {
						System.out.println("잘못된 값 입니다.");
					}
				}
			}else if(height <1) {
				System.out.println("height 의 값이 1보다 작습니다");
			}else if(height > 200) {
				System.out.println("height  의 값이 200 보다 큽니다");
			}else {
				System.out.println("잘못된 값 입니다.");
			}
		}else if(array_length<1) {
			System.out.println("Array 의 길이가 1보다 작습니다");
		}else if(array_length > 100){
			System.out.println("Array 의 길이가 100보다 큽니다");
		}else {
			System.out.println("잘못된 값 입니다.");
		}
		System.out.println("answer 결과 값 = " + answer);
		return answer;
	}
}

public class CodingTest_02 {
	public static void main (String[] args) {
		int[] array = {149,180,192,170};
		int[] array_One = {180,120,140};
		int height = 190;
		int taller = 0;
		taller = Taller.solution(array_One, height);
		System.out.println("answer 의 값 = " + taller);
	}
}
