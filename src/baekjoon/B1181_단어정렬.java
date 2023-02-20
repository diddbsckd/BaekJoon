package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class B1181_단어정렬 {
	
	public static void main(String[] args) throws IOException {
		StringBuilder stb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<String> arr2 = new ArrayList<>();
		String[] arr = new String[N];
		for(int i=0; i<N; i++) {
			arr2.add(br.readLine());
//			arr[i] = br.readLine();
		}
		
		Arrays.sort(arr, Comparator.comparing(String::length));
//		LinkedList<String> list = new LinkedList<>();
//		list.addAll(arr2);
//		for(int i=1; i<N; i++) {
//			if(arr[i].equals(arr[i-1])) {
//			}
//		}
		System.out.println(arr2);
	}
	
	
}
