package hashTable;

import java.util.Hashtable;

public class FIndSecondOccurence {

	public int secondOccurence(int[] arr) {

		Hashtable h = new Hashtable();
		for (int i = 0; i < arr.length; i++) {
			if (h.put(arr[i], true) != null) {
				return arr[i];
			}
		}
		return -1;

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

		FIndSecondOccurence obj = new FIndSecondOccurence();
		int[] arr = { 2, 3, 3,2, 5, 1, 4 };
		System.out.println("=method 2 ="+obj.secondOccurence(arr));
		System.out.println("=method 2 ="+obj.secondOccurence2(arr));

	}

}
