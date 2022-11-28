package com.demo.beans;

import java.util.Arrays;

public class Team 
{
	private int teamrank;
	private String tmname;
	private Player p;
	private Player[] plist;
	private Coach[] chlist;
	//dfault constructor
	public Team()
	{
		super();
	}
	//parameterized constructor
	public Team(int teamrank, String tmname, Player p, Player[] plist, Coach[] chlist)
	{
		super();
		this.teamrank = teamrank;
		this.tmname = tmname;
		this.p = p;
		this.plist = plist;
		this.chlist = chlist;
	}
	//getter setter
	public int getTeamrank()
	{
		return teamrank;
	}
	public void setTeamrank(int teamrank)
	{
		this.teamrank = teamrank;
	}
	public String getTmname() 
	{
		return tmname;
	}
	public void setTmname(String tmname) 
	{
		this.tmname = tmname;
	}
	public Player getP() 
	{
		return p;
	}
	public void setP(Player p) 
	{
		this.p = p;
	}
	public Player[] getPlist()
	{
		return plist;
	}
	public void setPlist(Player[] plist) 
	{
		this.plist = plist;
	}
	public Coach[] getChlist() 
	{
		return chlist;
	}
	public void setChlist(Coach[] chlist) 
	{
		this.chlist = chlist;
	}
	//to string
	@Override
	public String toString() 
	{
		return "teamrank= "+teamrank+" tmname= "+tmname+" p="+p+" plist="+Arrays.toString(plist)
		+" chlist="+Arrays.toString(chlist);
	}
}
