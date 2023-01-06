package Algorithm_1;

import java.util.*;

public class Algorithm_1_08 {

	public static String solution(String str) {
		String answer = "NO";
		str = str.toUpperCase().replaceAll("[^A-Z]","");
		String tmp = new StringBuilder(str).reverse().toString();
		if (str.equals(tmp)) answer = "YES";
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(solution(str));
	}

}
