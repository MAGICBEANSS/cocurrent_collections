package concurrent_collections;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Concurr_Map {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<>();
		chm.putIfAbsent(1, "abc");
		chm.putIfAbsent(2, "abc");
		chm.remove(1, "def");
		System.out.println("1 chm "+chm);
		chm.remove(1, "abc");
		System.out.println("2 chm "+chm);
	}

}
