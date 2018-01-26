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
	public void aScaleHolds2WeightsAndMeasuresTheDifferenceAndFindsExtraWeightsPart1() {
		System.out.print("\nTest1");
		scaleWeights[0] = 2;
		scaleWeights[1] = 10;
		Collections.addAll(weights, 1,2,3,4,5);
		assertNotEquals("4,3,1", scale.weigh(scaleWeights, weights, 2));
		assertNotEquals("5,4", scale.weigh(scaleWeights, weights, 2));
		assertNotEquals("Not possible", scale.weigh(scaleWeights, weights, 2));
		assertEquals("5,3", scale.weigh(scaleWeights, weights, 2));
	}
	
	@Test
	public void aScaleHolds2WeightsAndMeasuresTheDifferenceAndFindsExtraWeightsPart2() {
		System.out.print("\nTest2");
		scaleWeights[0] = 5;
		scaleWeights[1] = 3;
		Collections.addAll(weights, 1,1,3,4);
		assertNotEquals("Not possible", scale.weigh(scaleWeights, weights, 2));
		assertEquals("1,1", scale.weigh(scaleWeights, weights, 2));
	}
	
	@Test
	public void aScaleHolds2WeightsAndMeasuresTheDifferenceAndFindsExtraWeightsPart3() {
		System.out.print("\nTest3");
		scaleWeights[0] = 9;
		scaleWeights[1] = 1;
		Collections.addAll(weights, 1,2,3,8);
		assertNotEquals("8,2", scale.weigh(scaleWeights, weights, 2));
		assertNotEquals("Not possible", scale.weigh(scaleWeights, weights, 2));
		assertEquals("8", scale.weigh(scaleWeights, weights, 2));
	}
	
	@Test
	public void aScaleHolds2WeightsAndMeasuresTheDifferenceAndFindsExtraWeightsPart4() {
		System.out.print("\nTest4");
		scaleWeights[0] = 12;
		scaleWeights[1] = 29;
		Collections.addAll(weights, 1,11,2);
		assertNotEquals("12,2,1", scale.weigh(scaleWeights, weights, 2));
		assertEquals("Not possible", scale.weigh(scaleWeights, weights, 2));
	}
	
	@Test
	public void aScaleHolds2WeightsAndMeasuresTheDifferenceAndFindsExtraWeightsPart5() {
		System.out.print("\nTest5");
		scaleWeights[0] = 8;
		scaleWeights[1] = 12;
		Collections.addAll(weights, 1,1,4);
		assertNotEquals("Not possible", scale.weigh(scaleWeights, weights, 2));
		assertEquals("4", scale.weigh(scaleWeights, weights, 2));
	}
	
	@Test
	public void aScaleHolds2WeightsAndMeasuresTheDifferenceAndFindsExtraWeightsPart6() {
		System.out.print("\nTest6");
		scaleWeights[0] = 10;
		scaleWeights[1] = 1;
		Collections.addAll(weights, 1,1,1,1,1,6);
		assertNotEquals("6", scale.weigh(scaleWeights, weights, 2));
		assertNotEquals("6,1,1,1", scale.weigh(scaleWeights, weights, 2));
		assertEquals("Not possible", scale.weigh(scaleWeights, weights, 2));
	}
	
	@Test
	public void aScaleHolds2WeightsAndMeasuresTheDifferenceAndFindsExtraWeightsPart7() {
		System.out.print("\nTest7");
		scaleWeights[0] = 99;
		scaleWeights[1] = 89;
		Collections.addAll(weights, 5,5,4);
		assertNotEquals("Not possible", scale.weigh(scaleWeights, weights, 2));
		assertNotEquals("5,4", scale.weigh(scaleWeights, weights, 2));
		assertEquals("5,5", scale.weigh(scaleWeights, weights, 2));
	}
	
	@Test
	public void aScaleHolds2WeightsAndMeasuresTheDifferenceAndFindsExtraWeightsPart8() {
		System.out.print("\nTest8");
		scaleWeights[0] = 120;
		scaleWeights[1] = 90;
		Collections.addAll(weights, 10,20,30);
		assertNotEquals("Not possible", scale.weigh(scaleWeights, weights, 2));
		assertNotEquals("20,10", scale.weigh(scaleWeights, weights, 2));
		assertEquals("30", scale.weigh(scaleWeights, weights, 2));
	}
	
	@Test
	public void aScaleHolds2WeightsAndMeasuresTheDifferenceAndFindsExtraWeightsPart9() {
		System.out.print("\nTest9");
		scaleWeights[0] = 140;
		scaleWeights[1] = 90;
		Collections.addAll(weights, 48,1,1);
		assertNotEquals("48,1,1", scale.weigh(scaleWeights, weights, 2));
		assertNotEquals("48,1", scale.weigh(scaleWeights, weights, 2));
		assertEquals("Not possible", scale.weigh(scaleWeights, weights, 2));
	}
	
	@Test
	public void aScaleHolds3WeightsAndMeasuresTheDifferenceAndFindsExtraWeightsPart1() {
		System.out.print("\nTest10");
		scaleWeights[0] = 110;
		scaleWeights[1] = 101;
		Collections.addAll(weights, 3,3,3,1,1);
		assertNotEquals("3,1,1", scale.weigh(scaleWeights, weights, 3));
		assertNotEquals("Not possible", scale.weigh(scaleWeights, weights, 3));
		assertEquals("3,3,3", scale.weigh(scaleWeights, weights, 3));
	}
	
	@Test
	public void aScaleHolds4WeightsAndMeasuresTheDifferenceAndFindsExtraWeightsPart1() {
		System.out.print("\nTest11");
		scaleWeights[0] = 25;
		scaleWeights[1] = 20;
		Collections.addAll(weights, 2,1,1,1,1);
		assertNotEquals("Not possible", scale.weigh(scaleWeights, weights, 4));
		assertNotEquals("1,1,1,2", scale.weigh(scaleWeights, weights, 4));
		assertEquals("2,1,1,1", scale.weigh(scaleWeights, weights, 4));
	}
	
	@Test
	public void aScaleHolds5WeightsAndMeasuresTheDifferenceAndFindsExtraWeightsPart1() {
		System.out.print("\nTest12");
		scaleWeights[0] = 12;
		scaleWeights[1] = 1;
		Collections.addAll(weights, 6,3,2,1,1,1,1);
		assertNotEquals("1,1,1,2,6", scale.weigh(scaleWeights, weights, 5));
		assertNotEquals("Not possible", scale.weigh(scaleWeights, weights, 5));
		assertEquals("6,3,2", scale.weigh(scaleWeights, weights, 5));
	}
}