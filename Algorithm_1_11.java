package Algorithm_1;

import java.util.*;

public class Algorithm_1_11 {

	public static String solution(String str) {
		String answer = "";
		str = str + " ";
		int cnt = 1;
		for(int i=0; i<str.length()-1;i++) {
			if(str.charAt(i) == str.charAt(i+1))
				cnt++;
			else{
				answer+=str.charAt(i);
				if(cnt > 1) answer += String.valueOf(cnt);
				cnt=1;
			}
			
		}
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}

}
