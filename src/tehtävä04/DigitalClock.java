package tehtävä04;

import java.util.Observable;
import java.util.Observer;

// ConcreateObserver
@SuppressWarnings("deprecation")
public class DigitalClock implements Observer {

	private ClockTimer timer;

	public DigitalClock(ClockTimer ct) {
		timer = ct;
		timer.addObserver(this); // Add ClockTimer (observer) to timer's (observable) set of observers.
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o == timer) {
			System.out.println(arg);
		}
	}
}