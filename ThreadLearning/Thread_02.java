package ThreadLearning;

public class Thread_02 extends Thread {
	int i;
	int j;
	String threadName;
	
	public Thread_02(String threadName,int i,int j) {
		super();
		this.threadName=threadName;
		this.i=i;
		this.j=j;
	}
	@Override
	public void run() {
		for (; i < j; i++) {
			System.out.println(threadName+"-> i is: "+i);
		}
	}

}
