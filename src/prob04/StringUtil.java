package prob04;

public class StringUtil {
	static String s = "";
	
	StringUtil() {}
	
	public static String concatenate(String[] s_arr) {
		for(int i = 0; i < s_arr.length; i++) {
			s = s + s_arr[i];
		}
		return s;
	}
}
