import java.util.ArrayList;

public class BowlingGame {
	
	public static int giveScoreForSequence(ArrayList<Integer> sequence){
		int iScore = 0;
		int iFrameIndex = 0;
		int iPins=0;
		int iPinsFirstTry=0;
		boolean bSecondTry = false;
		boolean bStrike = false;
		
		for(int i=0; i<sequence.size(); i++){
			iPins = sequence.get(i);
			iScore += iPins;
			
			if(iFrameIndex<9){ //No extra points for strikes or spares in the last frame
				
				if(iPins == 10){ //Player hits strike
					iScore += giveAdditionalPointsForStrike(sequence,i);
					bStrike = true;
				}
				else if(bSecondTry){
					if(iPins + iPinsFirstTry == 10){ //Check if player hit a spare
						iScore += giveAdditionalPointsForSpare(sequence,i);
					}
				}
				else{
					iPinsFirstTry = iPins;
				}
				
			}
			
			if(bStrike || bSecondTry){
				iFrameIndex +=1;
				bStrike = false;
				bSecondTry = false;
			}
			else{
				bSecondTry = true;
			}
		}
		
		return iScore;
	}

	public static int giveAdditionalPointsForStrike(ArrayList<Integer> sequence, int index){
		return sequence.get(index+1) + sequence.get(index+2);
	}
	
	public static int giveAdditionalPointsForSpare(ArrayList<Integer> sequence, int index){
		return sequence.get(index+1);
	}
	
}
