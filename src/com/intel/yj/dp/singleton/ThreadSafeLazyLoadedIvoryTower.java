package com.intel.yj.dp.singleton;

public class ThreadSafeLazyLoadedIvoryTower {

	  private static ThreadSafeLazyLoadedIvoryTower instance = null;

	  private ThreadSafeLazyLoadedIvoryTower() {
	  }

	  /**
	   * The instance gets created only when it is called for first time.
	   * Lazy-loading
	   */
	  public synchronized static ThreadSafeLazyLoadedIvoryTower getInstance() {

	    if (instance == null) {
	      instance = new ThreadSafeLazyLoadedIvoryTower();
	    }

	    return instance;
	  }
	}

