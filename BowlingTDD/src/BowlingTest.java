import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class BowlingTest {

	@Test
	public void giveScoreForOnlyStrikes() {
		ArrayList<Integer> strikeSequence = new ArrayList<Integer>();
		strikeSequence.addAll(Arrays.asList(10,10,10,10,10,10,10,10,10,10,10,10));
		assertEquals(300, BowlingGame.giveScoreForSequence(strikeSequence));
	}
	
	@Test
	public void giveAdditionalPointsForStrikeFollowedByStrikes() throws Exception {
		ArrayList<Integer> strikeSequence = new ArrayList<Integer>();
		strikeSequence.addAll(Arrays.asList(10,10,10,10,10,10,10,10,10,10,10,10));
		assertEquals(20, BowlingGame.giveAdditionalPointsForStrike(strikeSequence, 3));
	}
	
	@Test
	public void giveScoreForNoSparesOrStrikes() throws Exception {
		ArrayList<Integer> strikeSequence = new ArrayList<Integer>();
		strikeSequence.addAll(Arrays.asList(9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0));
		assertEquals(90, BowlingGame.giveScoreForSequence(strikeSequence));
	}
	
	@Test
	public void giveScoreForOnlySpares() throws Exception {
		ArrayList<Integer> strikeSequence = new ArrayList<Integer>();
		strikeSequence.addAll(Arrays.asList(5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5));
		assertEquals(150, BowlingGame.giveScoreForSequence(strikeSequence));
	}
	
	@Test
	public void giveAdditionalPointsForSpareFollowedByFive() throws Exception {
		ArrayList<Integer> strikeSequence = new ArrayList<Integer>();
		strikeSequence.addAll(Arrays.asList(5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5));
		assertEquals(5, BowlingGame.giveAdditionalPointsForSpare(strikeSequence,4));
	}

}
