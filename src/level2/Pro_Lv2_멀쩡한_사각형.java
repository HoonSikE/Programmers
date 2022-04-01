package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Pro_Lv2_멀쩡한_사각형 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int w = Integer.parseInt(br.readLine());
		int h = Integer.parseInt(br.readLine());
		
        int gcd = BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).intValue();
        long answer = (long)w*(long)h-((long)w/gcd + (long)h/gcd -1) *gcd;
        System.out.println(answer);
	}
}
