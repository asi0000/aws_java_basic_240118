package ch01;

public class C_Operator {

	public static void main(String[] args) {
		
		// 연산자
		int a = 15;
		int b = 7;
		double c = 15.0;
		double d = 7.0;
		
		int intResult;
		double doubleResult;
		
		// 산술연산자: 사칙연산 작업. 숫자 데이터에 대해서 연산을 수행
		
		// 더하기: +
		// 좌항에 우항을 더한 값을 반환
		intResult = a + b;
		doubleResult = c + d;
		
		doubleResult = a + b;
		intResult = (int) (c + d); 

		// 정수 + 실수 = 실수
		doubleResult = a + d;
		
		// 빼기: -
		// 좌항에 우항을 뺀 결과를 반환
		intResult = a - b;
		doubleResult = c - d;
		
		// 정수 - 실수 = 실수
		doubleResult = a - d;
		
		// 곱하기: *
		// 좌항에 우항을 곱한 결과를 반환
		intResult = a * b;
		doubleResult = c * d;
		
		// 정수 * 실수 = 실수
		doubleResult = a * d;
		
		// 나누기: /
		// 좌항에 우항을 나눈 결과를 반환
		// 정수 나누기 정수의 결과는 실수부가 버려짐
		intResult = a / b;
		System.out.println(intResult);
		doubleResult = c / d;
		System.out.println(doubleResult);
		doubleResult = a / d;
		System.out.println(doubleResult);
		
		// 나머지: %
		// 좌항에 우항을 나눈 나머지를 반환
		intResult = a % b;
		doubleResult = c % d;
				
		// 증감 연산자
		// 피연산자의 값을 1 증가 혹은 감소
		// 증가 연산자: ++
		// 감소 연산자: --
		int number = 5;
		intResult = ++number + 5; // 11 앞에 붙으면 증가시킨 후 연산
		intResult = number++ + 5; // 10 뒤에 붙으면 연산 후 증가
		System.out.println(intResult);
		System.out.println(number);
		System.out.println(intResult);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}













