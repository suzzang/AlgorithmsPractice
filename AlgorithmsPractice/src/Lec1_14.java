import java.util.Scanner;

public class Lec1_14 {
	public static void main(String[] args) {
		System.out.println("사각형을 출력합니다.");
		Scanner stdIn = new Scanner(System.in);
		System.out.printf("단 수 : ");
		int num = stdIn.nextInt();
		
		for(int i = 1;i<=num;i++) {
			for(int j = 1; j<= num; j++) {
				System.out.printf("*");
			}
			
			System.out.println();
			
		}
		
	}

}
