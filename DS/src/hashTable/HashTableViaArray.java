package hashTable;

import java.util.Random;

public class HashTableViaArray {

	int[] arr = new int[50];

	public int hash(String key) {

		int hash = 0;
		for (int i = 0; i < key.length(); i++) {
			hash = ((hash + (int) key.charAt(i)) * i) % arr.length;
		}

		return hash;
	}

	public void set(String key, int value) {
		arr[hash(key)] = value;
	}
	
	public int[] getKeys() {
		
		int[] arrayKeys=new int[50];

		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arrayKeys[i]=arr[i];
			}
		}
		
		return arrayKeys;
		
	}

	public static void main(String[] args) {
		HashTableViaArray obj = new HashTableViaArray();
		obj.set("Naren", 101);
		obj.set("Mehta", 201);
		obj.set("Singh", 301);
//		obj.set("Mehta", 401);

		printArr(obj.arr);
		
		printArr(obj.getKeys());

	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
