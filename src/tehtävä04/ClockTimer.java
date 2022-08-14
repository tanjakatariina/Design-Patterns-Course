package tehtävä04;

import java.util.Observable;

//ConcreateObservable and a thread.
@SuppressWarnings("deprecation")
public class ClockTimer extends Observable implements Runnable {

	private int hour;
	private int minute;
	private int second;

	public ClockTimer() {
		hour = 0;
		minute = 0;
		second = 0;
	}

	public int getSecond() {
		return second;
	}

	public int getMinute() {
		return minute;
	}

	public int getHour() {
		return hour;
	}

	public synchronized void tick() {
		second++;

		if (second > 59) {
			minute++;
			second = 0;
		}

		if (minute > 59) {
			hour++;
			minute = 0;
		}

		if (hour > 23) {
			hour = 0;
		}

		String time = hour + ":" + minute + ":" + second;

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		setChanged();
		notifyObservers(time);	// Push time to observer
	}

	@Override
	public void run() {
		// Tick the clock forever... or write a condition to stop the clock e.g. hour < 23
		while (true) {
			tick();
		}
	}
}