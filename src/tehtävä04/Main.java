package tehtävä04;

public class Main {

	public static void main(String[] args) {
		ClockTimer timer = new ClockTimer();
		DigitalClock clock = new DigitalClock(timer);
		
		// Create and start the thread
		Thread timerThread = new Thread(timer);
		timerThread.start();
	}
}