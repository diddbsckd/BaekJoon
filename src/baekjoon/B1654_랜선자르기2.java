package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B1654_랜선자르기2 {

	public static void main(String[] args) {
		long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
		
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt(); 		// 가지고 있는 랜선의 개수
		int N = sc.nextInt();		// 만들어야하는 랜선의 개수
		long[] arr = new long[K];		// 가지고 있는 랜선들의 길이를 담은 배열
		
		long start = 1;		// 시작값
		long end = 0;		// 끝값
		long mid = 0;		// 중간값
		long result = 0;		// 결과값
		long sum = 0;
		
		for(int i=0; i<K; i++) {
			arr[i] = sc.nextLong();
			if(arr[i] > end) {
				end = arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(end);
		
		while(start <= end) {
			mid = (start+end)/2;
			sum = 0;
			
			for(int i=0; i<K; i++) {
				sum += arr[i]/mid;
			}
			
			if(sum >= N){
                start = mid + 1;
                if(result < mid){
                    result = mid;
                }
            } else {
                end = mid-1;
            }
		}
		
		long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
		long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
		System.out.println("시간차이(m) : "+secDiffTime);
		
//		while(sum >= N) {
//			sum = 0;
//			
//			for(int i=0; i<K; i++) {
//				sum += arr[i]/result;
//			}
//			
//			if(sum == N) {
//				result += 1;
//			}else if(sum < N){
//				result -= 1;
//				break;
//			}
//		}
		
		System.out.println(result);
		
	}

}


