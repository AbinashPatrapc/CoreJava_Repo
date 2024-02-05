package MultiThreadingTest;

class MyThread1 extends Thread {
	public void run() {
		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Child Thread");
			}
              this.notify();
		}
	}
}

public class SyncBlock {

	public static void main(String[] args) throws InterruptedException {
		MyThread1 mt = new MyThread1();
		mt.start();
		synchronized (mt) {
			mt.wait();
			for (int i = 1; i <= 10; i++) {
				System.out.println("Main Thread");
			}
		
		}

	}

}
