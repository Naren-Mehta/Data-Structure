package array;

public class ImplementationOfArray {

	int[] arr = {};
	int length;
	int count;

	public ImplementationOfArray() {
		arr = new int[1];
		count = 0;
		length = 1;
	}

	public int get(int index) {
		return arr[index];
	}

	public void add(int item) {

		if (count == length) {
			growSize();
		}
		arr[count] = item;
		count++;
	}

	public void addAt(int index, int item) {

		if (count == length) {
			growSize();
		}

		for (int i = count - 1; i >= index; i--) {
			arr[i + 1] = arr[i];
		}

		arr[index] = item;
		count++;
	}

	public void remove() {

		if (count > 0) {
			arr[count - 1] = 0;
			count--;
		}

	}

	public void removeAt(int index) {

		if (count > 0) {
			for(int i=index;i<count;i++) {
				arr[i] = arr[i+1];
			}
			count--;
		}

	}
	
	public void srinkArr() {
		if(count>0) {
			int[] temp=new int[count];
			
			for(int i=0;i<count;i++) {
				temp[i]=arr[i];
			}
			arr=temp;
		}
	}

	public void growSize() {
		length = 2 * length;
		int[] tempArr = new int[length];

		for (int i = 0; i < arr.length; i++) {
			tempArr[i] = arr[i];
		}
		arr = tempArr;
	}

	public static void main(String[] args) {
		ImplementationOfArray a = new ImplementationOfArray();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);

		printArr(a.arr);

		a.addAt(3, 35);
		printArr(a.arr);
		a.removeAt(3);
		printArr(a.arr);

		a.srinkArr();
		printArr(a.arr);


	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
