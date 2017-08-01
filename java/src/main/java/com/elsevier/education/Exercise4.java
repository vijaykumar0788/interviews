package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
Answer : Counter is not thread-safe, because if multiple thread can reset the counter or 
 		 it can increment the counter. To make it thread safe instead of int 
 		 we can use AtomicInteger.
*/
public class Exercise4 {

	public static class Counter {
		
		//private int count = 0;
		private AtomicInteger count = new AtomicInteger(0);
		
		public int increment() {
			//return ++count;
			return count.incrementAndGet();
		}
		
		public int getCount() {
			//return count;
			return count.get();
		}
		
		public void resetCount() {
			//count = 0;
			count.set(0);
		}

	}
}