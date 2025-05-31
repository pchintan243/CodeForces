import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 50A_DominoPilling {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int ans = 0;

        if(m % 2 == 1 && n % 2 == 0) {
            int divisor = n / 2;
            ans += divisor * m;
        } else if(m % 2 == 1 && n % 2 == 1) {
            int divisor = m / 2;
            ans += divisor * n;
            ans += n / 2;
        } else {
            int divisor = m / 2;
            ans += divisor * n;
        }
        System.out.println(ans);
    }
}

// _ _ _
// _ _ _
// _ _ _
// _ _ _
// _ _ _
// _ _ _