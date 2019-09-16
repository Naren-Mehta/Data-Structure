package array.revision;

public class ImplementationOfArray {

	int[] arr = {};
	int length;
	int count;

	ImplementationOfArray() {
		arr = new int[1];
		length = 1;
		count = 0;
	}

	public int get(int index) {
		return arr[index];
	}

	public void remove() {
		if (count == 0) {
			return;
		}
		arr[count - 1] = 0;
	}

	public void removeAt(int index) {
		if (index < 0 || count < 1) {
			return;
		}

		for (int i = index; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
	}

	public void add(int value) {

		if (count == length) {
			System.out.println("Growing array size..");
			growSize();
		}
		arr[count] = value;
		count++;

	}

	public void addAt(int index, int value) {

		if (count == length) {
			System.out.println("Growing array size..");
			growSize();
		}

		for (int i = count; i > index; i--) {
			arr[i] = arr[i - 1];
		}

		arr[index] = value;
		count++;

	}

	public void growSize() {
		int newArrayLength = (length * 3) / 2 + 1;
		int[] newArr = new int[newArrayLength];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		length = newArrayLength;
		arr = newArr;
	}

	public static void main(String[] args) {

		ImplementationOfArray app = new ImplementationOfArray();
		app.length = 4;
		app.arr = new int[app.length];

		app.add(10);
		app.add(11);
		app.add(12);
		app.add(13);

		app.add(14);
		printArr(app.arr);

		System.out.println("===Add at====");
		app.addAt(2, 25);
		app.addAt(3, 22);

		printArr(app.arr);
		System.out.println("Removing last");
		app.remove();

		printArr(app.arr);
		System.out.println("Removing with index");
		app.removeAt(2);
		printArr(app.arr);
	}

	public void srinkArr() {

		if (length == count) {
			return;
		}
		int[] tempArr = new int[count];

		for (int i = 0; i < count; i++) {
			tempArr[i] = arr[i];
		}

		arr = tempArr;

	}

	public static void printArr(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
