package Algorithm_5;

import java.util.*;

class Person{
	int id;
	int priority;
	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
}

public class Algorithm_5_08 {
	
	public static int solution(int n, int m, int[] nums) {
		int answer = 0;
		Queue<Person> q = new LinkedList<>();
		for(int i = 0; i < n; i++) {
			q.offer(new Person(i,nums[i]));
		}
		while(!q.isEmpty()) {
			Person tmp = q.poll();
			for(Person p : q) {
				if(p.priority > tmp.priority) {
					q.offer(tmp);
					tmp = null;
					break;
				}
			}if(tmp!=null) {
				answer++;
				if(tmp.id == m) return answer;
			}
			
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] nums = new int[n];
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println(solution(n,m,nums));
	}
	
	

}
