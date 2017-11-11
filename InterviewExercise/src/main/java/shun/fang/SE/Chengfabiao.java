package shun.fang.SE;
/**
 * 打印九九乘法表
 * @author function0413
 *
 */
public class Chengfabiao {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				if (i * j > 9) {
					System.out.print(j + "*" + i + "=" + i * j + "  ");
				} else {
					System.out.print(j + "*" + i + "=" + i * j + "   ");
				}
			}
			System.out.println();
		}
	}
}
