package Algorithm_7;

import java.util.*;

public class Algorithm_7_02 {
	
	// Decimal to Binary 
	public static void DTB(int n) {
		if(n==0) return;
		else {
			DTB(n/2);
			System.out.print(n%2 + " ");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		DTB(n);
	}

}
