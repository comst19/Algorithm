package Algorithm_8;

import java.util.*;

public class Algorithm_8_09 {

	static int n, r;
	static int[] arr;
	
	public static void DFS(int L, int s) {
		if(L == r) {
			for(int x : arr) System.out.print(x + " ");
			System.out.println();
		}else {
			for(int i = s; i<=n; i++) {
				arr[L] = i;
				DFS(L+1, i+1);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		r = sc.nextInt();
		arr = new int[r];
		DFS(0,1);
	}

}
