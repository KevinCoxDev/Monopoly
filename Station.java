
public class Station extends Buyable {

	int numOwnedByPlayer;
	
	
	public Station(String nme, int cost, int pos ){
		super(cost, pos, nme);
	}
	
	public int rent(){
		float rent = 12.5f;
		for(int x = 1; x <= 4; x++){
			rent *= 2;
			if(x == numOwnedByPlayer){
				break;
			}
		}
		return (int)rent;
	}
	
	public void land(Player player){
		trainStation(player);
	}
	
	public void trainStation(Player player){
		player.balance.subtractBalance(rent());
	}
	
	
	
}



