package Level2;

import java.math.BigInteger;
/**
 * @author HanHoon
 * @category Summer/Winter Coding(2019)
 * https://programmers.co.kr/learn/courses/30/lessons/62048
 */
public class Pro_Lv2_멀쩡한_사각형 {
	public static void main(String[] args){

	}
    public long solution(int w, int h) {
        int gcd = BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).intValue();
        long answer = (long)w*(long)h-((long)w/gcd + (long)h/gcd -1) *gcd;
        return answer;
    }
}
