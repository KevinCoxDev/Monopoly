import java.util.Random;
public class Dice {
	Random rand = new Random();
	int face1;
	int face2;
	
	public Dice(){
		
	}
	
	public void RollDice(){
		 face1 = 1+rand.nextInt(6);
		 face2 = 1+rand.nextInt(6);
	}
	public boolean DiceEqual(){
		return face1 == face2;
	}
	public int getMovement(){
		int totalMovement = face1 + face2;
		return totalMovement;
	}
	
}
