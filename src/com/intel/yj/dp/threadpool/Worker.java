package com.intel.yj.dp.threadpool;

import com.intel.yj.dp.Result;

/**
 * 
 * Worker implements {@link Runnable} and thus can be executed by {@link ExecutorService}
 *
 */
public class Worker implements Runnable {
	
	private final Task task;

	public Worker(final Task task) {
		this.task = task;
	}
	
	@Override
	public void run() {
		Result.append(String.format("%s processing %s", Thread.currentThread().getName(), task.toString()));
		try {
			Thread.sleep(task.getTimeMs());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

