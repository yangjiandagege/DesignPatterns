package com.intel.yj.dp.singleton;

public class ThreadSafeDoubleCheckLocking {

	  private static volatile ThreadSafeDoubleCheckLocking INSTANCE;

	  /**
	   * private constructor to prevent client from instantiating.
	   */
	  private ThreadSafeDoubleCheckLocking() {
	    //to prevent instantiating by Reflection call
	    if (INSTANCE != null) {
	      throw new IllegalStateException("Already initialized.");
	    }
	  }

	  /**
	   * Public accessor.
	   *
	   * @return an instance of the class.
	   */
	  public static ThreadSafeDoubleCheckLocking getInstance() {
	    //local variable increases performance by 25 percent
	    //Joshua Bloch "Effective Java, Second Edition", p. 283-284
	    ThreadSafeDoubleCheckLocking result = INSTANCE;
	    if (result == null) {
	      synchronized (ThreadSafeDoubleCheckLocking.class) {
	        result = INSTANCE;
	        if (result == null) {
	          INSTANCE = result = new ThreadSafeDoubleCheckLocking();
	        }
	      }
	    }
	    return result;
	  }
}

