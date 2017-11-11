package shun.fang.SE.Multithread;

public class Multithreading {
	public static void main(String[] args) {
		User u = new User("小华", 1000);
		Thread t1 = new OperatorThread("A-------", u, 100);
		Thread t2 = new OperatorThread("B-------", u, -100);
		Thread t3 = new OperatorThread("C-------", u, 101);
		Thread t4 = new OperatorThread("D-------", u, 110);
		Thread t5 = new OperatorThread("E-------", u, 101);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

	}

	
}

class OperatorThread extends Thread {
	final static Object obj=new Object();
	private Integer y;
	private User u;

	public OperatorThread(String threadName, User u, Integer y) {
		super(threadName);
		this.y = y;
		this.u = u;
	}

	@Override
	public void run() {
		synchronized(obj){
			operation1(u, y);
		}
	}
	 static void operation1(User u, Integer y) {
		u.setCash(u.getCash() + y);
		System.out.println("线程" + Thread.currentThread().getName() + "运行结束,当前余额为:" + u.getCash());
	}

}

class User {
	private String name;
	private Integer cash;

	public User(String name, Integer cash) {
		super();
		this.name = name;
		this.cash = cash;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCash() {
		return cash;
	}

	public void setCash(Integer cash) {
		this.cash = cash;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", cash=" + cash + "]";
	}
}

class ThreadDemo extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("................................" + Thread.currentThread().getName());
		}
	}
}

class RunnableDemo implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("||||||||||||||||||||||||||||||||||||||||" + Thread.currentThread().getName());
		}

	}

}