package concurrent_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentList {
	static CopyOnWriteArrayList<Integer> al = new CopyOnWriteArrayList<>();
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ConcurrentList.al.add(1);
		ConcurrentList.al.add(2);
		ConcurrentList.al.addIfAbsent(3);

		boolean add4 = ConcurrentList.al.addIfAbsent(4);
		if(add4)  {
			System.out.println("adding 4 in main thread returns true as not there in arraylist "+add4);
		}
		else
		{
			System.out.println("adding 4 in main thread returns false as already there in arraylist "+add4);
		}
		ConcurrentList.al.addIfAbsent(3);
		ConcurrentList.al.add(5);
		Iterator<Integer> it =  al.iterator();
MyThread1 mt = new MyThread1();
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
		boolean add4 = 	ConcurrentList.al.addIfAbsent(4);
		if(add4)  {
			System.out.println("adding 4 returns true as not there in arraylist "+add4);
		}
		else
		{
			System.out.println("adding 4 returns false as already there in arraylist "+add4);
		}
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("child catch thread");
				ConcurrentList.al.add(12);
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
}
