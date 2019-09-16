package array;

public class ArrayDeletionInBetween {

	public static void main(String[] args) {

		int position = 4;
		
		int[] arr=initilizeArr();
		printArr(arr);
		
		System.out.println("Delete from ith position.\n");

		for (int i = position; i < arr.length-1; i++) {
			arr[i]=arr[i+1];
		}
		
		printArr(arr);


	}
	
	public static void printArr(int[] arr) {
		System.out.println("============array==========");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
	}
	
	public static int[] initilizeArr() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length-2; i++) {
			arr[i] = i;
		}
		return arr;
	}

}
