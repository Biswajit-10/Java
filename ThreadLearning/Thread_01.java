package ThreadLearning;

public class Thread_01 {
	
	public static void main(String[] args) {
		
		Thread_02 t1=new Thread_02("Thread 1",0,50);
		t1.start();
		
		Thread_02 t2=new Thread_02("Thread 2",50,100);
		t2.start();
		
		Thread_02 t3=new Thread_02("Thread 3",100,150);
		t3.start();
		
	}
}