package com.zapcom.userreview.nlp;

import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class SentimentAnalysisTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public SentimentAnalysisTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(SentimentAnalysisTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		// String reviewText = "Very little connect with customers. We were asked to pay full amount in advance before they gave us the key to the room. This, inspite of having my credit card number used for making booking. A bit insulting when you are paying 22000/- per day for the room.";
		
		long startTime = System.currentTimeMillis();
		String reviewText = " ideal for one who dont want to go outside hotel and want to spend time in hotel and there beach. + Rooms are spacious. + Room service is good. + Swim pool bar offers good and prompt services. + Breakfast was too good - Too many crows over there, and if you leave food in open your food will be spoiled by crows, - Hotel is in isolated place, difficult to get transport from outside. - No activities near beach";
		List<String> analyzedSentencesList = SentimentAnalysis.processReviewForSA(reviewText);
		// assertSame(4, analyzedSentencesList.size());
		analyzedSentencesList.forEach(analysis -> System.out.println(analysis));
		
		System.out.println("Total Time: " + (System.currentTimeMillis() - startTime));
	}
}
