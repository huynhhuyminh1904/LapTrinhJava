package communityuni.com;

public class Panlyndrome {

	/**
	 * Phương thức kiểm tra chuỗi đối xứng
	 * @param s Chuỗi cần kiểm tra
	 * @return true nếu đối xứng, false nếu không
	 */
	public static boolean checkPanlyndrome(String s) {
		try {
			for (int i = 0; i < s.length() / 2; i++) {
				if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
					return false;
				}
			}
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String test1 = "madam";
		String test2 = "radar";
		String test3 = "hello";

		System.out.println(test1 + " có phải Panlyndrome? " + checkPanlyndrome(test1));
		System.out.println(test2 + " có phải Panlyndrome? " + checkPanlyndrome(test2));
		System.out.println(test3 + " có phải Panlyndrome? " + checkPanlyndrome(test3));
	}
}