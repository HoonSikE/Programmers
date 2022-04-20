package Level2;

/**
 * @author HanHoon
 * @category 연습문제
 * https://programmers.co.kr/learn/courses/30/lessons/12899
 */
public class Pro_Lv2_124_나라의_숫자 {
	public static void main(String[] args){
		System.out.println(solution(1));
		System.out.println(solution(2));
		System.out.println(solution(3));
		System.out.println(solution(4));
	}
    public static String solution(int n){
        String answer = "";
        String[] num = {"4", "1", "2"};
        while(n >0) {
        	answer = num[n%3] + answer;
        	n = (n-1)/3;
        }
        return answer;
    }
}
