public class Game {
	
	static Board board = new Board();
	private int boardPosition;
	private static Segment seg;
	
	static int jailCounter = 0;
	boolean jailed = false;
	
	Dice dice = new Dice();
	private Player player;
	
	public void turn(){
		if(!jailed){
			dice.RollDice();
			int movement = dice.getMovement();
			setBoardPosition(movement);
			//buy
			//do shit
			seg = board.getSegment(getBoardPosition());
			seg.land(player);
			if(dice.DiceEqual()){
				System.out.println("Rolled a double. Gets to go again");
				turn();
			}
		}
		else if(jailCounter > 2){
			jailed = false;
			turn();
		}
		else{
			jailCounter++;
			if(dice.DiceEqual()){
				jailed = false;
				turn();
			}
		}
	}
	
	public int getBoardPosition(){
		return boardPosition;
	}
	
	public void setBoardPosition(int position){
		this.boardPosition += position;
		if(boardPosition > 39){
			boardPosition -= 39;
			//balance.addBalance(200);
		}
		
	}
	
	public void moveDirectly(int position){
		boardPosition = position;
		seg.land(player);
		
	}
	
	public static void main(String args[]){
		Board board = new Board();
		board.createBoard();
		
		Player player = new Player(1, "Brian");
		
		// use board.segs.get(num) to get from array list, don't use segs[num]
		Segment landedOn = board.segs.get(13);
		
		landedOn.land(player);
		
		System.out.println(landedOn.name);
	}

}
