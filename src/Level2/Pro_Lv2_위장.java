package Level2;

import java.util.*;
/**
 * @author HanHoon
 * @category 코딩테스트 연습 > 해시
 * https://programmers.co.kr/learn/courses/30/lessons/42578
 */
public class Pro_Lv2_위장 {
	public static void main(String[] args) {
		System.out.println(solution(new String[] {"119", "97674223", "1195524421"}));
		System.out.println(solution(new String[] {"123","456","789"}));
		System.out.println(solution(new String[] {"12","123","1235","567","88"}));
	}
    public static boolean solution(String[] phone_book) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<phone_book.length; i++)
            map.put(phone_book[i], i);
        
        for(int i=0; i<phone_book.length; i++)
            for(int j=0; j<phone_book[i].length(); j++)
                if(map.containsKey(phone_book[i].substring(0, j)))
                    return false;
        
        return true;
    }
}
