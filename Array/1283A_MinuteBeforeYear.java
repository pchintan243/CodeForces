import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 1283A_MinuteBeforeYear {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int hours = Integer.parseInt(st.nextToken());
            int minutes = Integer.parseInt(st.nextToken());
            int leftMins = 60 * (23 - hours);
            leftMins += (60 - minutes);
            System.out.println(leftMins);
        }
    }
}