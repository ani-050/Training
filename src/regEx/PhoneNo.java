package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNo {
	
	public static void main(String[] args) {
		String regex="\\d{3}[-.\\s]?\\d{3}[-.\\s]?\\d{4}";
		String text="call me at 111 222 3333 or 222-333-4444 or 333.444.5555";
		
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(text);
		
		while(matcher.find()) {
			String s=matcher.group();
			System.out.println(s);
		}
	}

}
