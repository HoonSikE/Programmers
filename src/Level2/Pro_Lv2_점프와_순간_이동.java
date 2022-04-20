package Level2;
/**
 * @author HanHoon
 * @category Summer/Winter Coding(~2018)
 * https://programmers.co.kr/learn/courses/30/lessons/12980
 */
public class Pro_Lv2_점프와_순간_이동 {
	public static void main(String[] args) {
		System.out.println(solution(5));
		System.out.println(solution(6));
		System.out.println(solution(5000));
	}
    public static int solution(int n) {
        int ans = 0;
        while(n >= 1){
            if(n%2 == 1){
                n -= 1;
                ans++;
            }else
                n /= 2;
        }
        return ans;
    }
}
