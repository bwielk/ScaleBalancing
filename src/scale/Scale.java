package scale;

import java.util.ArrayList;
import java.util.Collections;

public class Scale {

	public String weigh(int[] scaleWeights, ArrayList<Integer> weights) {
		int[] extraWeights = new int[2];
		int difference;
		int greaterValueIndex;
		if(scaleWeights[0]>scaleWeights[1]){
			greaterValueIndex = 0;
			difference = scaleWeights[0] - scaleWeights[1];
		}else{
			greaterValueIndex = 1;
			difference = scaleWeights[1] - scaleWeights[0];
		}
		Collections.sort(weights, Collections.reverseOrder());
		while(difference > 0){
			for(int i=0; i<weights.size(); i++){
				if(difference >= i){
					extraWeights[i] = weights.get(i);
					difference -= weights.get(i);
				}
			}
		}
		System.out.println("\n" + extraWeights[0] + ":" + extraWeights[1]);
		//return 2 weights
		//check if any pair of elements of weights equals the difference
		//if so, return the pair of elements or a single elements
		//otherwise return string "Not possible";
		return "Not possible";
	}

}
