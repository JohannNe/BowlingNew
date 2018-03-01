import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class BowlingTest {

	@Test
	public void giveScoreForOnlyStrikes() {
		ArrayList<Integer> strikeSequence = new ArrayList<Integer>();
		strikeSequence.addAll(Arrays.asList(10,10,10,10,10,10,10,10,10,10,10,10));
		assertEquals(BowlingGame.giveScoreForSequence(strikeSequence), 300);
	}
	
	@Test
	public void giveAdditionalPointsForStrikeFollowedByStrikes() throws Exception {
		ArrayList<Integer> strikeSequence = new ArrayList<Integer>();
		strikeSequence.addAll(Arrays.asList(10,10,10,10,10,10,10,10,10,10,10,10));
		assertEquals(BowlingGame.giveAdditionalPointsForStrike(strikeSequence, 3), 20);
	}
	
	@Test
	public void giveScoreForNoSparesOrStrikes() throws Exception {
		ArrayList<Integer> strikeSequence = new ArrayList<Integer>();
		strikeSequence.addAll(Arrays.asList(9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0));
		assertEquals(BowlingGame.giveScoreForSequence(strikeSequence), 90);
	}

}
