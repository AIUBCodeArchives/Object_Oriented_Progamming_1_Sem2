import java.lang.*;
import java.util.*;

public class Game{
	
	protected String gameName;
	protected String gameType;
	protected int score;
	
	public Game()
	{
		
	}
	public Game(String gameName, String gameType, int score)
	{
		this.gameName = gameName;
		this.gameType = gameType;
		this.score = score;
	}
	
	public void setName(String gameName){
		this.gameName=gameName;
	}
	public void setType(String gameType){
		this.gameType = gameType;
	}
	public void setscore(int score){
		this.score=score;
	}
	public String getName(){
		return gameName;
	}
	public String getType(){
		return gameType;
	}
	public int getscore(){
		return score;
	}
	
	public void display(){
		System.out.println("Game Name : "+gameName+"\nGame Type : "+gameType+"\nScore : "+score);
	}
}