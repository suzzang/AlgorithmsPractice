import java.util.Scanner;

public class Lec1_07_09 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int num2;
		System.out.println("1이상의 두 정수를 입력하세요.");
		Scanner stdIn = new Scanner(System.in);
		num = stdIn.nextInt();
		num2 = stdIn.nextInt();
		
		
		
		//07
//		int sum = 0;
//		for(int i = 1;i<= num;i++) {
//			sum+=i;
//			if(i==num) {
//				System.out.print(i+" = "+sum);
//			}else {
//				System.out.print(i+" + ");
//			}
//			
//			
//		}
		
		
		//System.out.println("합: "+gauss_Sum(num));
		System.out.println("합: "+sumof(num,num2));
		

	}
	
	//08
	public static int gauss_Sum(int num) {
		int sum = 0;
		sum = (1+num)*num/2;
		return sum;
		
	}
	//09번
	public static int sumof(int a,int b) {
		int sum = 0;
		if(a>=b) {
			for(int i = b;i<=a;i++) {
				sum+=i;
			}
			
		}else {
			for(int i = a;i<=b;i++) {
				sum+=i;
			}
			
		}
		return sum;
	}
	
	
	

}
