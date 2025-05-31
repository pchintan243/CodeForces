import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 282A_Bit++ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int ans = 0;
        for(int i = 0; i < t; i++) {
            String s = br.readLine();
            if(s.charAt(1) == '+') {
                ans++;
            } else {
                ans--;
            }
        }
        System.out.println(ans);
    }
}