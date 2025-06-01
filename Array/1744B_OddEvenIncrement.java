import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 1744B_OddEvenIncrement {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            long[] arr = new long[n];
            long sum = 0;
            int evenCnt = 0;
            int oddCnt = 0;
            for (int j = 0; j < n; j++) {
                arr[j] = Long.parseLong(st.nextToken());
                sum += arr[j];
                if ((arr[j] & 1) == 1) {
                    oddCnt++;
                } else {
                    evenCnt++;
                }
            }

            for (int j = 0; j < q; j++) {
                st = new StringTokenizer(br.readLine());
                int sign = Integer.parseInt(st.nextToken());
                int num = Integer.parseInt(st.nextToken());
                if (sign == 0) {
                    if (num % 2 == 0) {
                        sum += (num * evenCnt);
                    } else {
                        sum += (num * evenCnt);
                        oddCnt += evenCnt;
                        evenCnt = 0;
                    }
                } else {
                    if (num % 2 == 1) {
                        evenCnt += oddCnt;
                        sum += (num * oddCnt);
                        oddCnt = 0;
                    } else {
                        sum += (num * oddCnt);
                    }
                }

                System.out.println(sum);

            }

        }

    }
}