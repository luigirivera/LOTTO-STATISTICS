package controller;

import java.util.ArrayList;

import database.MegaLottoPossiblesService;

public class MegaLottoPossiblesController {
	private MegaLottoPossiblesService service;
	
	public MegaLottoPossiblesController()
	{
		service = new MegaLottoPossiblesService();
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
