
public class Lec1_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("   |");
		for(int i = 1;i<=9;i++) 
			System.out.printf("%3d",i);
		System.out.println("\n---+---------------------------");
		
		for (int j = 1;j<=9;j++) {
			System.out.printf("%2d |",j);
			for(int m = 1;m<=9;m++) {
				System.out.printf("%3d", j * m);
				
			}
			System.out.println();
			
		}
	

	}

}
