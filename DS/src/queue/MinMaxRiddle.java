package queue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MinMaxRiddle {

	static long getMax(Queue<Long> q) {
		return 0;
	}
	
	static long[] riddle(long[] arr) {

		long[] maxArr = new long[arr.length];
		long max = 0;
		Queue<Long> q = new LinkedList();
		
		for (int i = 0; i < arr.length; i++) {
			 q.add(arr[i]);
		}
		
		printQueue(q);
		return maxArr;

	}

	public static void main(String[] args) {
		long[] arr = { 1,2,3,4,1,13,3 };
		arr = riddle(arr);
		
		
		HashSet s = new HashSet();
		s.add("abc");
		
		System.out.println(s.contains("abc"));
	}

	public static void printQueue(Queue<Long> q) {
		while(!q.isEmpty()) {
			System.out.print(q.poll()+" ");
		}
		System.out.println();
	}
	
}
