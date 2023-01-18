package Algorithm_4;

import java.util.*;

public class Algorithm_4_02 {

	public static String solution(String s1, String s2) {
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<>();
		for(char c : s1.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		for(char c : s2.toCharArray()) {
			if(!map.containsKey(c) || map.get(c) == 0) return "NO";
			map.put(c, map.get(c)-1);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		System.out.println(solution(a,b));
	}

}
