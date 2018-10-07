package controller;

import java.util.ArrayList;

import database.UltraLottoPossiblesService;

public class UltraLottoPossiblesController {
	private UltraLottoPossiblesService service;
	
	public UltraLottoPossiblesController()
	{
		service = new UltraLottoPossiblesService();
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
