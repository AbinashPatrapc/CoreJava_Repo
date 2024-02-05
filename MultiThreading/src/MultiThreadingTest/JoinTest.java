package MultiThreadingTest;

class MyThread extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Child Thread "+i);
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
public class JoinTest {

	public static void main(String[] args) throws InterruptedException {
		Thread t=Thread.currentThread();
		MyThread mt=new MyThread();
		mt.start();
        mt.join();
		for(int i=1;i<=10;i++) {
			System.out.println("Main Thread "+i);
			}
	}

}
