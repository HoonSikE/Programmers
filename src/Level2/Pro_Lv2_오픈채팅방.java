package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;
/**
 * @author HanHoon
 * @category 2019 KAKAO BLIND RECRUITMENT
 * https://programmers.co.kr/learn/courses/30/lessons/42888
 */
class User{
    String rec;
    String id;
	public User(String rec, String id) {
		this.rec = rec;
		this.id = id;
	}
}
public class Pro_Lv2_오픈채팅방 {
	public static void main(String[] args) {
		String[] record = {
				"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"
		};
		System.out.println(Arrays.toString(solution(record)));
	}
    public static String[] solution(String[] record) {
        String[] answer = {}; 
        ArrayList<User> list = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();
        StringTokenizer st = null;        
        for(int i = 0; i < record.length; i++){
            st = new StringTokenizer(record[i], " ");
            String rec = st.nextToken();
            String id = st.nextToken();
            // 바꾸는 경우는 저장하지 않음
            if(!rec.equals("Change"))
                list.add(new User(rec,id));

            if(rec.equals("Leave")) continue;  
            String nick = st.nextToken();
            // 사용자 정보 추가 및 수정
            // if(map.get(id) != null)
            if(map.containsKey(id))
                map.replace(id, nick);
            else
                map.put(id, nick);
        }
        answer = new String[list.size()];
        for(int i = 0; i < list.size(); i++){
            String nick = map.get(list.get(i).id);
            if(list.get(i).rec.equals("Enter"))
                answer[i] = nick + "님이 들어왔습니다.";    
            else if(list.get(i).rec.equals("Leave"))
                answer[i] = nick +  "님이 나갔습니다.";
        }
        return answer;
    }
}