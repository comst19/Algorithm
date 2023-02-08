package Algorithm_9;

import java.util.*;

class Time implements Comparable<Time>{
	public int time;
	public char state;
	Time(int time, char state){
		this.time = time;
		this.state = state;
	}
	
	@Override
	public int compareTo(Time o) {
		if(o.time == this.time) return this.state - o.state;
		return this.time - o.time;
	}
	
}

public class Algorithm_9_03 {
	
	public static int solution(ArrayList<Time> arr) {
		int answer = Integer.MIN_VALUE;
		Collections.sort(arr);
		int cnt = 0;
		for(Time ob : arr) {
			if(ob.state == 'S') cnt++;
			else cnt--;
			answer = Math.max(answer, cnt);
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Time> arr = new ArrayList<>();
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			arr.add(new Time(s, 'S'));
			arr.add(new Time(e, 'E'));
		}
		System.out.println(solution(arr));
	}

}
