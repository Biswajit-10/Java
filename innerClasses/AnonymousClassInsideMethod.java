package innerClasses;

public class AnonymousClassInsideMethod {

	public static void main(String[] args) {
		new Thread(new Runnable() {
			public void run() {
				System.out.println("child Thread");
			}
		}).start();
	}
}
