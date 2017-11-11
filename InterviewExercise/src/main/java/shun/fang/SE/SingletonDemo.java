package shun.fang.SE;

public class SingletonDemo {

	public static void main(String[] args) {

		Singleton2 sl1 = Singleton2.getInstance();
		Singleton2 sl2 = Singleton2.getInstance();
		System.out.println(sl1 == sl2);
	}

}

/***
 * 饿汉式
 * 
 * @author function0413
 * 
 */
class Singleton1 {
	private static Singleton1 se = new Singleton1();//首先初始化一个对象
	private Singleton1() {// 构造方法私有化
	}
	public static Singleton1 getInstance() {
		return se;
	}
}
/***
 * 懒汉式
 * @author function0413
 *
 */
class Singleton2 {
	private static Singleton2 sl = null;

	private Singleton2() {// 构造方法私有化
	}
	public static Singleton2 getInstance() {
		if (sl==null) {
			sl=new Singleton2();//需要时才创建对象
		}
		return sl;
	}
}