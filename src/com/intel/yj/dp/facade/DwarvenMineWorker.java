package com.intel.yj.dp.facade;

import com.intel.yj.dp.Result;


/**
 * 
 * DwarvenMineWorker is one of the goldmine subsystems.
 *
 */
public abstract class DwarvenMineWorker {

	public void goToSleep() {
		Result.append(name() + " goes to sleep.");
	}

	public void wakeUp() {
		Result.append(name() + " wakes up.");
	}

	public void goHome() {
		Result.append(name() + " goes home.");
	}

	public void goToMine() {
		Result.append(name() + " goes to the mine.");
	}

    private void action(Action action) {
        switch (action) {
            case GO_TO_SLEEP:
                goToSleep();
                break;
            case WAKE_UP:
                wakeUp();
                break;
            case GO_HOME:
                goHome();
                break;
            case GO_TO_MINE:
                goToMine();
                break;
            case WORK:
                work();
                break;
            default:
                System.out.println("Undefined action");
                break;
        }
    }

    public void action(Action... actions) {
        for (Action action : actions) {
            action(action);
        }
    }

	public abstract void work();

	public abstract String name();

    static enum Action {
        GO_TO_SLEEP, WAKE_UP, GO_HOME, GO_TO_MINE, WORK
    }
}

