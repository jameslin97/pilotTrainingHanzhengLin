import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.*;
import java.util.stream.Collectors;

public class String4 {
    public static void main(String[] args){
        ArrayList<String> tokens = new ArrayList<>();
        String url = "https://www.amazon.com/demo?test=abc";
        StringTokenizer st = new StringTokenizer(url,":// . / ? =");
        while (st.hasMoreTokens()) {
            tokens.add(st.nextToken());
        }
        String joinedString = tokens.stream().collect(Collectors.joining(", ", "[", "]"));
        System.out.println(joinedString);
    }
}
