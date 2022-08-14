package tehtävä18.deepClone;

// Prototype, Kloonattava luokka.
public class Clock implements Cloneable {

	private ClockHand minHand;
	private ClockHand hourHand;

	public Clock(int hour, int min) {
		hourHand = new ClockHand(hour);
		minHand = new ClockHand(min);
	}

	public Clock clone() {
		Clock clock = null;
		try {
			clock = (Clock) super.clone();
			clock.minHand = (ClockHand) minHand.clone();
			clock.hourHand = (ClockHand) hourHand.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
		return clock;
	}
	
	public ClockHand getMinHand() {
		return minHand;
	}

	public ClockHand getHourHand() {
		return hourHand;
	}

	public String toString() {
		return hourHand.getTime() + ":" + minHand.getTime();
	}
}