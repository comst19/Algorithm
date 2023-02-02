package Algorithm_7;

import java.util.*;

public class Algorithm_7_12 {

	static int n,m;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch, dis;
	
	public static void BFS(int v) {
		Queue<Integer> Q = new LinkedList<>();
		ch[v] = 1;
		dis[v] = 0;
		Q.offer(v);
		while(!Q.isEmpty()) {
			int cv = Q.poll();
			for(int nv : graph.get(cv)) {
				if(ch[nv] == 0) {
					ch[nv] = 1;
					Q.offer(nv);
					dis[nv] = dis[cv]+1;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		ch = new int[n+1];
		dis = new int[n+1];
		for(int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b);
		}
		BFS(1);
		for(int i=2; i<=n; i++) {
			System.out.println(i + " : "+dis[i]);
		}
		
	}

}

/*
 * 입력 예제
 * 6 9
 * 1 3
 * 1 4
 * 2 1
 * 2 5
 * 3 4
 * 4 5
 * 4 6
 * 6 2
 * 6 5
 * 
 * 출력예제
 * 2 : 3
 * 3 : 1
 * 4 : 1
 * 5 : 2
 * 6 : 2
 * 
 * */

