package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10807_개수세기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		
		String V = br.readLine();
		
		int result = 0;
		for(int i=0; i<N; i++) {
			if(arr[i].equals(V)) {
				result++;
			}
		}
		
		System.out.println(result);
	}

}

//11
//1 4 1 2 4 2 4 2 3 4 4
//5
