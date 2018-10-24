package concurrent_collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Concurr_Map {
	static ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<>();
	public static void main(String[] args) throws InterruptedException {
	
		
		chm.putIfAbsent(1, "abc");
		chm.putIfAbsent(2, "def");
		MyThread mt1 = new MyThread();
		Thread t1 = new Thread(mt1);
		t1.start();
		Set<Integer> keySet = chm.keySet();
		Iterator<Integer> it = keySet.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println("maps "+i+" => "+chm.get(i));
			Thread.currentThread().sleep(1000);
		}
		
		System.out.println("maps "+chm);
	}

}

class MyThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("child thread");
			Concurr_Map.chm.put(122, "oooo");
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("child catch thread");
				ConcurrentList.al.add(12);
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
}
