package tehtävä09;

import java.util.ArrayList;
import java.util.List;

// Context
public class Context {
	private ListConverter converter;
	private List<String> list;

	public Context(ListConverter converter) {
		this.converter = converter;
		list = new ArrayList<String>();
		createListElements();
	}

	public void convert() {
		System.out.println(converter.listToString(list));
	}

	public void setConverter(ListConverter converter) {
		this.converter = converter;
	}

	private void createListElements() {
		String numbers[] = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
				"Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty" };
				
		for (String n : numbers) {
			list.add(n);
		}	
	}
}