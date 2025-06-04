import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 2110A_FashionableArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            if((arr[0] + arr[n - 1]) % 2 == 0) {
                System.out.println(0);
                continue;
            }

            int removeFromFirstCnt = 1;
            int removeFromLastCnt = 1;

            for(int i = 1; i < n; i++) {
                if((arr[i] + arr[n - 1]) % 2 == 0) {
                    break;
                }
                removeFromFirstCnt++;
            }

            for(int i = n - 2; i >= 0; i--) {
                if((arr[0] + arr[i]) % 2 == 0) {
                    break;
                }
                removeFromLastCnt++;
            }

            System.out.println(Math.min(removeFromFirstCnt, removeFromLastCnt));

        }
    }
}
