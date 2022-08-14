package tehtävä09;

import java.util.List;

//ConcreteStrategy (For + List's get-method). Line break after every third list element.
public class EveryThirdElement implements ListConverter {

	@Override
	public String listToString(List<String> list) {
		String listToString = "";
		
		for (int i = 0; i < list.size(); i++) {
			if (i == 0) {
				listToString += list.get(i);
			} else {
				if (i % 3 == 0)  {
					listToString += "\n" + list.get(i);
				} else {
					listToString += list.get(i);
				}
			}
		}
		
		return listToString;
	}

}