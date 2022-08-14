package tehtävä10;

// Handler
public abstract class Handler {
	private Handler successor;
	
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	public void processRequest(RaiseRequest raiseRequest) {
		if (successor != null) {
			successor.processRequest(raiseRequest);
		}
	}
}