package Algorithm_7;

import java.util.*;

public class Algorithm_7_01 {
	
	public static void DFS(int n) {
		
		if(n==0) return;
		else {
			DFS(n-1);
			System.out.print(n+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		DFS(n);
	}

}
