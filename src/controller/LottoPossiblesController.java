package controller;

import java.util.ArrayList;

import database.LottoPossiblesService;

public class LottoPossiblesController {
	private LottoPossiblesService service;
	
	public LottoPossiblesController()
	{
		service = new LottoPossiblesService();
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
