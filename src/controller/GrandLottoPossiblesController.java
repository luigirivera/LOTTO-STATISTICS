package controller;

import java.util.ArrayList;

import database.GrandLottoPossiblesService;

public class GrandLottoPossiblesController {
	private GrandLottoPossiblesService service;
	
	public GrandLottoPossiblesController()
	{
		service = new GrandLottoPossiblesService();
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
