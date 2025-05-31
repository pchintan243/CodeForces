import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 4AWaterMelon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        if(n % 2 != 0 || n < 4) {
            System.out.println("NO");
            return;
        }
        boolean flag = true;
        int start = 2;
        while(start < n) {
            int sec = n - start;

            if(sec % 2 == 0) {
                flag = true;
            } else {
                flag = false;
                start += 2;
            }

            if(flag) {
                break;
            }
        }
        System.out.println(flag ? "YES" : "NO");

    }

}