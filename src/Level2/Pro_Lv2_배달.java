package Level2;
/**
 * @author HanHoon
 * @category 
 * 
 */
public class Pro_Lv2_배달 {
	public static void main(String[] args) {
		
	}
//	public static int answer = 0;
//	public static boolean[] ans, isVisited;
//	public static void backtracking(int pre, int k, int N, int[][] road, int K) {
//		if(k > K)
//			return;
//		
//        if(k <= K) {
//    		if(!ans[pre]) {
//				ans[pre] = true;
//				answer++;
//			}
//    	}
//        
//		for(int i=0; i < road.length; i++){
//        	int next = 0;
//        	
//			if(!isVisited[road[i][1]] && road[i][0] == pre){
//            	pre = road[i][0];
//            	next = road[i][1];
//            }else if(!isVisited[road[i][0]] && road[i][1] == pre){
//            	pre = road[i][1];
//            	next = road[i][0];
//            }else
//            	continue;
//			
//            isVisited[pre] = true;
//        	backtracking(next, road[i][2]+k, N, road, K);
//        	isVisited[pre] = false;
//        }
//	}
//    public int solution(int N, int[][] road, int K) {
//        ans = new boolean[N+1];
//        ans[0] = true;
//        ans[1] = true;
//        isVisited = new boolean[N+1];
//        isVisited[0] = true;
//        isVisited[1] = true;
//        answer++;
//        
//        for(int i=0; i < road.length; i++){
//        	int pre = 0;
//        	int next = 0;
//        	// 시작점이 1일때 backtracking 발생
//            if(road[i][0] == 1){
//            	pre = road[i][0];
//            	next = road[i][1];
//            }else if(road[i][1] == 1){
//            	pre = road[i][1];
//            	next = road[i][0];
//            }else
//            	continue;
//            
//            if(road[i][2] <= K) {
//        		if(!ans[next]) {
//    				ans[next] = true;
//    				answer++;
//    			}
//        	}
//        	backtracking(next, road[i][2], N, road, K);
//        }
//        return answer;
//    }
	public int solution(int N, int[][] road, int K) {
		int answer = 0;
		// Dijkstra : 시작정점에서 다른 모든 정점으로의 최단경로를 구하는 알고리즘
		int[][] map = new int[N + 1][N + 1];
		// 플로이드와샬
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				
			}
		}

		for (int i = 0; i < road.length; i++) {
			int pre = 0;
			int next = 0;
			// 시작점이 1일때 backtracking 발생
			if (road[i][0] == 1) {
				pre = road[i][0];
				next = road[i][1];
			} else if (road[i][1] == 1) {
				pre = road[i][1];
				next = road[i][0];
			} else
				continue;

			if (road[i][2] <= K) {
				if (!ans[next]) {
					ans[next] = true;
					answer++;
				}
			}
			backtracking(next, road[i][2], N, road, K);
		}
		return answer;
	}
}
