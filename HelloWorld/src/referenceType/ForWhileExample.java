package referenceType;

// 1. 1차원 배열 -> 10개 크기
// 2. 2차원 배열 -> [5][5] 배열
// 3. 야구 게임
public class ForWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
		method2();
	}

	public static void method1() {
		System.out.println("1번 문제");
		int[] intAry = new int[10];
		for (int i = 0; i < intAry.length; i++) {
			intAry[i] = (i + 1);
			System.out.print(intAry[i] + " ");
		}
		System.out.println();
	}

	public static void method2() {
		System.out.println("2번문제");
		int intAry2[][] = new int[5][5];
		// 5x5
		int cnt = 1;
		for (int i = 0; i < intAry2.length; i++) {
			for (int j = 0; j < intAry2[i].length; j++) {
				intAry2[i][j] = cnt++;
			}

		}
		for (int i = 0; i < intAry2.length; i++) {
			for (int j = 0; j < intAry2[i].length; j++) {
				System.out.printf("%3d", intAry2[j][i]);

			}

			System.out.println();
		}
	}
}
