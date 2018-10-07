package model;

import java.util.ArrayList;
import java.util.Collections;

import controller.GrandLottoPossiblesController;
import controller.LottoPossiblesController;
import controller.MegaLottoPossiblesController;
import controller.SuperLottoPossiblesController;
import controller.UltraLottoPossiblesController;

public class LottoStat {
	
	private LottoPossiblesController lottoControl;
	private MegaLottoPossiblesController megaLottoControl;
	private SuperLottoPossiblesController superLottoControl;
	private GrandLottoPossiblesController grandLottoControl;
	private UltraLottoPossiblesController ultraLottoControl;
	
	public LottoStat() {
		lottoControl = new LottoPossiblesController();
		megaLottoControl = new MegaLottoPossiblesController();
		superLottoControl = new SuperLottoPossiblesController();
		grandLottoControl = new GrandLottoPossiblesController();
		ultraLottoControl = new UltraLottoPossiblesController();
		
		
		Thread object = new Thread(new LottoGenerateThread()); 
		object.start(); 
		
		object = new Thread(new MegaLottoGenerateThread()); 
		object.start(); 
		
		object = new Thread(new SuperLottoGenerateThread()); 
		object.start(); 
		
		object = new Thread(new GrandLottoGenerateThread()); 
		object.start(); 
		
		object = new Thread(new UltraLottoGenerateThread()); 
		object.start(); 
	}
	
	class LottoGenerateThread implements Runnable
	{

		@Override
		public void run() {
			for(int i = 1; i <= 42; i++)
			{
				ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.add(i);
				
				for(int j = 1 ; j <= 42; j++)
				{
					if(!temp.contains(j))
					{
						temp.add(j);
						for(int k = 1; k <= 42; k++)
							if(!temp.contains(k))
							{
								temp.add(k);
								for(int l = 1; l <= 42; l++)
									if(!temp.contains(l))
									{
										temp.add(l);
										for(int m = 1; m <= 42; m++)
											if(!temp.contains(m))
											{
												temp.add(m);
												for(int n = 1; n <= 42; n++)
													if(!temp.contains(n))
													{
														temp.add(n);
														ArrayList<Integer> newTemp = sort((ArrayList<Integer>)temp.clone());
														System.out.println("Combination Count: " + lottoControl.getCombinationCount());
														if(!lottoControl.combinationExist(newTemp))
															lottoControl.addCombination(newTemp);
															
														temp.remove(5);
													}
												temp.remove(4);
											}
										temp.remove(3);
									}
								temp.remove(2);
							}
						temp.remove(1);
					}
				}
			}
			
		}
		
		private ArrayList<Integer> sort(ArrayList<Integer> list)
		{
			boolean pass;
			do
			{
				pass = true;
				for(int i = 0; i < list.size()-1; i++)
					if(list.get(i) > list.get(i+1))
					{
						Collections.swap(list, i, i+1);
						pass = false;
					}
			}while(!pass);
			
			return list;
		}
	}
	
	class MegaLottoGenerateThread implements Runnable
	{

		@Override
		public void run() {
			for(int i = 1; i <= 45; i++)
			{
				ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.add(i);
				
				for(int j = 1 ; j <= 45; j++)
				{
					if(!temp.contains(j))
					{
						temp.add(j);
						for(int k = 1; k <= 45; k++)
							if(!temp.contains(k))
							{
								temp.add(k);
								for(int l = 1; l <= 45; l++)
									if(!temp.contains(l))
									{
										temp.add(l);
										for(int m = 1; m <= 45; m++)
											if(!temp.contains(m))
											{
												temp.add(m);
												for(int n = 1; n <= 45; n++)
													if(!temp.contains(n))
													{
														temp.add(n);
														ArrayList<Integer> newTemp = sort((ArrayList<Integer>)temp.clone());
														System.out.println("Combination Count: " + megaLottoControl.getCombinationCount());
														if(!megaLottoControl.combinationExist(newTemp))
															megaLottoControl.addCombination(newTemp);
															
														temp.remove(5);
													}
												temp.remove(4);
											}
										temp.remove(3);
									}
								temp.remove(2);
							}
						temp.remove(1);
					}
				}
			}
			
		}
		
		private ArrayList<Integer> sort(ArrayList<Integer> list)
		{
			boolean pass;
			do
			{
				pass = true;
				for(int i = 0; i < list.size()-1; i++)
					if(list.get(i) > list.get(i+1))
					{
						Collections.swap(list, i, i+1);
						pass = false;
					}
			}while(!pass);
			
			return list;
		}
	}
	
	class SuperLottoGenerateThread implements Runnable
	{

