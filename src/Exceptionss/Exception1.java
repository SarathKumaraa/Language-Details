package Exceptionss;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Exception1 {
	public static void main(String[] args) {

		// System.out.println(4/0);

		String name = "Sarath";

		// System.out.println(name.contains(name));
		String name1 = name.concat("M");
		System.out.println(name1);

		System.out.println(name1.equalsIgnoreCase("sarathM"));

		if (name.contains("y")) {
			System.out.println("success");
		} else {
			System.out.println("fail");
		}

		try {
			System.out.println(name.length());
			System.out.println("try block...");
		} catch (Exception e) {
			System.out.println("error occured");
		} finally {
			System.out.println("finally block....");
		}

		System.out.println("Success.....");

	}

}
