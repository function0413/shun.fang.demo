package shun.fang.SE;

class Test{
	public static void main(String[] args) {
		new Thread(new DieLock(true)).start();
		new Thread(new DieLock(false)).start();
	}
}
public class DieLock implements Runnable {

	private boolean flag;

	public DieLock(boolean flag) {
		super();
		this.flag = flag;
	}

	@Override
	public void run() {
		if (flag) {
			synchronized (Lock.A) {
				System.out.println(Thread.currentThread().getName() + "......拿到了A锁");
				synchronized (Lock.B) {
					System.out.println(Thread.currentThread().getName() + "......拿到了B锁");
				}
			}
		}else{
			synchronized (Lock.B) {
				System.out.println(Thread.currentThread().getName() + "......拿到了B锁");
				synchronized (Lock.A) {
					System.out.println(Thread.currentThread().getName() + "......拿到了A锁");
				}
			}
		}

	}

}

class Lock {

	final static Object A = new Object();
	final static Object B = new Object();

}
