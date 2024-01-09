import java.lang.*;
import java.util.*;

public class Tennis extends Game{
	
	private int player;
	
	public Tennis(){
		
	}
	public Tennis(String gameName,String gameType,int score,int player){
		super(gameName,gameType,score);
		this.player = player;
	}
	public void setPlayer(int player){
		this.player = player;
	}
	
	public int getPlayer(){
		return player;
	}
	public void display(){
		super.display();
		System.out.println("Players : "+player);
	}
}