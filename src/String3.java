import java.util.ArrayList;
import java.util.StringTokenizer;

public class String3 {
    public static void main(String[] args){
        ArrayList<String> token = new ArrayList<>();
        String url = "https://www.amazon.com/demo?test=abc";
        StringTokenizer st = new StringTokenizer(url,":// . / ? =");
        while (st.hasMoreTokens()) {
            token.add(st.nextToken());
        }
        System.out.println(token.toString());
    }
}
