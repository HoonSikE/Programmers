package Level1;

import java.util.Arrays;
/**
 * @author HanHoon
 * @category 코딩테스트 > 정렬
 * https://programmers.co.kr/learn/courses/30/lessons/42748
 */
public class Pro_Lv1_K번째수 {
	public static void main(String[] args){
		System.out.println(Arrays.toString(solution(new int[] {1,5,2,6,3,7,4}, new int[][] {{2,5,3},{4,4,1},{1,7,3}})));
	}
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0; i< commands.length; i++){
            int[] arr = new int[commands[i][1] - commands[i][0] + 1];
            for(int index = 0; index < arr.length; index++){
                arr[index] = array[index+commands[i][0]-1];
            }
            Arrays.sort(arr);
            answer[i] = arr[commands[i][2]-1];
        }

        return answer;
    }
}
