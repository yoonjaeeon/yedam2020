
public class IfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 77;
		if(result >= 90) {
			if(result >= 95) {
				System.out.println("A+ 학점");
			} else {
				System.out.println("A 학점");
			}
		} else if (result >= 80) {
			if(result >= 85) {
				System.out.println("B+ 학점");
			} else {
			System.out.println("B 학점");
			}
		} else if (result >= 70) {
			if(result >= 75) {
				System.out.println("C+ 학점");
			} else {
			System.out.println("C 학점");
			}
		} else {
			System.out.println("F 학점");
		}

	}

}
