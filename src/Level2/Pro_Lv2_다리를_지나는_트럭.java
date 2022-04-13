package Level2;

import java.util.LinkedList;
import java.util.Queue;
/**
 * @author HanHoon
 * 
 * https://programmers.co.kr/learn/courses/30/lessons/42583
 */
public class Pro_Lv2_다리를_지나는_트럭 {
	public static void main(String[] args) {
		System.out.println(solution(2, 10, new int[]{7,4,5,6}));
		System.out.println(solution(100, 100, new int[]{10}));
		System.out.println(solution(100, 100, new int[]{10,10,10,10,10,10,10,10,10,10}));
	}
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        // bridge_length : 다리에 올라갈 수 있는 최대 트럭 수
        // weight : 다리가 버틸 수 있는 무게
        Queue<Integer> queue = new LinkedList<>();
        // 다리에 가해진 중량
        int max = 0;
        for (Integer truck : truck_weights) {
        	while(true) {
        		if(queue.isEmpty()) {
        			queue.offer(truck);
                    max += truck;
                    answer++;
                    break;
        		}else if(queue.size() == bridge_length)
        			max -= queue.poll();
        		else {
        			// 트럭이 올라갔을 때 중량을 초과
        			if(max + truck> weight){
        				queue.offer(0);
        				answer++;
        			}else {
            			queue.offer(truck);
                        max += truck;
                        answer++;
                        break;
        			}
        		}
        	}
        }
        
        return answer + bridge_length;
    }
}
