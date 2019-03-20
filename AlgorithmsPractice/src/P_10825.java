import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


public class P_10825 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[][] arr = new String[N][4];
		for(int i = 0;i<N;i++) {
			String[] input = br.readLine().split(" ");
			arr[i][0] = input[0];
			arr[i][1] = input[1];
			arr[i][2] = input[2];
			arr[i][3] = input[3];
			
		}
		Arrays.sort(arr, new Comparator<String[]>() {

			@Override
			public int compare(String[] x, String[] y) {
				// TODO Auto-generated method stub
				if((Integer.parseInt(x[1])==Integer.parseInt(y[1]))
						&&(Integer.parseInt(x[2])==Integer.parseInt(y[2]))
						&&(Integer.parseInt(x[3])==Integer.parseInt(y[3]))) {
					return x[0].compareTo(y[0]);
				}else if((Integer.parseInt(x[1])==Integer.parseInt(y[1]))
						&&(Integer.parseInt(x[2])==Integer.parseInt(y[2]))){
					return Integer.compare(Integer.parseInt(y[3]), Integer.parseInt(x[3]));
					
				}else if(Integer.parseInt(x[1])==Integer.parseInt(y[1])) {
					return Integer.compare(Integer.parseInt(x[2]), Integer.parseInt(y[2]));
					
				}else {
					return Integer.compare(Integer.parseInt(y[1]), Integer.parseInt(x[1]));
				}
			}
			
		});
		
		
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i][0]);
		}
		
	
	}
}
//내림차순(큰거에서 작은거)은 그냥 인자의 위치를 바꿔서 써주면된다.
