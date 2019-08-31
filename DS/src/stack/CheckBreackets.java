package stack;

import java.util.Stack;

public class CheckBreackets {
	public static void main(String[] args) {
		
		
		String s="))";
		char[] arr= s.toCharArray();
		Stack stack= new Stack();
		boolean isValid=true;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='[' || arr[i]=='{' || arr[i]=='(') {
				stack.push(arr[i]);
			}else if(arr[i]==']' || arr[i]=='}' || arr[i]==')'){
				char c= (char)stack.pop();
				if(!((arr[i]==']' && c=='[') || (arr[i]=='}' && c=='{') 
						|| (arr[i]==')' && c=='('))) {
					isValid=false;
				}
			}
		}
		
		if(stack.isEmpty() &&  isValid) {
			System.out.println(isValid);
		}else {
			System.out.println(false);

		}
		
	}
}
