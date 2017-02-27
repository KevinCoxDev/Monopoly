
public class Player{
	String playerName;
	int playerID;
	
	int boardPosition = 0;
	Balance balance = new Balance(1500);
	
	public Player(int id, String name){
		this.playerID = id;
		this.playerName = name;
	}
	
	public int getPlayerID(){
		return playerID;
	}
	
	public String getPlayerName(){
		return playerName;
	}
	
	public int getBoardPosition(){
		return boardPosition;
	}
	
	public int seeBalance(){
		return balance.getBalance();
	}
}
