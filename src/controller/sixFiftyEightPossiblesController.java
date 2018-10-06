package controller;

import java.util.ArrayList;

import database.sixFiftyEightPossiblesService;

public class sixFiftyEightPossiblesController {
	private sixFiftyEightPossiblesService service;
	
	public sixFiftyEightPossiblesController()
	{
		service = new sixFiftyEightPossiblesService();
	}
	
	public void addCombination(ArrayList<Integer> list)
	{
		service.addCombination(list);
	}
	
	public int getCombinationCount()
	{
		return service.getCombinationCount();
	}
	
	public boolean combinationExist(ArrayList<Integer> list)
	{
		return service.combinationExist(list);
	}
}
