package tehtävä10;

//Concrete handler
public class HeadOfUnit extends Handler {
	private final double MAXAMOUNT = 5.0;
	private final double MINAMOUNT = 2.0;
	
	@Override
	public void processRequest(RaiseRequest raiseRequest) {
		if (raiseRequest.getAmount() > MINAMOUNT && raiseRequest.getAmount() <= MAXAMOUNT) {
			System.out.println("Head of unit approved the " + raiseRequest.getAmount() + "% raise request.");
		} else {
			System.out.println("Head of unit couldn't approve the " + raiseRequest.getAmount() + "% raise request.");
			super.processRequest(raiseRequest);
		}
	}
}