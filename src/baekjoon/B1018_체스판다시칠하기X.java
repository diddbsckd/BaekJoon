package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1018_체스판다시칠하기X {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		System.out.println("N = " + N);
		int M = Integer.parseInt(st.nextToken());
		System.out.println("M = " + M);
		
		String[][] board = new String[M][N];
		
		for(int i=0; i<N; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			System.out.println(st1);
			for(int j=0; j<M; j++) {
				board[i][j] = st1.nextToken();
				System.out.println(board[i][j]);
			}
			System.out.println(111);
		}
		
	}

}
//8 8
//WBWBWBWB
//BWBWBWBW
//WBWBWBWB
//BWBBBWBW
//WBWBWBWB
//BWBWBWBW
//WBWBWBWB
//BWBWBWBW
