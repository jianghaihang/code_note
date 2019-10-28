package xiaoduo.basic;

import java.util.ArrayList;
import java.util.List;

/**
 * 正则表达式
 * 
 * @author admin
 *
 */
public class Demo03 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		
		int[] arr = new int[50];
		
		for(int i = 0; i < 38; i ++) {
			
//			list.add(i);
			if(i == 0) {
				
				arr[i] = 1;
				
				list.add(arr[i]);
				
			}else if(i == 1) {
				
				arr[i] = arr[i - 1] + 0;
				
				list.add(arr[i]);
				
			}else if(i > 1) {
				
				arr[i] = arr[i - 1] + arr[i - 2];
				
				list.add(arr[i]);
				
				System.out.println(list);
			}
			
//			System.out.println(list);
		}
		
		for(int i = 0; i < arr.length; i ++) {
			
//			System.out.println(arr[i]);
		}
		
//		System.out.println(sum);
	}

}
