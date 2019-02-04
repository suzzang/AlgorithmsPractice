
public class Lec1_16_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		npira(4);
		spira(4);
		
	}
	static void spira(int n) {
		for(int i=1;i<=n;i++) {
			for(int j = 1; j<=n-i+1;j++) {
				System.out.print(' ');
			}
			for(int m = 1;m<=(i-1)*2+1;m++) {
				System.out.printf("*");
			}
			System.out.println();
			
		}
	}
	static void npira(int n) {
		for(int i=1;i<=n;i++) {
			for(int j = 1; j<=n-i+1;j++) {
				System.out.print(' ');
			}
			for(int m = 1;m<=(i-1)*2+1;m++) {
				System.out.print(i%10);
			}
			System.out.println();
			
		}
		
	}

}
