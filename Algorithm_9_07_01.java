package Algorithm_9;

import java.util.*;

class Edge implements Comparable<Edge>{
	public int v1;
	public int v2;
	public int cost;
	Edge(int v1, int v2, int cost){
		this.v1 = v1;
		this.v2 = v2;
		this.cost = cost;
	}
	@Override
	public int compareTo(Edge o) {
		// TODO Auto-generated method stub
		return this.cost - o.cost;
	}
}

public class Algorithm_9_07_01 {

	static int[] unf;
	public static int Find(int v) {
		if(v==unf[v]) return unf[v];
		else return unf[v] = Find(unf[v]);
	}
	
	public static void Union(int a, int b) {
		int fa = Find(a);
		int fb = Find(b);
		if(fa!=fb) unf[fa] = fb;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		unf = new int[n+1];
		ArrayList<Edge> arr = new ArrayList<>();
		for(int i=1; i<=n; i++) unf[i] = i;
		for(int i=0; i<m; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int cost = sc.nextInt();
			arr.add(new Edge(v1, v2, cost));
		}
		int answer = 0;
		Collections.sort(arr);
		for(Edge e : arr) {
			int fv1 = Find(e.v1);
			int fv2 = Find(e.v2);
			if(fv1 != fv2) {
				answer = answer + e.cost;
				Union(e.v1,e.v2);
			}
		}
		
		System.out.println(answer);
	}

}
