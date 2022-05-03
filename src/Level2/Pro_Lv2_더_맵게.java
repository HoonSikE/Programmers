package Level2;

import java.util.*;
/**
 * @author HanHoon
 * @category 코딩테스트 연습 > 힙(Heap)
 * https://programmers.co.kr/learn/courses/30/lessons/42626
 */
public class Pro_Lv2_더_맵게 {
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1, 2, 3, 9, 10, 12}, 7));
	}
    public static int solution(int[] scoville, int K) {
        int answer = 0;
        int sco = 0;
        PriorityQueue<Integer> heap = new PriorityQueue();
        
        for(int a : scoville)
            heap.offer(a);
        
        while(heap.peek() <= K) {
            if(heap.size() == 1){
                return -1;
            }
            int a = heap.poll();
            int b = heap.poll();
            int result = a + (b*2);
            heap.offer(result);
            answer++;
        }
        return answer;
    }
}
