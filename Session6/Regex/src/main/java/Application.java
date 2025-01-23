import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {
    public static void main(String[] args) {
        Pattern numberPattern = Pattern.compile("^B[0-9]+[A-Z]+[a-z]+");
        Matcher numberMatcher = numberPattern.matcher("B123At");
        boolean numberIncluded = numberMatcher.find();
        System.out.println(numberIncluded);

        Pattern p = Pattern.compile("Servus$");
        Matcher m = p.matcher("Banana Servus");
        boolean endWithServus = m.find();
        System.out.println(endWithServus);

        String[] splitText = "Hello programmers".split("llo|amm");
        for(String s : splitText) {
            System.out.println(s);
        }
    }
}
