
public class ForArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intAry = new int[100];
		for(int i=0; i <= 99; i++) {
			intAry[i] = i+1;
			System.out.println("1~100의 값: " + intAry[i]);
		}
		int sum = 0; 
		for(int i=0; i <=99; i++) {
			if(i % 2 == 1)
				sum += intAry[i];
		}
		System.out.println("합: " + sum);
	}

}
