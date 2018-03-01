import java.util.ArrayList;

public class BowlingGame {
	
	public static int giveScoreForSequence(ArrayList<Integer> sequence){
		return 0;
	}

	public static int giveAdditionalPointsForStrike(ArrayList<Integer> sequence, int index){
		return sequence.get(index+1) + sequence.get(index+2);
	}
}
