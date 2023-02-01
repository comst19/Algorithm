package Algorithm_7;

import java.util.*;

public class Algorithm_7_08 {

	public static int BFS(int s, int e) {
		int answer = 0;
		int[] dis = {1,-1,5};
		int[] ch = new int[10001];
		Queue<Integer> Q = new LinkedList<>();
		ch[s] = 1;
		Q.offer(s);
		while(!Q.isEmpty()) {
			int len = Q.size();
			for(int i=0; i<len; i++) {
				int x = Q.poll();
				for(int j = 0; j <3; j++) {
					int nx = x+dis[j];
					if(nx == e) return answer+1;
					if(nx>=1 && nx<= 10000 && ch[nx] == 0) {
						ch[nx] = 1;
						Q.offer(nx);
					}
				}
			}
			answer++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		System.out.println(BFS(s,e));
	}

}
