package Algorithm_4;

import java.util.*;

public class Algorithm_4_04 {
	
	public static int solution(String S, String T) {
		int answer = 0;
		HashMap<Character, Integer> SM = new HashMap<>();
		HashMap<Character, Integer> TM = new HashMap<>();
		
		for(char c : T.toCharArray()) TM.put(c, TM.getOrDefault(c, 0)+1);
		for(int i = 0; i < T.length()-1; i++) SM.put(S.charAt(i), SM.getOrDefault(S.charAt(i), 0)+1);
		
		int lt = 0;
		for(int rt = T.length()-1; rt < S.length(); rt++) {
			SM.put(S.charAt(rt), SM.getOrDefault(S.charAt(rt), 0)+1);
			if(SM.equals(TM)) answer++;
			SM.put(S.charAt(lt), SM.get(S.charAt(lt))-1);
			if(SM.get(S.charAt(lt)) == 0) SM.remove(S.charAt(lt));
			lt++;
			
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		System.out.println(solution(S,T));

	}

}
