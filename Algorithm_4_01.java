package Algorithm_4;

import java.util.*;

public class Algorithm_4_01 {
	
	public static char solution(int n, String str) {
		char answer = ' ';
		int max = Integer.MIN_VALUE;
		HashMap<Character, Integer> map = new HashMap<>();
		for(char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c,0)+1);
		}
		for(char key : map.keySet()) {
			if(map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		System.out.println(solution(n,str));
	}

}
