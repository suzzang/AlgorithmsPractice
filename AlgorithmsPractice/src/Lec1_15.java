
public class Lec1_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangleLU(5);
		triangleRU(5);
		triangleRB(5);

	}
	static void triangleLU(int n) {
		for(int i = 1; i<=n;i++) {
			for(int m=1;m<=n-i+1;m++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
	static void triangleRU(int n) {
		for(int i = 1;i<=n;i++) {
			for(int m = 1;m<=i-1;m++) {
				System.out.print(' ');
			
			}
			for(int j=1;j<=n-i+1;j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
	static void triangleRB(int n) {
		for (int i = 1;i<=n;i++) {
			for(int m = 1;m<=n-i;m++) {
				System.out.print(' ');
			}
			for(int j = 1;j<=i;j++) {
				System.out.printf("*");
			}
			System.out.println();
			
		}
	}

}
