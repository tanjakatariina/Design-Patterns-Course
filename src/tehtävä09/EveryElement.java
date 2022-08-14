package tehtävä09;

import java.util.Iterator;
import java.util.List;

// ConcreteStrategy (Iterator). Line break after each list element.
public class EveryElement implements ListConverter {

	@Override
	public String listToString(List<String> list) {
		String listToString = "";
		Iterator<String> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			listToString += iterator.next() + "\n";
		}
		
		return listToString;
	}
}