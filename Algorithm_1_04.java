package Algorithm_1;

import java.util.*;

public class Algorithm_1_04 {

	public static ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer = new ArrayList<>();
		for(String s : str) {
			String tmp = new StringBuilder(s).reverse().toString();
			answer.add(tmp);
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		for(int i=0; i<n;i++) {
			str[i] = sc.next();
		}
		for(String s : solution(n, str)) {
			System.out.println(s);
		}
	}

}
