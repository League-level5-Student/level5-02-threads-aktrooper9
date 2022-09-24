package _04_Thread_Pool;

public class ThreadPoolTester {
public static void main(String[] args) {
	WorkQueue wq= new WorkQueue();
	System.out.println("Total Threads: "+wq.getThreadCount());
	wq.shutdown();
}
}
