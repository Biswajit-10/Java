package serialiseAndDeseralise;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serial {
	public static void main(String[] args) throws Exception {
		Human human=new Human("white",4,"A+");
		FileOutputStream fos=new FileOutputStream("human.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(human);
		oos.close();
		fos.close();
	}
}
