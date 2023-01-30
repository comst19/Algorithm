package Algorithm_7;

import java.util.*;

public class Algorithm_7_03 {
	
	public static int Factorial(int n) {
		if(n==1 || n == 0) return 1;
		else {
			return n*Factorial(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Factorial(n));
	}

}
