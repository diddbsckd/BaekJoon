	package baekjoon;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class B10866 {

	public static void main(String[] args) {
		
		Deque<Integer> que = new ArrayDeque<>();
		
		StringBuilder stb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 0 ; i < N ; i++)
		{
			String order = sc.next();
			
			switch(order)
			{
				case  "push_front" :
					int num = sc.nextInt();
					que.addFirst(num);
					break;
					
				case "push_back" :
					num = sc.nextInt();
					que.addLast(num);
					break;
					
				case "pop_front" :
					if(que.size() != 0)
					{
						stb.append(que.pollFirst() + "\n");
					
					}else stb.append(-1+"\n");
					break;
					
				case "pop_back" :
					if(que.size() != 0)
					{
						stb.append(que.pollLast() + "\n");	
					}else stb.append(-1 + "\n");
					break;
					
				case "size" :
					stb.append(que.size() + "\n");
					break;
				
				case "empty" :
					if(que.size() != 0)stb.append(0 +"\n") ;
					else stb.append(1 +"\n");
					break;
							
				case "front" :
					if(que.size() != 0)
					{
						stb.append(que.peekFirst() + "\n");
					
					}else stb.append(-1 + "\n");
					break;
					
				case "back" :
					if(que.size() != 0)
					{
						stb.append(que.peekLast() +"\n");
					}else stb.append(-1 + "\n");
					break;
			}
			
		}
		System.out.println(stb);
		
	}

}
