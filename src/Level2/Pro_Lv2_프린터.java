package Level2;

import java.util.LinkedList;
import java.util.Queue;
/**
 * @author HanHoon
 * @category 스택/큐
 * https://programmers.co.kr/learn/courses/30/lessons/42587
 */
public class Pro_Lv2_프린터 {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{2,1,3,2}, 2));
		System.out.println(solution(new int[]{1,1,9,1,1,1}, 0));
	}
    public static int solution(int[] priorities, int location) {
        int answer = 0;
        // 일단 Queue 형태로 형변환 실시
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < priorities.length; i++)
            queue.offer(i);
        
        while(!queue.isEmpty()){
        	// 1. 인쇄 대기목록의 가장 앞에 있는 문서(J)를 대기목록에서 꺼냅니다.
            int J = queue.peek();
            // 2. J보다 중요도가 높은 문서가 있는지 판단
            boolean flag = false;
            
            for(int index : queue){
            	// 2-1. 나머지 인쇄 대기목록에서 J보다 중요도가 높은 문서가 한 개라도 존재하면
                if(priorities[J] < priorities[index]){
                    flag = true;
                    break;
                }
            }  
            // 2-2. J를 대기목록의 가장 마지막에 넣습니다.
            if(flag)
                queue.offer(queue.poll());
            // 3. 그렇지 않으면 J를 인쇄합니다.
            else{
                answer++;
                if(queue.poll() == location)
                    break;
            }
        }
        return answer;
    }
}
