package ThreadLearning;

public class PreventThreadExecution {
	public static void main(String[] args) throws InterruptedException {
		MyClass m=new MyClass();
		m.start();
		m.join();
		for(int i=0;i<20;i++) {
			System.out.println("this is main thread:"+i);
		}
	}
}

class MyClass extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("this is child thread:"+i);
//			Thread.yield();
		}
	}
}