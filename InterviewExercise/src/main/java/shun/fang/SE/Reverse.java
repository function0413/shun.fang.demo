package shun.fang.SE;

import java.util.Stack;

/***
 * 七种方法反转字符串
 * 
 * @author function0413
 * 
 */
public class Reverse {
	public static void main(String[] args) {
		System.out.println(reverse5("门前大桥下,游过一群鸭"));
	}

	static String reverse1(String str) {
		int lenth = str.length();

		if (lenth <= 1) {
			return str;
		} else {
			String left = str.substring(0, lenth / 2);
			String right = str.substring(lenth / 2, lenth);
			return reverse1(right) + reverse1(left);
		}

	}

	static String reverse2(String str) {
		char[] strArr = str.toCharArray();
		String newStr = "";
		for (int i = 0; i < strArr.length; i++) {
			newStr = strArr[i] + newStr;
		}
		return newStr;

	}

	static String reverse3(String str) {
		char[] strArr = str.toCharArray();
		String newStr = "";
		for (int i = strArr.length - 1; i >= 0; i--) {
			newStr += strArr[i];
		}
		return newStr;

	}

	static String reverse4(String str) {
		return new StringBuffer(str).reverse().toString();
	}

	static String reverse5(String str) {
		int length = str.length();
        char [] array = str.toCharArray();
        for(int i = 0;i<length/2;i++){
            array[i] = str.charAt(length-1-i);
            array[length-1-i] = str.charAt(i);
        }
        return new String(array);
	}

	/**
	 * 按位异或法
	 * 
	 * @param s
	 * @return
	 */
	public static String reverse6(String str) {
		char[] s = str.toCharArray();
		int begin = 0;
		int end = s.length - 1;
		while (end > begin) {
			s[begin] = (char) (s[begin] ^ s[end]);
			s[end] = (char) (s[end] ^ s[begin]);
			s[begin] = (char) (s[end] ^ s[begin]);
			begin++;
			end--;

		}
		return new String(s).toString();

	}

	/**
	 * 栈有"后进先出(LIFO)"的特点,这一特点刚好用于反转字符串。
	 * 具体思路是: 将字符串转换为char数组 将char数组中的字符依次压入栈中 将栈中的字符依次弹出赋值给char数组
	 * @param str
	 * @return
	 */
	public static String reverse7(String str) {
		char[] s = str.toCharArray();
		Stack<Character> st = new Stack<>();
		String newS = "";
		for (int i = 0; i < s.length; i++) {
			st.push(s[i]);
		}
		for (int i = 0; i < s.length; i++) {
			newS += st.pop();
		}
		return newS;
	}

}
