package shun.fang.SE.Multithread;

import org.junit.Test;

public class ThreadAndRunable {
	public static void main(String[] args) {
		RunableDemo rd=new RunableDemo();
		Thread tr1=new Thread(rd, "一号..........");
		Thread tr2=new Thread(rd, "二号..........");
		Thread tr3=new Thread(rd, "三号..........");
		tr1.start();
		tr2.start();
		tr3.start();
	}
	
}

class RunableDemo implements Runnable {
	private int t = 10;

	@Override
	public void run() {
		synchronized (this) {
			
			while (t > 0) {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"剩余" + t--);
			}
		}
	}
}

class Thread1Demo extends Thread {
	private int t = 10;

	@Override
	public void run() {
		while (t > 0) {
			System.out.println(this.getName()+"剩余" + t--);
		}
	}

}