package tehtävä10;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		Handler supervisor = new ImmediateSupervisor();
		Handler headOfUnit = new HeadOfUnit();
		Handler ceo = new CEO();

		supervisor.setSuccessor(headOfUnit);
		headOfUnit.setSuccessor(ceo);
		
		try {
			while (true) {
				System.out.print("\nEnter the raise amount to check who should approve the raise: ");
				double request = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
				supervisor.processRequest(new RaiseRequest(request));
			}
		} catch (Exception e) {
			System.exit(1);
		}
	}

}
