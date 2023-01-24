package Algorithm_5;

import java.util.*;

public class Algorithm_5_07 {

	public static String solution(String need, String plan) {
		String answer = "YES";
		Queue<Character> q = new LinkedList<>();
		for(char c : need.toCharArray()) q.add(c);
		for(char c : plan.toCharArray()) {
			if(q.contains(c)) {
				if(c != q.peek()) return "NO";
				else q.poll();
			}
		}
		if(!q.isEmpty()) return "NO";
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String need = sc.next();
		String plan = sc.next();
		System.out.println(solution(need, plan));
	}

}
