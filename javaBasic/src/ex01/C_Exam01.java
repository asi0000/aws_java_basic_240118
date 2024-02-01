package ex01;

import java.util.List;

class NumList {
	
	public int solution (int[] solution) {
			for (int i = 0; i < solution.length; i++) {
				if(solution[i] < 0)
					return i;
				if (solution[i] >= 0) return -1;
			}
	}
}

public class C_Exam01 extends NumList {

	public static void main(String[] args) {

		NumList numlist = new NumList();
		System.out.println(numlist.solution());	
	}
}