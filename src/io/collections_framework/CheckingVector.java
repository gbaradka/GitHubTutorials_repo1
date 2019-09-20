package io.collections_framework;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.Vector;

public class CheckingVector {

	public static void hashmap() {
		Map<String, String> hmap = new HashMap<String, String>();
		hmap.put("a", "ganesh");
		hmap.put("b", "vaibhavi");
//		hmap.put("c", "reva");
		hmap.put("d", "lenovo");

		Set<Entry<String, String>> set = hmap.entrySet();
		for (Entry<String, String> e : set) {
			e.getKey();
			e.getValue();
		}

	}

	public static void m2() {
		List<String> vector = new Vector<String>();
		vector.add("aReva");
		vector.add("ganesh");
		vector.add("vaibhavi");
		vector.add("zabcd");
		vector.add("baradkar");

		for (String s : vector) {
			System.out.println(s);
		}

		System.out.println("sorted...");
		Collections.sort(vector);
		System.out.println(vector);

		Iterator<String> it = vector.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
//convert to HashSet..
		Set<String> hashset = new HashSet<String>(vector);
		System.out.println(hashset);

		for (String s : hashset) {
			System.out.println(s);
		}
	}

	public static void randomm() {
		Random r = new Random();
		for (int i = 0; i <= 5; i++) {
			System.out.println(r.nextInt(40));
		}
	}

	public static void main(String[] args) {
		randomm();
	}

}
