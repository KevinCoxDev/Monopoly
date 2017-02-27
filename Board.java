import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {
	public Board(){
		
	}
	
	public List<Segment> segs = new ArrayList<Segment>();
	
	//Properties OKR = new Properties("Old Kent Road",60)
	Station PA = new Station("1", 200, 1);
	Station BM = new Station("2",200, 2);
	Station PS = new Station("3",200, 3);
	Station FR = new Station("4",200, 4);
	GoToJail goToJail = new GoToJail("Jail", 5);
	CommunityChest CC1 = new CommunityChest("Com Chest", 6);
	CommunityChest CC2 = new CommunityChest("Com Chest", 7);
	CommunityChest CC3 = new CommunityChest("Com Chest", 8);
	CommunityChest CC4 = new CommunityChest("Com Chest", 9);
	CommunityChest CC5 = new CommunityChest("Com Chest", 10);
	CommunityChest CC6 = new CommunityChest("Com Chest", 11);
	CommunityChest CC7 = new CommunityChest("Com Chest", 12);
	CommunityChest CC8 = new CommunityChest("Com Chest", 13);
	Station T1 = new Station("1",200, 18);
	Station T2 = new Station("2",200, 15);
	Station T3 = new Station("3",200, 16);
	Station T4 = new Station("4",200, 17);
	TestSquare TEST = new TestSquare("TEST",14);
	
	
	public void createBoard(){
		
		segs.add(PA);
		segs.add(BM);
		segs.add(PS);
		segs.add(FR);
		segs.add(goToJail);
		segs.add(CC1);
		segs.add(CC2);
		segs.add(CC3);
		segs.add(CC4);
		segs.add(CC5);
		segs.add(CC6);
		segs.add(CC7);
		segs.add(CC8);
		segs.add(TEST);
		
		
		
		
		//add segments to board array
		//Round()
		
	}
	
	public Segment getSegment(int position){
		System.out.println(Arrays.toString(segs.toArray()));
		return segs.get(position);
	}
	
}