		@Override
		public void run() {
			for(int i = 1; i <= 49; i++)
			{
				ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.add(i);
				
				for(int j = 1 ; j <= 49; j++)
				{
					if(!temp.contains(j))
					{
						temp.add(j);
						for(int k = 1; k <= 49; k++)
							if(!temp.contains(k))
							{
								temp.add(k);
								for(int l = 1; l <= 49; l++)
									if(!temp.contains(l))
									{
										temp.add(l);
										for(int m = 1; m <= 49; m++)
											if(!temp.contains(m))
											{
												temp.add(m);
												for(int n = 1; n <= 49; n++)
													if(!temp.contains(n))
													{
														temp.add(n);
														ArrayList<Integer> newTemp = sort((ArrayList<Integer>)temp.clone());
														System.out.println("Combination Count: " + superLottoControl.getCombinationCount());
														if(!superLottoControl.combinationExist(newTemp))
															superLottoControl.addCombination(newTemp);
															
														temp.remove(5);
													}
												temp.remove(4);
											}
										temp.remove(3);
									}
								temp.remove(2);
							}
						temp.remove(1);
					}
				}
			}
			
		}
		
		private ArrayList<Integer> sort(ArrayList<Integer> list)
		{
			boolean pass;
			do
			{
				pass = true;
				for(int i = 0; i < list.size()-1; i++)
					if(list.get(i) > list.get(i+1))
					{
						Collections.swap(list, i, i+1);
						pass = false;
					}
			}while(!pass);
			
			return list;
		}
	}
	
	class GrandLottoGenerateThread implements Runnable
	{

		@Override
		public void run() {
			for(int i = 1; i <= 55; i++)
			{
				ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.add(i);
				
				for(int j = 1 ; j <= 55; j++)
				{
					if(!temp.contains(j))
					{
						temp.add(j);
						for(int k = 1; k <= 55; k++)
							if(!temp.contains(k))
							{
								temp.add(k);
								for(int l = 1; l <= 55; l++)
									if(!temp.contains(l))
									{
										temp.add(l);
										for(int m = 1; m <= 55; m++)
											if(!temp.contains(m))
											{
												temp.add(m);
												for(int n = 1; n <= 55; n++)
													if(!temp.contains(n))
													{
														temp.add(n);
														ArrayList<Integer> newTemp = sort((ArrayList<Integer>)temp.clone());
														System.out.println("Combination Count: " + grandLottoControl.getCombinationCount());
														if(!grandLottoControl.combinationExist(newTemp))
															grandLottoControl.addCombination(newTemp);
															
														temp.remove(5);
													}
												temp.remove(4);
											}
										temp.remove(3);
									}
								temp.remove(2);
							}
						temp.remove(1);
					}
				}
			}
			
		}
		
		private ArrayList<Integer> sort(ArrayList<Integer> list)
		{
			boolean pass;
			do
			{
				pass = true;
				for(int i = 0; i < list.size()-1; i++)
					if(list.get(i) > list.get(i+1))
					{
						Collections.swap(list, i, i+1);
						pass = false;
					}
			}while(!pass);
			
			return list;
		}
	}
	
	class UltraLottoGenerateThread implements Runnable
	{

		@Override
		public void run() {
			for(int i = 1; i <= 58; i++)
			{
				ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.add(i);
				
				for(int j = 1 ; j <= 58; j++)
				{
					if(!temp.contains(j))
					{
						temp.add(j);
						for(int k = 1; k <= 58; k++)
							if(!temp.contains(k))
							{
								temp.add(k);
								for(int l = 1; l <= 58; l++)
									if(!temp.contains(l))
									{
										temp.add(l);
										for(int m = 1; m <= 58; m++)
											if(!temp.contains(m))
											{
												temp.add(m);
												for(int n = 1; n <= 58; n++)
													if(!temp.contains(n))
													{
														temp.add(n);
														ArrayList<Integer> newTemp = sort((ArrayList<Integer>)temp.clone());
														System.out.println("Combination Count: " + ultraLottoControl.getCombinationCount());
														if(!ultraLottoControl.combinationExist(newTemp))
															ultraLottoControl.addCombination(newTemp);
															
														temp.remove(5);
													}
												temp.remove(4);
											}
										temp.remove(3);
									}
								temp.remove(2);
							}
						temp.remove(1);
					}
				}
			}
			
		}
		
		private ArrayList<Integer> sort(ArrayList<Integer> list)
		{
			boolean pass;
			do
			{
				pass = true;
				for(int i = 0; i < list.size()-1; i++)
					if(list.get(i) > list.get(i+1))
					{
						Collections.swap(list, i, i+1);
						pass = false;
					}
			}while(!pass);
			
			return list;
		}
	}

}
