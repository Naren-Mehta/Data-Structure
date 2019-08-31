package practice;

import java.util.HashSet;
import java.util.Set;

public class HasPairWithSum {

	public static boolean checkPairWithSum(int[] arr, int sum) {
		
		//O(n^2)
		/*for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; i++) {
				if (i != j && (arr[i] + arr[j] == 9)) {
					System.out.println(arr[i]+" + "+arr[j] +" = "+sum);
					return true;
				}
			}
		}
		return false;*/
		
		Set set = new HashSet();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++) {
			if(set.contains(sum-arr[i])) {
				System.out.println(arr[i]+" + "+(sum-arr[i]) +" = "+sum);
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {

		int[] arr = { 6, 4, 4, 2, 1, 10 };
		int sum = 9;
		
		System.out.println(checkPairWithSum(arr,sum));

	}

}
