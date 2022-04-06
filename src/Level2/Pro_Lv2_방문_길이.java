package Level2;

/**
 * @author HanHoon
 * @category Summer/Winter Coding(~2018)
 * https://programmers.co.kr/learn/courses/30/lessons/49994
 */
public class Pro_Lv2_방문_길이 {
	public static void main(String[] args) {
		System.out.println(solution("ULURRDLLU"));
		System.out.println(solution("LULLLLLLU"));
	}
    public static int solution(String dirs) {
        int answer = 0;
        // 선분을 구현하기 위해 4차원 배열 선언
        boolean[][][][] map = new boolean[11][11][11][11];
        // 상하좌우
        int[] dRow = { 1,-1, 0, 0};
        int[] dCol = { 0, 0,-1, 1};
        int index = -1;
        // 중심 지점 설정 (0,0)
        int nowY = 5;
        int nowX = 5;
        
        for(int n=0; n < dirs.length(); n++) {
        	// 상하좌우
            int tmp = dirs.charAt(n);
        	switch(tmp){
                case 'U':   index = 0;  break;
                case 'D':   index = 1;  break;
                case 'L':   index = 2;  break;
                case 'R':   index = 3;  break;
            }
            int nextY = nowY + dRow[index];
            int nextX = nowX + dCol[index];
            // 다음으로 이동할 값이 범위를 벗어나면 continue
            if(nextY < 0 || nextY >= 11 || nextX < 0 || nextX >= 11 )
                continue;
            // 해당 선분이 유효하다면 방문 체크 후 횟수 증가
            if(!map[nowY][nowX][nextY][nextX] && !map[nextY][nextX][nowY][nowX]){
                map[nowY][nowX][nextY][nextX] = true;
                map[nextY][nextX][nowY][nowX] = true;
                answer++;
            }
            // 현재 위치 최신화
            nowY = nextY;
            nowX = nextX;
        }
        return answer;
    }
}
