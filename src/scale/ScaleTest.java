package scale;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Before;
import org.junit.Test;

public class ScaleTest {
	
	private int[] scaleWeights;
	private ArrayList<Integer> weights;
	private Scale scale;
	
	@Before
	public void before(){
		scaleWeights = new int[2];
		weights = new ArrayList<Integer>();
		scale = new Scale();
	}
	
	@Test
	public void aScaleHolds2WeightsAndMeasuresTheDifference() {
		scaleWeights[0] = 2;
		scaleWeights[1] = 10;
		Collections.addAll(weights, 1,2,3,4,5);
		scale.weigh(scaleWeights, weights);
	}
}