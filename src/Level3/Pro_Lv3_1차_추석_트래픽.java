package Level3;

import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 2018 KAKAO BLIND RECRUITMENT
 * https://programmers.co.kr/learn/courses/30/lessons/17676
 */
class Date{
    int year;
    int month;
    int day;
    int hour;
    int min;
    double sec;
    double T;
    
	public Date(int year, int month, int day, int hour, int min, double sec, double t) {
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.min = min;
		this.sec = sec;
		T = t;
	}
}
public class Pro_Lv3_1차_추석_트래픽 {
	public static void main(String[] args) {
		
	}
    public int solution(String[] lines) {
        int answer = 0;
        
        for (int i = 0; i < lines.length; i++) {
        	StringTokenizer st = new StringTokenizer(lines[i], "-:. s");
    	    int year = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int day = Integer.parseInt(st.nextToken());
            int hour = Integer.parseInt(st.nextToken());
            int min = Integer.parseInt(st.nextToken());
            double sec = Double.parseDouble(st.nextToken());
            double T = Double.parseDouble(st.nextToken());
            
            Date date = new Date(year, month, day, hour, min, sec, T);
            System.out.println(date.toString());
		}
        return answer;
    }
}
