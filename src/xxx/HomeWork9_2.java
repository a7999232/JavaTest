package xxx;

import java.io.PrintWriter;


class Account {
	private int account = 0; // 庫存量

	synchronized public void mom(int mom) {
		while (account >= 3000) {
			System.out.println("帳戶餘額3000以上，暫停匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		account += mom;
		System.out.println("產量：" + mom + "；庫存量：" + account);
		notify();
	}

	synchronized public void son(int son) {
		while (account < 1000) {
			System.out.println("帳戶餘額少於1000，暫停提款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		account -= son;
		System.out.println("消費量：" + son + "；庫存量" + account);
		if (account < 2000) {
			System.out.println("庫存量低，催促生產");
			notify();
		}
	}
}

class Producer extends Thread {
	Account depot;

	public Producer(Account depot) {
		this.depot = depot;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			depot.produce(4); // 每次生產4個
	}
}

class Consumer extends Thread {
	Account depot;

	public Consumer(Account depot) {
		this.depot = depot;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			depot.consume(3); // 每次消費3個
	}
}

public class HomeWork9_2 {
	public static void main(String[] args) {
		Account depot = new Account();
		Producer producer = new Producer(depot);
		Consumer consumer = new Consumer(depot);
		producer.start();
		consumer.start();
	}
}

