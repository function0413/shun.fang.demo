package shun.fang.SE.Multithread;

public class ProduceAndConsumeDemo {

	public static void main(String[] args) {
		Product pro = new Product();
		new Thread(new Produce(pro)).start();
		new Thread(new Consume(pro)).start();

	}

}

class Produce implements Runnable {
	private Product pro;

	public Produce(Product pro) {
		this.pro = pro;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (pro) {

				if (pro.p >= 50) {
					try {
						System.out.println("库存已满,请先消费>>>>>>>>>>>>>>>>");
						pro.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				pro.producing();
				pro.notify();
			}
		}
	}
}

class Consume implements Runnable {
	private Product pro;

	public Consume(Product pro) {
		super();
		this.pro = pro;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (pro) {
				if (pro.p <= 10) {
					try {
						System.out.println("库存不足,请等待生产..................");
						pro.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				pro.Consuming();
				pro.notify();
			}
		}
	}
}

class Product {
	int p;// 商品库存数量

	void producing() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		p++;
		System.out.println("生产者完成一个商品,仓库剩余" + p + "个商品");
	}

	void Consuming() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		p--;
		System.out.println("消费者取走一个商品,仓库剩余" + p + "个商品");
	}

}
