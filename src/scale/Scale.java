package scale;

import java.util.ArrayList;
import java.util.Collections;

public class Scale {

	public String weigh(int[] scaleWeights, ArrayList<Integer> weights) {
		ArrayList<String> extraWeights = new ArrayList<String>();
		int difference;
		if(scaleWeights[0]>scaleWeights[1]){
			difference = scaleWeights[0] - scaleWeights[1];
		}else{
			difference = scaleWeights[1] - scaleWeights[0];
		}
		Collections.sort(weights, Collections.reverseOrder());
		int count = 0;
			for(int i=0; i<weights.size(); i++){
				if(weights.get(i) <= difference){
					extraWeights.add(String.valueOf(weights.get(i)));
					difference -= weights.get(i);
					count++;
			}
		}
		System.out.println("\n count : " + count);
		if(count <= 2){
			return String.join(",", extraWeights);
		}else{
			return "Not possible";
		}
	}
}