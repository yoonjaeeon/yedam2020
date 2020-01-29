package referenceType;

public class ArrayMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intAry = { 3, 7, 5, 8, 4 };
//		System.out.println("배열의 길이: " + intAry.length);
		int sum = sumArrayMethod(intAry);
		System.out.println("합은: " + sum);
		
		int[] intAry2 = { 3, 7, 5, 8, 4 };
		int sum2 = sumArrayMethod(intAry2);
		System.out.println("합은: " + sum2);
		
		int[] intAry3 = { 3, 7, 5, 8, 4 };
		int sum3 = sumArrayMethod(intAry3);
		System.out.println("합은: " + sum3);
	}
			
	public static int sumArrayMethod(int[] ary) {
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum += ary[i];
		}
		return sum;
	}
}
		