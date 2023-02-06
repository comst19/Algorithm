package Algorithm_8;

import java.util.*;

class Point{
	public int x,y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class Algorithm_8_12 {
	
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	static int[][] map, dis;
	static int n, m;
	static Queue<Point> q = new LinkedList<>();

	public static void BFS() {
		while(!q.isEmpty()) {
			Point tmp = q.poll();
			for(int i=0; i<4; i++) {
				int nx = tmp.x+dx[i];
				int ny = tmp.y+dy[i];
				if(nx>=0 && nx < n && ny >= 0 && ny < m && map[nx][ny] == 0) {
					map[nx][ny] = 1;
					dis[nx][ny] = dis[tmp.x][tmp.y]+1;
					q.offer(new Point(nx,ny));
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		map = new int[n][m];
		dis = new int[n][m];
		for(int i=0; i<n;i++) {
			for(int j=0; j<m;j++) {
				map[i][j] = sc.nextInt();
				if(map[i][j] == 1) q.offer(new Point(i,j));
			}
		}
		BFS();
		boolean flag = true;
		int answer = Integer.MIN_VALUE;
		for(int i=0; i<n;i++) {
			for(int j=0; j<m; j++) {
				if(map[i][j] == 0) flag = false;
				answer = Math.max(answer, dis[i][j]);
			}
		}
		if(flag) System.out.println(answer);
		else System.out.println(-1);
	}

}
