package concurrent_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ConcurrentList {
	static ArrayList<Integer> al = new ArrayList<>();
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ConcurrentList.al.add(1);
		ConcurrentList.al.add(2);
		ConcurrentList.al.add(3);
		ConcurrentList.al.add(4);
		ConcurrentList.al.add(5);
		Iterator<Integer> it =  al.iterator();
MyThread mt = new MyThread();
Thread t2 = new Thread(mt);
t2.start();
		while(it.hasNext())
		{
			Integer z = it.next();
			System.out.println("z "+z);
			Thread.currentThread().sleep(3000);
			
		}
	//	al = (ArrayList<Integer>) Collections.synchronizedList(al);
		

	}

}

class MyThread1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("child thread");
			ConcurrentList.al.add(12);
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("child catch thread");
				ConcurrentList.al.add(12);
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
}
