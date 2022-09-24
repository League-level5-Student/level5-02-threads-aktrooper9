package _03_Threaded_Greeting;

public class ThreadedGreeter implements Runnable {
int num=0;
	public ThreadedGreeter(int i) {
		// TODO Auto-generated constructor stub
		num= i;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello from thread number "+num);
		if(num<=50) {
			Thread t = new Thread(new ThreadedGreeter(num+1));

		}
	}

}
