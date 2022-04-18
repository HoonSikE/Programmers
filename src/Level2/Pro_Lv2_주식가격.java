package Level2;

import java.util.Arrays;
import java.util.Stack;

public class Pro_Lv2_주식가격 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[]{1,2,3,2,3})));
	}
    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < prices.length; i++){
            // 다음값이 작다면
            while(!stack.isEmpty() && prices[i] < prices[stack.peek()]){
            	answer[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        while(!stack.isEmpty()) {
        	answer[stack.peek()] = prices.length - stack.peek() - 1;
        	stack.pop();
        }
        return answer;
    }
}
