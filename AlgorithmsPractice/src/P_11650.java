import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class P_11650 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int[][] xy = new int[num][2];
		
		for(int i = 0; i<num;i++) {
			String[] input =br.readLine().split(" ");
			xy[i][0] = Integer.parseInt(input[0]);
			xy[i][1] = Integer.parseInt(input[1]);
		}
		
		Arrays.sort(xy, new Comparator<int []>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o1[0]==o2[0]) return Integer.compare(o1[1],o2[1]);
				return Integer.compare(o1[0], o2[0]);
			}
			
		});
		
		for(int i = 0;i<num;i++) {
			System.out.println(xy[i][0]+" "+xy[i][1]);
		}
		
	}

}
//Array클래스의 sort 잘써보기! 진짜 좋당0_0
//이제부터라도 BufferedReader로 입력받는거익숙해져야겠다
//2차원배열 정렬은 생소했지만..별로 다른건 없었다...!
//저 sort메소드를 얼마나 잘쓸것인가 가 관건.....
