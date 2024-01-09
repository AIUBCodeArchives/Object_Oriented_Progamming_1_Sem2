import java.lang.*;
import java.util.*;

public class Cricket extends Game{
	
	private int player;
	
	public Cricket(){
		
	}
	public Cricket(String gameName,String gameType,int score,int player){
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