package Algorithm_7;

public class Algorithm_7_06 {
	
	static int n;
	static int[] ch;
	public void DFS(int L) {
		if(L==n+1) {
			String answer="";
			for(int i=1; i<=n; i++) {
				if(ch[i] == 1) answer+=(i+" ");
			}
			if(answer.length() > 0) System.out.println(answer);
		}
		else {
			ch[L] = 1;
			DFS(L+1);
			ch[L] = 0;
			DFS(L+1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Algorithm_7_06 T = new Algorithm_7_06();
		n = 3;
		ch = new int[n+1];
		T.DFS(1);
	}

}
