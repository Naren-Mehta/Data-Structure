package stack;

public class LargestRactangle {

	
	static long largestRectangle(int[] h) {

		long size=0;
		
		for(int i=0;i<h.length;i++) {
			int length=h[i];
			for(int j=i+1;j<h.length;j++) {
				if(h[i]>=h[j]) {
					if(length < h[j]*(j+1)) {
						length=h[j]*(j+1);
					}
				}else{
					System.out.println(j+"===here=="+h[i]);
					if(length < h[i]*(j+1)) {
						length=h[j]*(j+1);
					}
				}
			}
			if(size<length) {
				size=length;
			}
		}
		
		
		return size;

    }
	
	public static void main(String[] args) {
		System.out.println(largestRectangle(new int[] {9,10,11}));
	}

}
