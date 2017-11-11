package shun.fang.SE;

import org.junit.Test;
/**
 * 输出九九乘法表
 * @author function0413
 *
 */
public class Jiujiu {
	@Test
	public void jiujiu() {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < i+1; j++) {
				System.out.print(i + "X" + j + "=" + i * j+"   ");
			}
			System.out.println();
		}
	}
}
