package concurrent_collections;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Concurr_Map {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<>();
		chm.putIfAbsent(1, "abc");
		hm.put(1, "abc");
		chm.putIfAbsent(1, "def");
		hm.put(1, "def");
		chm.putIfAbsent(1, "ghi");
		// TODO Auto-generated method stub
		System.out.println("chm only with putIfAbsent "+chm);
		System.out.println("hm only with put "+hm);
		chm.put(1, "www");
		System.out.println("chm after with put "+chm);
	}

}
