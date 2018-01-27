package scale;

import java.util.ArrayList;
import java.util.Collections;

public class Scale {

	public String weigh(int[] scaleWeights, ArrayList<Integer> weights, int limitOfExtraWeights) {
		ArrayList<String> extraWeights = new ArrayList<String>();
		int difference;
		//find greater value
		if (scaleWeights[0] > scaleWeights[1]) {
			difference = scaleWeights[0] - scaleWeights[1];
		} else {
			difference = scaleWeights[1] - scaleWeights[0];
		}
		//sort the weights array elements from the highest to lowest
		Collections.sort(weights, Collections.reverseOrder());
		//find needed extra weights
		for (int i = 0; i < weights.size(); i++) {
			if (weights.get(i) <= difference && extraWeights.size() < limitOfExtraWeights + 1) {
				extraWeights.add(String.valueOf(weights.get(i)));
				difference -= weights.get(i);
			}
		}
		if (extraWeights.size() <= limitOfExtraWeights) {
			return String.join(",", extraWeights);
		} else {
			return "Not possible";
		}
	}
}