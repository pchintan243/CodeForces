import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class 71A_WayToLondWords {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
 
        int t = Integer.parseInt(br.readLine());
 
        while(t-- > 0) {
            String s = br.readLine();
 
            if (s.length() > 10) {
                System.out.println(s.charAt(0) + "" + (s.length() - 2) + s.charAt(s.length() - 1));
            } else {
                System.out.println(s);
            }
        }
    }
}