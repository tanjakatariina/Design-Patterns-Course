package tehtävä18.deepClone;

public class ClockHand implements Cloneable {
	private int time;

	public ClockHand(int time) {
		this.time = time;
	}

	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
}