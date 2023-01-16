package Algorithm_2;

import java.util.Scanner;

public class Algorithm_2_03 {
	
	public static String solution(int n, int[] A, int[] B) {
		String answer = "";
		for(int i = 0; i < n ; i++) {
			if(A[i] == B[i]) answer+='D';
			else if(A[i] == 1 && B[i] == 3) answer+="A";
			else if(A[i] == 2 && B[i] == 1) answer+="A";
			else if(A[i] == 3 && B[i] == 2) answer+="A";
			else answer+="B";
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		int[] B = new int[n];
		for(int i=0; i<n; i++) {
			A[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			B[i] = sc.nextInt();
		}
		for(char r : solution(n, A, B).toCharArray()) {
			System.out.println(r);
		}
		
	}

}
