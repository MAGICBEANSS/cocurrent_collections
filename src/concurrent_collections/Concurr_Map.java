package concurrent_collections;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Concurr_Map {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<>();
		chm.putIfAbsent(1, "abc");
		chm.putIfAbsent(2, "abc");
		chm.replace(1, "def","zzz");
		chm.replace(4, "def","zzz");
		System.out.println("1 chm "+chm);
		chm.replace(1, "abc","zzz");
		chm.replace(3, "abc","zzz");
		System.out.println("2 chm "+chm);
	}

}
