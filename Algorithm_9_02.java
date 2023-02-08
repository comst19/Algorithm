package Algorithm_9;

import java.util.*;

class Times implements Comparable<Times>{
	public int st, et;
	Times(int st, int et){
		this.st = st;
		this.et = et;
	}
	@Override
	public int compareTo(Times o) {
		if(o.et == this.et) return this.st-o.st;
		return this.et - o.et;
	}
	
}

public class Algorithm_9_02 {

	public static int solution(ArrayList<Times> arr, int n) {
		int cnt = 0;
		Collections.sort(arr);
		int et = 0;
		for(Times ob : arr) {
			if(ob.st >= et) {
				cnt++;
				et = ob.et;
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Times> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int st = sc.nextInt();
			int et = sc.nextInt();
			arr.add(new Times(st,et));
		}
		System.out.println(solution(arr, n));
	}

}
