package MultiThreadingTest;

public class YieldTest {

	public static void main(String[] args) {
		MyThread01 mt=new MyThread01();
		mt.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main thread");
		}

	}

}

class MyThread01 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
		Thread.yield();
		}
	}
}
