package ch02;

class ExampleClass2 {
	
	static int number = 3;
	double doubleNumber;
	
	Sample1 method () {
		Sample1 sample = new Sample1();
		sample.data = -456;
		return sample;
	}
	
	static void staticMethod () {
		
	}
	
}

class Sample1 {
	int data;
	
	Sample1 () {}
	
	Sample1 (Sample1 sample) {
		this.data = sample.data;
	}
	
}  

public class A_JVM {

	public static void main(String[] args) {
		
		ExampleClass2 instance1 = new ExampleClass2();
		ExampleClass2 instance2 = new ExampleClass2();
		
		Sample1 sample = new Sample1();
		sample.data = 8;
		
		int number = 0;
		instance1.doubleNumber = 9.9;
		
		sample = instance1.method();
		
		System.out.println(sample.data);
		
		int number2 = number;
		number2++;
		System.out.println(number); // 0
		System.out.println(number2); // 1
		
		Sample1 sample2 = sample; // -456
		sample2.data++; // -455
		System.out.println(sample.data); // -455 주소만 가져오고 힙영역에 있는 숫자는 54번줄이기 때문에 -455가 됨.
		System.out.println(sample2.data);// -455
		
		Sample1 sample3 = new Sample1(sample);
		System.out.println(sample.data); // -455
		System.out.println(sample3.data);// -455
		sample3.data++;
		System.out.println(sample.data); // -455
		System.out.println(sample3.data);// -454
		
		
	}

}

























