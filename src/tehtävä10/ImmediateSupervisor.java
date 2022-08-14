package tehtävä10;

// Concrete handler
public class ImmediateSupervisor extends Handler {
	private final double MAXAMOUNT = 2.0;
	
	@Override
	public void processRequest(RaiseRequest raiseRequest) {
		if (raiseRequest.getAmount() <= MAXAMOUNT) {
			System.out.println("Supervisor approved the " + raiseRequest.getAmount() + "% raise request.");
		} else {
			System.out.println("Supervisor couldn't approve the " + raiseRequest.getAmount() + "% raise request.");
			super.processRequest(raiseRequest);
		}
	}
}