package array;

public class MergeTwoSortedArray {

	public static int[] mergeTwoArray(int[] arr1, int[] arr2) {

		int[] mergedArr = new int[arr1.length + arr2.length];

		int i = 0;
		int j=0;
		int k=0;

		while (j < arr1.length || k < arr2.length) {
			
			if(j>=arr1.length) {
				mergedArr[i] = arr2[k];
				k++;
			}else if(k>=arr2.length) {
				mergedArr[i] = arr1[j];
				j++;
			}else {
				if (arr1[j] < arr2[k]) {
					mergedArr[i] = arr1[j];
					j++;
				} else {
					mergedArr[i] = arr2[k];
					k++;
				}
			}
			
			
			i++;
		}

		return mergedArr;
	}

	public static void main(String[] args) {

		int[] arr1 = { 0, 3, 4, 31 };
		int[] arr2 = { 4, 6, 30 };

		int[] arr3 = mergeTwoArray(arr1, arr2);
		printArr(arr3);

	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
