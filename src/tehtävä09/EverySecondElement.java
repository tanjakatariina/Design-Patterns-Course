package tehtävä09;

import java.util.List;

//ConcreteStrategy (Array + for). Line break after every other list element.
public class EverySecondElement implements ListConverter{

	@Override
	public String listToString(List<String> list) {		
		String listToString = "";
		String[] array = list.toArray(new String[list.size()]);
		
		for (int i = 0; i < array.length - 1; i++) {
			if (i == 0) {
				listToString += array[i];
			} else {
				if (i % 2 == 0)  {
					listToString += "\n" + array[i];
				} else {
					listToString += array[i];
				}
			}
		}
		
		return listToString;
	}	
}