import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class P_2751 {

	static int[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		arr = new int[num];
		
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
		
		int[] arr = new int[num];
		for (int i = 0;i<num;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		Ascending as = new Ascending();
		
		List<Integer> datas = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		Collections.sort(datas, as);
		
		for(int i = 0; i<num;i++) {
			System.out.println(datas.get(i));
		}
	
	}
	
//	private static void selectionSort(int[] arr) {
//		for(int i = arr.length-1;i>0;i--) {
//			int maxidx = 0;
//			for(int j = 1;j<=i;j++) {
//				if(arr[j]>arr[maxidx]) {
//					maxidx = j;
//				}
//				swap(arr,maxidx,i);
//			}
//		}
//		for(int i = 0; i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		
//		
//	}
//
//	private static void swap(int[] arr, int maxidx, int i) {
//		// TODO Auto-generated method stub
//		int temp = arr[i];
//		arr[i] = arr[maxidx];
//		arr[maxidx]= temp;
//	}
	
	
}
class Ascending implements Comparator<Integer>{
	public int compare(Integer o1,Integer o2) {
		return o1.compareTo(o2);
	}
	
}
//쉬워보였는데 왜 정답률이 34%일까..했는데..ㅎ
//2초만에 1,000,000개를 정렬해야한다..
//정렬의 기본도 몰랐던 나는 당연히 틀렸따!ㅎㅎ 각 정렬의 시간복잡도는 꼭 알아야한다.
//여기에서는 Collection 클래스의 sort 메소드를 이용했는데..정말 자바 좋다..ㅇㅅㅇ..
//구현은 단순하지만 퀵정렬하고 힙정렬하고 속도가 동일하다! 자주 애용해야 할듯..^_^
//그리고 시간에 있어서 Scanner로 입력을 받는것보다는 BufferedReader를 쓰는게 좋다! 6초나 더 빠르다;;


