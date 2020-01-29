package referenceType;

public class ArrayInitialValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intAry = new int[5];
		double[] doubleAry = new double[3];
		String[] strAry = new String[4];
		intAry[0] = 10;
		doubleAry[0] = 20.5;
		strAry[0] = "Hello";
		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i]);
		}
		for (int i = 0; i < intAry.length; i++) {
			System.out.println(doubleAry[i]);
		}
		for (int i = 0; i < intAry.length; i++) {
			System.out.println(strAry[i]);
		}
	}
}
