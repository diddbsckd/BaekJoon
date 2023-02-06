package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class B1406_에디터3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String word = br.readLine();
		
		List<String> wordL = new LinkedList<String>(Arrays.asList(word.split("")));
		
		ListIterator<String> wordI = wordL.listIterator(wordL.size());
		
		int M = Integer.parseInt(br.readLine());
		
		for(int i=0; i<M; i++) {
			
			String command = br.readLine();
			
			switch(command) {
				case "L" :
					if(wordI.hasPrevious()) {
						wordI.previous();
					}
				case "D" :
					if(wordI.hasNext()) {
						wordI.next();
					}
				case "B" :
					if(wordI.hasPrevious()) {
						wordI.previous();
						wordI.remove();
					}
//				case "P" :
//					wordI.add(command[command.length-1]);
			}
		}
		
		for(String a : wordL) {
			sb.append(a);
		}
		System.out.println(sb);
		bw.flush();
		bw.close();
		br.close();
		
	}

}

