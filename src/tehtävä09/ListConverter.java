package tehtävä09;

import java.util.List;

// Strategy
public interface ListConverter {
	public abstract String listToString(List<String> list);
}