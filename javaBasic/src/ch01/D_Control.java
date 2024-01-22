package ch01;

import java.util.Scanner;

public class D_Control {

	public static void main(String[] args) {
		
		// 제어문: 조건에 따라서 코드의 흐름을 결정하는 것
		
		Scanner scanner = new Scanner(System.in);
		
		// 조건문: 특정 조건이 만족하면 코드를 실행하는 것, 만족하지 않으면 실행하지 않음
		
		// if: 주어진 조건이 true이면 코드를 실행하도록 하는 것
		// if (조건-논리표현식) { 실행할 코드 }
		int age = 18;
		
		// age는 17보다 크거나 같으면서 19보다 작거나 같아야한다.
		// age >= 17 && age <= 19
		
		// age는 17보다 크거나 같거나 19보다 작거나 같아야한다.
		// age >= 17 || age <= 19
		
		// 부정연산자: 논리 표현식을 부정하는 연산
		// !논리: 논리가 true면 false, false면 true를 반환
		boolean isHighSchool = age >= 17 && age <= 19; // 논리표현식이 길때 변수로 생성하자.
		if (!isHighSchool) {
			System.out.println("고등학생이 아닙니다.");
		};
		
		System.out.println("프로그램을 종료");
		
		System.out.println("================================================");
		System.out.println("================================================");
		
		// else: if 문의 조건-논리표현식이 false면 코드를 실행하도록 하는 것
		// if (조건-논리표현식) { true이면 실행할 코드 }
		// else { false이면 실행할 코드 }
		
		// 1. else문은 반드시 if문 이후에 와야함 (else 단독으로 사용불가능)
		// 2. else문에는 조건을 작성하지 않음
		age = 10;
		if (age > 19) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("미성년자 입니다.");
		};
		System.out.println("프로그램종료");
		
		
		
		

	}

}

















