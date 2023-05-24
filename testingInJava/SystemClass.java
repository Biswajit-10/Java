package testingInJava;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;

@SuppressWarnings("unused")
public class SystemClass {
	public static void main(String[] args) throws InterruptedException, IOException {
	}
	private static void garbageCollection() {
		System.gc();
		Runtime.getRuntime().gc();
		System.runFinalization();
	}
	private static void lineSeparator() {
		String lineSeparator = System.lineSeparator();
		System.out.print("Hello"+lineSeparator+"Biswajit");
	}
	private static void programExecutionTime() throws InterruptedException {
		long programStart = System.currentTimeMillis();	/*Measures time difference from 1970 to current time in nano seconds*/
		System.out.println("start time:"+programStart);
		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);
		}
		long programEnd = System.currentTimeMillis();
		System.out.println("end time:"+programEnd);
		long totalTime=programEnd-programStart;
		System.out.println("total program exectime in seconds:"+totalTime/1000f);
	}
	
	private static void properties() {
		Properties properties = System.getProperties();
		Set<Object> keySet = properties.keySet();
		for (Object object : keySet) {
			Object property = properties.get(object);
			System.out.println(object+"----"+property);
		}
	}
	
	private static void environmentVariable() {
		Map<String, String> getenv=Collections.emptyMap();
		
		try {getenv = System.getenv();} 
		catch (SecurityException s) {s.printStackTrace();}
		
		Set<String> keySets = getenv.keySet();
		TreeSet<String> keySet=new TreeSet<>(keySets);
		
		for (String key : keySet) {
			String value = getenv.get(key);
			System.out.println(key+"----"+value);
		}	
	}	
}
