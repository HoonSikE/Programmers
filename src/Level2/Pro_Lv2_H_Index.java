package Level2;

import java.util.Arrays;
import java.util.Comparator;
/**
 * @author HanHoon
 * @category 코딩테스트 연습 > 정렬
 * https://programmers.co.kr/learn/courses/30/lessons/42747
 */
public class Pro_Lv2_H_Index {
	public static void main(String[] args) {
		System.out.println(solution(new int[] {3,0,6,1,5}));
	}
    public static int solution(int[] citations) {
        Arrays.sort(citations);
        int answer = 0;
        for(int i=0; i<citations.length; i++){
            int min = Math.min(citations[i], citations.length-i);
            answer = Math.max(answer, min);
        }
        return answer;
    }
}
