package codingTest;

import java.util.Arrays;

public class CodingTest_01 {
	public static void main(String[] args) {
//		int[] array_one = new int[200];
//		for(int i=0 ; i<array_one.length; i++) {
//			array_one[i] = i+1;
//		}
		int[] array = {1,1,2,3,4,5};
		int n = 0;
		int answer = 0;
		answer = CodingTest_01.solution(array, n);
		System.out.println("answer = " + answer);
	}

public static int solution(int[] array, int n) {
		int answer = 0;
		System.out.println("array.length = " + array.length);
		System.out.println("n = " + n);
		int length = array.length;
	

		if(length>=1 && length<=100) {
			System.out.println("ok");
			if(n>=0 && n <=1000) {
				for(int i=0; i<length;i++) {
					System.out.println("array["+i+"] = " + array[i]);
					if(array[i] >=0 && array[i] <= 100) {
						if(array[i] ==n) {
							System.out.println("array["+i+"] 의 값과" + n  +"의 값이 중복됩니다 ");
							answer++;
						}else {
							System.out.println("array["+i+"] 의 값과" + n + "의 값이 다릅니다");
						}
					}
				}
			}
		}else if (length <1) { //length 의 값이 1보다 작을 때 ex) 0,-1 등등
			System.out.println("Array 길이가 1보다 작습니다"); 
		}else { //length 의 값이 100보다 클때 
			System.out.println("Array 길이가 100보다 큽니다");
		}
		System.out.println("for 문 탈출 answer 의 값" + answer);
	return answer;
	}
}
