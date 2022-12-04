import java.util.regex.Pattern;

public class Solution {

	public static boolean validatePin(String pin) {
		return Pattern.matches("\\d{4}|\\d{6}", pin);
	}

}