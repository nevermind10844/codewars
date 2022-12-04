public class Maskify {
	public static String maskify(String str) {
		String res = "";
		int len = str.length();
		String keep = "";
		if (len > 4) {
			keep = str.substring(len-4, len);
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i<len-4; i++)
				sb.append('#');
			res = sb.toString() + keep;
		} else
			res = str;

		return res;
	}
}