package array;

public class ArrayPerformanceWhileSearching {

	public static void main(String[] args) {
		
		
		int[] arr= new int[19999999];
		arr[19999998]=100;
		
		
		
		long time=System.currentTimeMillis();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==100l) {
				System.out.println("found");
			}
		}
		
		System.out.println(System.currentTimeMillis()-time);
		
	}
	
}
