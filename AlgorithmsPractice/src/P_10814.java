import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class P_10814 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String[][] arr = new String[N][3];
		
		for(int i = 0;i<N;i++) {
			String[] input = br.readLine().split(" ");
			arr[i][0] = input[0];
			arr[i][1] = input[1];
			arr[i][2] = String.valueOf(i);
		}
		
		Arrays.sort(arr, new Comparator<String []>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				// TODO Auto-generated method stub
				//if(Integer.parseInt(o1[0])==Integer.parseInt(o2[0])) return Integer.compare(Integer.parseInt(o1[2]),Integer.parseInt(o2[2]));
				return Integer.compare(Integer.parseInt(o1[0]),Integer.parseInt(o2[0]));
			}
			
		});
		
		for(int i = 0 ; i<arr.length;i++) {
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
		
	}

}

