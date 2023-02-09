package Algorithm_9;

import java.util.*;

class Lectures implements Comparable<Lectures>{
	public int money, day;
	
	public Lectures(int money, int day) {
		this.money = money;
		this.day = day;
	}
	@Override
	public int compareTo(Lectures o) {
		return o.day-this.day;
	}
	
}

public class Algorithm_9_04 {

	static int n, max = Integer.MIN_VALUE;
	
	public static int solution(ArrayList<Lectures> arr) {
		int answer = 0;
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
		Collections.sort(arr);
		int j = 0;
		for(int i=max; i>=1; i--) {
			for(; j<n; j++) {
				if(arr.get(j).day<i) break;
				pQ.offer(arr.get(j).money);
			}
			if(!pQ.isEmpty()) answer = answer + pQ.poll();
			
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		ArrayList<Lectures> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int m = sc.nextInt();
			int d = sc.nextInt();
			arr.add(new Lectures(m,d));
			if(d>max) max = d;
		}
		System.out.println(solution(arr));
	}

}
