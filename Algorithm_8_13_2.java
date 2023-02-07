package Algorithm_8;

import java.util.*;

class Point{
	public int x,y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class Algorithm_8_13_2 {

	static int n, answer;
	static int[][] map;
	static int[] dx = {-1,-1,-1,0,0,1,1,1};
	static int[] dy = {-1,0,1,-1,1,-1,0,1};
	static Queue<Point> q = new LinkedList<>();
	
	public static void BFS(int x, int y) {
		q.offer(new Point(x,y));
		while(!q.isEmpty()) {
			Point tmp = q.poll();
			for(int i=0; i<8; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				if(nx >= 0 && nx < n && ny >= 0 && ny < n && map[nx][ny] == 1) {
					q.offer(new Point(nx,ny));
					map[nx][ny] = 0;
				}
			}
		}
	}
	
	public static void solution() {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(map[i][j] == 1) {
					map[i][j] = 0;
					answer++;
					BFS(i,j);
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		map = new int[n][n];
		for(int i=0; i< n; i++) {
			for(int j=0; j<n; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		solution();
		System.out.println(answer);
	}

}
