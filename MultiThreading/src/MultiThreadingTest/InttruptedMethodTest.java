package MultiThreadingTest;

public class InttruptedMethodTest {
	public static void main(String[] args) {
      MyThread02 mt=new MyThread02();
      mt.start();
      mt.interrupt();
      System.out.println("Main Ended");
	}
}

class MyThread02 extends Thread {
	public void run() {
	try {
	for(int i=0;i<10;i++) {
		System.out.println("Child Thread");
		Thread.sleep(1000);
	}
}catch(InterruptedException e) {
	System.out.println("I got Interrupted");
  }
	}
}