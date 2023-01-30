package Algorithm_7;

import java.util.*;

public class Algorithm_7_04 {
	
	static int[] fibo;
	
	// 메모이제이션을 사용하여 시간 절약
	public static int Fibonacci(int n) {
		if(fibo[n] > 0) return fibo[n];
		if(n==1) return fibo[n] = 1;
		else if(n==2) return fibo[n] = 1;
		else {
			return fibo[n] = Fibonacci(n-2) + Fibonacci(n-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fibo = new int[n+1];
		System.out.println(Fibonacci(n));
	}

}
