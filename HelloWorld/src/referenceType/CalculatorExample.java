package referenceType;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printStar(5, "+");
		sum(1, 2);
		int r = sum2(1, 2);
		System.out.println("r의 값은: " + r);
//		String ret = welcome("윤재언");
		System.out.println(welcome("윤재언"));
	}

	public static String welcome(String name) {
		return "Hello " + name;
	}

	public static void sum(int a, int b) {
		int result = a + b;
		System.out.println("두수의 합은: " + result);
	}

	public static int sum2(int a, int b) {
		int result;
		result = a + b;
		return result;
	}

	public static void printStar(int k, String s) {
		for (int i = 0; i < k; i++) {
			for (int j = 0; j <= i; j++)
				System.out.print(s);
			System.out.println();
		}
	}

	public static void print(int a, String str) {
		for (int i = 0; i < a; i++) {
			System.out.println(str);
		}
	}

	public static void minus(int x, int y) {
		int result = x - y;
		System.out.println("두수의 차이는: " + result);
	}

	public static void multi(int x, int y) {
		int result = x * y;
		System.out.println("두수의 곱은: " + result);
	}

	public static void divide(int x, int y) {
		double result = (double) x / y;
		System.out.println("나눈 결과는 : " + result);
	}
}
