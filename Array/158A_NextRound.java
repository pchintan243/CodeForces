import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 158A_NextRound {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int ans = 1;
        st = new StringTokenizer(br.readLine());
        int score = Integer.parseInt(st.nextToken());
        if(score == 0) {
            System.out.println(0);
            return;
        }
        int prev = -1;
        for(int i = 1; i < n; i++) {
            prev = score;
            score = Integer.parseInt(st.nextToken());
            if(score == 0) {
                break;
            }
            if(i >= k) {
                if(score != prev) {
                    break;
                }
            }
                ans++;
        }
        System.out.println(ans);
    }
}