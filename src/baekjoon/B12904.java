package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B12904 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		String T = sc.next();
		
		ArrayList<Character> arr = new ArrayList<>();
		for(int i=0; i<T.length(); i++) {
			arr.add(T.charAt(i));
		}
		
		for(int i=T.length(); i>S.length(); i--) {
			
			if(arr.get(arr.size()-1) == 'A') {
				arr.remove(arr.size()-1);
				
			}else if(arr.get(arr.size()-1) == 'B') {
				
				arr.remove(arr.size()-1);
				Collections.reverse(arr);
				
			}
		}
		
		String X ="";
		for(int i=0; i<arr.size(); i++) {
			X += Character.toString(arr.get(i));
		}
		
		if(X.equals(S)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		sc.close();
		
		
		
//		Deque<String> deq = new ArrayDeque<>();
//		StringBuffer bf = new StringBuffer();
//		
//		
//		
//		String S = sc.next();
//		String T = sc.next();
//		
//		for(int i=0; i<T.length(); i++) {
//			deq.add(String.valueOf((T.charAt(i))));
//		}
//		
//		for(int i=0; i<T.length()-1; i++) {
//			if(T.charAt(T.length()-1) == 'A') {
//				deq.removeLast();
//				System.out.println(deq);
//			}else if(T.charAt(T.length()-1) == 'B') {
//				deq.removeLast();
//				bf.reverse();
//				System.out.println(deq);
//			}
//		}
	}

}
