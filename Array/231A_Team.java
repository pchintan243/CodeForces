import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class 231A_Team {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int ans = 0;
        for(int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cnt = 0;
            for(int j = 0; j < 3; j++) {
                int num = Integer.parseInt(st.nextToken());
                if(num == 1) {
                    cnt++;
                }
            }
            if(cnt > 1) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}