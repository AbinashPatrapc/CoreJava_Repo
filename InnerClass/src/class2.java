
public class class2 {

	public static void main(String[] args) {
		//Runnable r=new Runnable() {public void run() {System.out.println("Run Executing");}};
		Runnable r=()-> {System.out.println("Run Executing");};
        Thread t=new Thread(r);
        t.start();
	}

}
