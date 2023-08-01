package serialiseAndDeseralise;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialize {
	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("human.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Human readObject = (Human) ois.readObject();
		System.out.println(readObject instanceof Object);
		System.out.println(readObject instanceof Human);
		System.out.println(readObject.getColor());
		System.out.println(readObject.getBlood());
		System.out.println(readObject.getHands());
		ois.close();
	}
}
