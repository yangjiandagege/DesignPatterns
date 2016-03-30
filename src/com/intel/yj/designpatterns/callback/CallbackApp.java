package com.intel.yj.designpatterns.callback;

import com.intel.yj.designpatterns.Result;

public class CallbackApp {
    private static Integer callingCount = 0;
	public static void test(){
        Callback callback = new Callback() {
            @Override
            public void call() {
                callingCount++;
            }
        };

        Task task = new SimpleTask();

        Result.append("Initial calling count of 0");
        task.executeWith(callback);
        Result.append("Callback called "+callingCount);
        task.executeWith(callback);
        Result.append("Callback called "+callingCount);
	}
}
