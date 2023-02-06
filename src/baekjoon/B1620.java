package baekjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B1620 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> hm = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		int S = sc.nextInt();
		
		for(int i = 1; i<=N; i++) {
			hm.put(i+"", sc.next());
		}
		
		for(int i = 0; i<S; i++) {
			String temp = sc.next();
			
			if(hm.get(temp) == null)
			{
				for(Map.Entry<String, String> entry : hm.entrySet())
				{
					String key = entry.getKey();
					String value = entry.getValue();
					if(value.equals(temp)) sb.append(key + "\n");
				}
				
			}else
			{
				sb.append(hm.get(temp + "\n"));
			}
			
		}
		System.out.println(sb);
	}

}
