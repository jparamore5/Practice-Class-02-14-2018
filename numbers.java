package vdaywork;

public class numbers {

	public static void main(String[]args) {

		int a = 6;
		int b = 21;
		int c = addNumbers (a,b);

		System.out.println("The sum is" + addNumbers(7,99));
		System.out.println("The division between both numbers is" + divideNumbers(45,5));
		System.out.println("The division between both numbers is" + divideNumbers(c,1));
		System.out.println("The smallest number is " + smallerNumber(10,18));
		System.out.println("The average is " + averageNumbers(72,6,91));
		System.out.println("The average is " + averageNumbers(200,1,117));
		
	}

	
	public static int addNumbers(int num1, int num2) {

		int sum = num1 + num2;
		return sum;

	}


	public static int smallerNumber(int num1, int num2) {
		if (num1 > num2) {
			return num2;
		} else {
			return num1;
		}

	}

	public static int divideNumbers(int num1, int num2) {

		int divide = num1 / num2;
		return divide;
	}
	
	public static double averageNumbers(int num1, int num2, int num3) {
		double average = num1+num2+num3 / 3;
		return average;
	}
	
}
