package com.intel.yj.designpatterns.memento;

import com.intel.yj.designpatterns.Result;
//备忘录模式（Memento Pattern）保存一个对象的某个状态，以便在适当的时候恢复对象。备忘录模式属于行为型模式。
public class MementoApp {
//备忘录模式使用三个类 Memento、Originator 和 CareTaker。Memento 包含了要被恢复的对象的状态。Originator 创建并在 Memento 对象中存储状态。Caretaker 对象负责从 Memento 中恢复对象的状态。
	public static void test() {
	      Originator originator = new Originator();
	      CareTaker careTaker = new CareTaker();
	      originator.setState("State #1");
	      originator.setState("State #2");
	      careTaker.add(originator.saveStateToMemento());
	      originator.setState("State #3");
	      careTaker.add(originator.saveStateToMemento());
	      originator.setState("State #4");

	      Result.append("Current State: " + originator.getState());       
	      originator.getStateFromMemento(careTaker.get(0));
	      Result.append("First saved State: " + originator.getState());
	      originator.getStateFromMemento(careTaker.get(1));
	      Result.append("Second saved State: " + originator.getState());
	}
}
