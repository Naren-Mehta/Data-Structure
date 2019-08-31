package array;

import java.util.Scanner;

public class ArrayInsertionInBetween {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter array size ");

		int arrSize = sc.nextInt();

		int[] arr = new int[arrSize];
		System.out.println("Enter elements : ");
		for (int i = 0; i < arrSize; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Your array ");
		printArr(arr);

		System.out.println("Enter postition you want to insert");

		int position = sc.nextInt();

		System.out.println("Inter number that you want to insert: ");
		int positionValue = sc.nextInt();

		int[] arrNew = new int[arrSize + 1];
		for (int i = 0; i < arrSize; i++) {
			arrNew[i] = arr[i];
		}

		System.out.println("Insertion Process started : ");

		for (int i = arrNew.length - 1; i > position; i--) {
			arrNew[i] = arrNew[i - 1];
		}

		arrNew[position] = positionValue;
		System.out.println("Array after insertion: ");
		printArr(arrNew);

		System.out.println("Enter postition you want to Delete");

		int positionDeletion = sc.nextInt();
		
		System.out.println("Deletion Process started : ");

		for (int i = positionDeletion+1; i<arrNew.length; i++) {
			arrNew[i-1] = arrNew[i];
			arrNew[i]=0;
		}
		System.out.println("Array after deletion: ");
		printArr(arrNew);

		/*
		 * int newValue = 10; int position = 4;
		 * 
		 * int[] arr = initilizeArr(); printArr(arr);
		 * 
		 * System.out.println("Insert into ith position.\n");
		 * 
		 * for (int i = position; i < arr.length - 1; i++) {
		 * 
		 * int temp = arr[i]; arr[i] = newValue; newValue=temp;
		 * System.out.println(arr[i]+"==="+arr[i+1]); }
		 * 
		 * printArr(arr);
		 */

	}

	public static void printArr(int[] arr) {
		System.out.println("============array==========");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}

	public static int[] initilizeArr() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length - 2; i++) {
			arr[i] = i;
		}
		return arr;
	}

}
