package scale;

import java.util.ArrayList;

public class Scale {

	public String weigh(int[] scaleWeights, ArrayList<Integer> weights) {
		int difference;
		int greaterValueIndex;
		if(scaleWeights[0]>scaleWeights[1]){
			greaterValueIndex = 0;
			difference = scaleWeights[0] - scaleWeights[1];
		}else{
			greaterValueIndex = 1;
			difference = scaleWeights[1] - scaleWeights[0];
		}
		System.out.println(scaleWeights[greaterValueIndex]);
		System.out.println("The difference is " + difference);
		//compare scaleWeight elements
		//assign the greater value to a variable
		//assign the difference to a variable
		//return 2 weights
		//check if any pair of elements of weights equals the difference
		//if so, return the pair of elements or a single elements
		//otherwise return string "Not possible";
		return "Not possible";
	}

}
