package shun.fang.SE;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZipString {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(new Date()));
		System.out.println(sdf.parse("1993-04-13"));
	}

	/**
	 * 字符串原地压缩
	 * 
	 * @param str
	 * @return
	 */
	static String zipString(String str) {
		char[] strArr = str.toCharArray();
		List<Integer> index = new ArrayList<>();
		int length = strArr.length;
		for (int i = 0; i < length - 1; i++) {
			if (str.charAt(i) != str.charAt(i + 1)) {
				index.add(i);// 记录下标位置
			}
		}
		if (str.charAt(length - 2) != str.charAt(length - 1)) {
			index.add(length - 1);
		}
		
		StringBuilder sb = new StringBuilder();
		int start = 0;
		for (int i = 0; i < index.size(); i++) {
			int end = index.get(i) + 1;// 由于.substring(beginIndex,
										// endIndex)的包前不包后原则,所以下标需+1
			if (i != 0) {
				start = index.get(i - 1) + 1;// 由于.substring(beginIndex,
												// endIndex)的包前不包后原则,所以每次拼接的起始下标还是需要+1
			}
			String temp = str.substring(start, end);
			int num = end - start;
			if (num > 1) {// 判断如果字符个数等于1,则不拼接个数
				sb.append(temp.charAt(0)).append(num);
			} else {
				sb.append(temp.charAt(0));
			}
		}
		return sb.toString();
	}
}
