
public class WhileAndWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=2; i<=9; i++) {
//			for(int j=1; j<=9; j++)
//				System.out.println(i+"x"+j+"="+(i*j));
//		}
		int i = 0;
		while (i <= 9) {
			int j = 2;
			while (j <= 9) {
				if (i == 0) {
					System.out.print("==" + j + "단==");
				} else {
					System.out.print(j + "*" + i + "=" + (i * j) + "  ");
				}
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
