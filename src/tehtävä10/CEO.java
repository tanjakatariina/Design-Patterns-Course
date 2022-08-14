package tehtävä10;

//Concrete handler
public class CEO extends Handler {
	private final double MINAMOUNT = 5.0;

	@Override
	public void processRequest(RaiseRequest raiseRequest) {
		if (raiseRequest.getAmount() > MINAMOUNT) {
			System.out.println("CEO approved the " + raiseRequest.getAmount() + "% raise request.");
		} else {
			System.out.println("No one can approve the " + raiseRequest.getAmount() + "% raise request.");
		}
	}
}