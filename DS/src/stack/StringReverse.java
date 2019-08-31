package stack;

import java.util.Stack;

public class StringReverse {

	
	public static void main(String[] args) {
		
		char[] arr= {'h','e','l','l','o'};
		
		Stack s= new Stack();
		
		for(int i=0;i<arr.length;i++) {
			s.push(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=(char) s.pop();
		}
		
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
		
	}
}
