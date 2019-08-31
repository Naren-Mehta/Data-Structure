package hashTable;

import java.util.Hashtable;

public class FindFirstAndLastSecondOccurence {

	public void secondOccurence(int[] arr, int find) {

		Hashtable h = new Hashtable();
		int lastIndex=0;
		int firstIndex=-1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==3 && firstIndex==-1 ) {
				firstIndex=i;
			}
			if (h.put(arr[i], i) != null) {
				if(lastIndex<(int)h.put(arr[i], i)) {
					lastIndex=(int)h.put(arr[i], i);
				}
			}
		}
		
		System.out.println(firstIndex+"==="+lastIndex);

	}

	public int secondOccurence2(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					return arr[i];
				}
			}
		}
		return -1;

	}
	

	public static void main(String[] args) {

		FindFirstAndLastSecondOccurence obj = new FindFirstAndLastSecondOccurence();
		int[] arr = { 2, 3, 3,2, 5, 1, 4,3 };
		obj.secondOccurence(arr, 3);
		System.out.println("=method 2 ="+obj.secondOccurence2(arr));

	}

}
