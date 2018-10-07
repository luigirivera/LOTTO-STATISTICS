package controller;

import java.util.ArrayList;

import database.SuperLottoPossiblesService;

public class SuperLottoPossiblesController {
	private SuperLottoPossiblesService service;
	
	public SuperLottoPossiblesController()
	{
		service = new SuperLottoPossiblesService();
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
