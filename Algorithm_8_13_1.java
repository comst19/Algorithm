package Algorithm_8;

import java.util.*;

public class Algorithm_8_13_1 {

	static int n, answer;
	static int[][] map;
	static int[] dx = {-1,-1,-1,0,0,1,1,1};
	static int[] dy = {-1,0,1,-1,1,-1,0,1};
	
	public static void DFS(int x, int y) {
		for(int i=0; i<8;i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(nx>=0 && nx < n && ny >= 0 && ny < n && map[nx][ny] == 1) {
				map[nx][ny] = 0;
				DFS(nx,ny);
			}
		}
	}
	
	public static void solution() {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(map[i][j] == 1) {
					answer++;
					map[i][j]=0;
					DFS(i,j);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		map = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		solution();
		System.out.println(answer);
	}

}
