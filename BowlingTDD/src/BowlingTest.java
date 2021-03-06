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
	public void giveAdditionalPointsForStrikeFollowedByZeros() throws Exception {
		ArrayList<Integer> strikeSequence = new ArrayList<Integer>();
		strikeSequence.addAll(Arrays.asList(10,10,10,10,0,0,10,10,10,10,10,10));
		assertEquals(0, BowlingGame.giveAdditionalPointsForStrike(strikeSequence, 3));
	}
	
	@Test
	public void giveAdditionalPointsForStrikeFollowedByThreeAndFive() throws Exception {
		ArrayList<Integer> strikeSequence = new ArrayList<Integer>();
		strikeSequence.addAll(Arrays.asList(10,10,10,10,3,5,10,10,10,10,10,10));
		assertEquals(8, BowlingGame.giveAdditionalPointsForStrike(strikeSequence, 3));
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
	
	@Test
	public void giveAdditionalPointsForSpareFollowedByZero() throws Exception {
		ArrayList<Integer> strikeSequence = new ArrayList<Integer>();
		strikeSequence.addAll(Arrays.asList(5,5,5,5,5,0,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5));
		assertEquals(0, BowlingGame.giveAdditionalPointsForSpare(strikeSequence,4));
	}
	
	@Test
	public void giveScoreForSequenceWithSpareInLastFrame() throws Exception {
		ArrayList<Integer> strikeSequence = new ArrayList<Integer>();
		strikeSequence.addAll(Arrays.asList(9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,1,9));
		assertEquals(100, BowlingGame.giveScoreForSequence(strikeSequence));
	}
	
	@Test
	public void giveScoreForSequenceWithMissesOnly() throws Exception {
		ArrayList<Integer> strikeSequence = new ArrayList<Integer>();
		strikeSequence.addAll(Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0));
		assertEquals(0, BowlingGame.giveScoreForSequence(strikeSequence));
	}
}
