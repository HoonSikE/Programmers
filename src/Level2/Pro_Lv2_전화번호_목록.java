package Level2;

import java.util.*;
/**
 * @author HanHoon
 * @category 코딩테스트 연습 > 해시
 * https://programmers.co.kr/learn/courses/30/lessons/42577
 */
public class Pro_Lv2_전화번호_목록 {
	public static void main(String[] args) {
		System.out.println(solution(new String[][] {{"yellowhat", "headgear"},{"bluesunglasses", "eyewear"},{"green_turban", "headgear"}}));
		System.out.println(solution(new String[][] {{"crowmask", "face"},{"bluesunglasses", "face"},{"smoky_makeup", "face"}}));
	}
    public static int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String,Integer> map = new HashMap<>();
        
        for(int i=0; i<clothes.length; i++)
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        
        for(String key : map.keySet())
            answer *= map.get(key) + 1;     

        return answer-1;
    }
}
