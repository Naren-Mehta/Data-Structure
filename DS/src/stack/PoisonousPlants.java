package stack;

import java.util.Stack;

public class PoisonousPlants {

	static int poisonousPlants(int[] p) {

		int totalDay = 0;
		Stack<Integer> s= new Stack<Integer>();
		for(int i=p.length-1;i>=0;i--) {
			int arrElement=p[i];
			int count = 0;
			while(!s.isEmpty() && s.peek()> arrElement ) {
				s.pop();
				count++;
			}
			
			if(totalDay<count) {
				totalDay=count;  
			}
			
			s.push(arrElement);
		}
		
		System.out.println(s);
		

		return totalDay;

	}

	public static void main(String[] args) {
		System.out.println(poisonousPlants(new int[] { 6, 5, 8, 4, 7, 10, 9,11 }));
	}

}
