package Algorithm_9;

import java.util.*;

class Edge implements Comparable<Edge>{
	public int vex, cost;
	Edge(int vex, int cost){
		this.vex = vex;
		this.cost = cost;
	}
	@Override
	public int compareTo(Edge o) {
		// TODO Auto-generated method stub
		return this.cost - o.cost;
	}
}

public class Algorithm_9_07_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<ArrayList<Edge>> graph = new ArrayList<ArrayList<Edge>>();
		for(int i=0; i<=n; i++ ) graph.add(new ArrayList<Edge>());
		
		int[] ch = new int[n+1];
		for(int i=0; i<m; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int cost = sc.nextInt();
			graph.get(v1).add(new Edge(v2,cost));
			graph.get(v2).add(new Edge(v1,cost));
		}
		int answer = 0;
		PriorityQueue<Edge> pQ = new PriorityQueue<>();
		pQ.offer(new Edge(1,0));
		while(!pQ.isEmpty()) {
			Edge temp = pQ.poll();
			int ev = temp.vex;
			if(ch[ev] == 0) {
				ch[ev] = 1;
				answer = answer + temp.cost;
				for(Edge e : graph.get(ev)) {
					if(ch[e.vex] == 0) pQ.offer(new Edge(e.vex, e.cost));
				}
			}
		}
		System.out.println(answer);
	}

}
