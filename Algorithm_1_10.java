package Algorithm_1;

import java.util.*;

public class Algorithm_1_10 {

	public static int[] solution(String str, char t) {
		
		int[] answer = new int[str.length()];
		int p = str.length()+1;
		for(int i=0 ; i<str.length(); i++) {
			if(str.charAt(i) == t) {
				p = 0;
				answer[i] = p;
			}else {
				p++;
				answer[i] = p;
			}
		}
		p = str.length()+1;
		for(int i = str.length() - 1; i >= 0 ; i--) {
			if(str.charAt(i) == t) {
				p = 0;
				answer[i] = p;
			}else {
				p++;
				answer[i] = Math.min(answer[i], p);
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char t = sc.next().charAt(0);
		for(int x : solution(str, t)) {
			System.out.print(x+" ");
		}
	}

}
