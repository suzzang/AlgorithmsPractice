import java.util.Scanner;

public class Lec1_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int a;
		int b;
	
		System.out.println("두 정수 a,b를 입하세요.");
		System.out.print("a의 값: ");
		a = stdIn.nextInt();
		System.out.print("b의 값: ");
		b=stdIn.nextInt();
		if(a>b) { //이게머지
			do {
				System.out.println("a보다 큰 값을 입력하세요!");
				System.out.print("b의 값: ");
				b=stdIn.nextInt();
				
			}while(b<a);
			
		}
		System.out.println("b-a는 "+(b-a)+"입니다.");
		

	}

}
