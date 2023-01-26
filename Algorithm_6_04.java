package Algorithm_6;

import java.util.Scanner;

public class Algorithm_6_04 {
	
	public static int[] solution(int size, int n, int[] arr) {
		int[] cache = new int[size];
		for(int x : arr) {
			int pos = -1;
			for(int i=0; i<size; i++) if(x == cache[i]) pos = i;
			if(pos == -1) {
				for(int j = size-1; j>=1; j--) {
					cache[j] = cache[j-1];
				}
				cache[0] = x;
			}else {
				for(int j = pos; j >=1; j--) {
					cache[j] = cache[j-1];
				}
				cache[0] = x;
			}
			
			
		}
		return cache;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] arr = new int[b];
		for(int i=0; i<b; i++) {
			arr[i] = sc.nextInt();
		}
		for(int x : solution(a,b,arr)) System.out.print(x+" ");
	}

}
