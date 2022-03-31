package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro_Lv2_124_나라의_숫자 {
	public static void main(String[] args) throws IOException {
		String answer = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

/*        while(n > 0){
            if(n%3 == 1)
                answer = "1" + answer;
            else if(n%3 == 2)
                answer = "2" + answer;
            else if(n%3 == 0)
                answer = "4" + answer;
            n--;
            n /= 3;
        }*/
        String[] num = {"4", "1", "2"};
        
        while(n >0) {
        	answer = num[n%3] + answer;
        	n = (n-1)/3;
        }
        
        System.out.println(answer);
	}
}
