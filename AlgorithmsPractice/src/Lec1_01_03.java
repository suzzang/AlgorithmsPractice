import java.util.Scanner;

public class Lec1_01_03 {

	/*
	 * 자료구조와 함께배우는 알고리즘 입문 - 01_1번,2번,3번
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("x값 입력:");
		int x = stdIn.nextInt();
		System.out.print("y값 입력:");
		int y = stdIn.nextInt();
		System.out.print("z값 입력:");
		int z = stdIn.nextInt();
		System.out.print("q값 입력:");
		int q = stdIn.nextInt();
		
		//System.out.println("최대값은 "+max4(x,y,z,q));
		//System.out.println("최솟값은 "+min3(x,y,z));
		System.out.println("최솟값은 "+min4(x,y,z,q));
		

	}
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(b>max) max = b;
		if(c>max) max = c;
		if(d>max) max = d;
		
		return max;
		
	}
	static int min3(int a, int b, int c) {
		int min=a;
		if(b<min) min = b;
		if(c<min) min = c;
		
		return min;
	}
	static int min4(int a,int b, int c,int d) {
		int min = a;
		if(b<min) min = b;
		if(c<min) min = c;
		if(d<min) min = d;
		return min;
	}

}
