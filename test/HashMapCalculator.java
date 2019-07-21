import java.util.ArrayList;
import java.util.HashMap;

public class HashMapCalculator {

	public int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		// TODO Auto-generated method stub
		int matching =0;
		ArrayList<String> matchingKeys = new ArrayList<String>();
		for (String i : hashmap1.keySet()) {
			for (String j : hashmap2.keySet()) {
				if (i.equals(j)&&!matchingKeys.contains(i))
					matchingKeys.add(i);
			}
		}
		for (String i : matchingKeys) {
			if (hashmap1.get(i).equals(hashmap2.get(i))) {
				matching++;
			}
		}
		return matching;
	}

}
