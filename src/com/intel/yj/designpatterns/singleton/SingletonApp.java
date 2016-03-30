package com.intel.yj.designpatterns.singleton;

import com.intel.yj.designpatterns.Result;

public class SingletonApp {
	public static void test(){
	    IvoryTower ivoryTower1 = IvoryTower.getInstance();
	    IvoryTower ivoryTower2 = IvoryTower.getInstance();
	    Result.append("ivoryTower1=" + ivoryTower1);
	    Result.append("ivoryTower2=" + ivoryTower2);

	    // lazily initialized singleton
	    ThreadSafeLazyLoadedIvoryTower threadSafeIvoryTower1 = ThreadSafeLazyLoadedIvoryTower.getInstance();
	    ThreadSafeLazyLoadedIvoryTower threadSafeIvoryTower2 = ThreadSafeLazyLoadedIvoryTower.getInstance();
	    Result.append("threadSafeIvoryTower1=" + threadSafeIvoryTower1);
	    Result.append("threadSafeIvoryTower2=" + threadSafeIvoryTower2);

	    // double checked locking
	    ThreadSafeDoubleCheckLocking dcl1 = ThreadSafeDoubleCheckLocking.getInstance();
	    ThreadSafeDoubleCheckLocking dcl2 = ThreadSafeDoubleCheckLocking.getInstance();
	    Result.append("ThreadSafeDoubleCheckLocking1=" + dcl1);
	    Result.append("ThreadSafeDoubleCheckLocking2=" + dcl2);
	    
	}
}
