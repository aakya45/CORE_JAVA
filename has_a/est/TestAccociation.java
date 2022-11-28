package com.demo.est;

import com.demo.beans.Coach;
import com.demo.beans.Player;
import com.demo.beans.Team;

public class TestAccociation 
{
	public static void main(String[] args)
	{
		Player p=new Player(45,"Rohit","Captain");
		Player[] prr=new Player[11];
		prr[0]=new Player(18,"Virat","Batsman");
		prr[1]=new Player(7,"MS Dhoni","WK Batsman");
		prr[2]=new Player(33,"Hardik","Allrounder");
		prr[3]=new Player(64,"SKY","Batsman");
		prr[4]=new Player(73,"Bumrah","Bowler");
		Coach[] ch=new Coach[3];
		ch[0]=new Coach(1,"Rahul Dravid","Batting coach",24);
		ch[1]=new Coach(2,"Zahir Khan","Bowling coach",17);
		ch[2]=new Coach(3,"MD Kaif","Feilding coach",12);
		Team tm=new Team(1,"INDIA",p,prr,ch);
		//System.out.println(tm);

		for(Player p1: tm.getPlist())
		{
			System.out.println(p1);
		}
		for(Coach c1: tm.getChlist())
		{
			System.out.println(c1);
		}
	}

}
