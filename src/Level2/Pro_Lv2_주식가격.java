package Level2;

import java.util.Arrays;
import java.util.Stack;
/**
 * @author HanHoon
 * @category 스택/큐
 * https://programmers.co.kr/learn/courses/30/lessons/42584
 */
public class Pro_Lv2_주식가격 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[]{1,2,3,2,3})));
	}
    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        // 주의할점!! 값으로 다루지 말고 index값으로 시도하자.
        for(int index = 0; index < prices.length; index++){
        	// stack이 비어있다면 그냥 넣어주고
            // stack에 값이 있고, 다음값이 작다면 이때까지 가격이 떨어지지 않은 기간은 몇 초인지 answer에 입력
            while(!stack.isEmpty() && prices[index] < prices[stack.peek()]){
            	answer[stack.peek()] = index - stack.peek();
                stack.pop();
            }
            stack.push(index);
        }
        // 종료시점까지 가격이 떨어지지 않은 주식의 answer값 입력
        while(!stack.isEmpty()) {
        	answer[stack.peek()] = prices.length - stack.peek() - 1;
        	stack.pop();
        }
        return answer;
    }
}
