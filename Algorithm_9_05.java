package Algorithm_9;

// 다익스트라 알고리즘, 가중치가 음수x
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

public class Algorithm_9_05 {

	static int n,m;
	static ArrayList<ArrayList<Edge>> graph;
	static int[] dis;
	
	public static void solution(int v) {
		PriorityQueue<Edge> pQ = new PriorityQueue<>();
		pQ.offer(new Edge(v,0));
		dis[v] = 0;
		while(!pQ.isEmpty()) {
			Edge tmp = pQ.poll();
			int now = tmp.vex;
			int nowCost = tmp.cost;
			if(nowCost>dis[now]) continue;
			for(Edge o : graph.get(now)) {
				if(dis[o.vex]>nowCost+o.cost) {
					dis[o.vex] = nowCost+o.cost;
					pQ.offer(new Edge(o.vex, nowCost+o.cost));
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		graph = new ArrayList<ArrayList<Edge>>();
		for(int i=0; i<=n; i++) graph.add(new ArrayList<Edge>());
		dis = new int[n+1];
		Arrays.fill(dis, Integer.MAX_VALUE);
		for(int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			graph.get(a).add(new Edge(b,c));
			
		}
		solution(1);
		for(int i=2; i<=n; i++) {
			if(dis[i]!=Integer.MAX_VALUE) System.out.println(i+" : "+dis[i]);
			else System.out.println(i+" : impossible");
		}
	}

}


//입력 예제
//6 9
//1 2 12
//1 3 4
//2 1 2
//2 3 5
//2 5 5
//3 4 5
//4 2 2
//4 5 5
//6 4 5
