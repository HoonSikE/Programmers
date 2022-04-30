package Level1;

import java.util.HashMap;
/**
 * @author HanHoon
 * @category 코딩테스트 연습 > 해시
 * https://programmers.co.kr/learn/courses/30/lessons/42576
 */
public class Pro_Lv1_완주하지_못한_선수 {
	public static void main(String[] args){
		System.out.println(solution(new String[] {"leo", "kiki", "eden"}, new String[] {"eden", "kiki"}));
		System.out.println(solution(new String[] {"marina", "josipa", "nikola", "vinko", "filipa"}, new String[] {"josipa", "filipa", "marina", "nikola"}));
		System.out.println(solution(new String[] {"mislav", "stanko", "mislav", "ana"}, new String[] {"stanko", "ana", "mislav"}));
	}
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String key : participant)
            map.put(key, map.getOrDefault(key, 0) + 1);
        
        for(String key : completion)
            map.put(key, map.get(key) - 1);
        
        for(String key : map.keySet())
            if(map.get(key) != 0)
                answer = key;
        
        return answer;
    }
}
