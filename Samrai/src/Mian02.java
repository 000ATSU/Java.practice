import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mian02 {
	public static void main(String[] args) {
		String str = "SAMURAI123";
		Pattern p = Pattern.compile("^[0-9a-zA-Z]+$");
		Matcher m = p.matcher(str);

		System.out.println(m.find());
	}
}
