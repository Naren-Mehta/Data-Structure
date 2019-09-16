package array.revision;

public class MergeTwoSortedArray {

	public static void main(String[] args) {

		int[] arr1 = { 3, 4, 10 };
		int[] arr2 = { 6, 7, 8 };

		int length = arr1.length + arr1.length;
		int[] newArr = new int[length];

		int i = 0;
		int j = 0;
		int count = 0;
		System.out.println("====");
		while (i < arr1.length || j < arr2.length) {

			if (i < arr1.length) {
				if (arr1[i] >= arr2[j]) {
					newArr[count] = arr2[j];
					j++;
				}
			}
			if(j < arr2.length) {
				 if(arr1[i] < arr2[j]) {
						newArr[count] = arr1[i];
						i++;
					}	
			}
			
			count++;
		}
		System.out.println("====");
		printArray(newArr);

	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
