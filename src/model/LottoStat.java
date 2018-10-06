package model;

import java.util.ArrayList;
import java.util.Collections;

import controller.sixFiftyEightPossiblesController;

public class LottoStat {
	private sixFiftyEightPossiblesController sixfiveeightControl;
	public LottoStat() {
		sixfiveeightControl = new sixFiftyEightPossiblesController();
		test();
	}
	
	private void test()
	{
		for(int i = 1; i <= 42; i++)
		{
			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp.add(i);
			
			for(int j = 1; j <= 42; j++)
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
													System.out.println("Combination Count: " + sixfiveeightControl.getCombinationCount());
													if(!sixfiveeightControl.combinationExist(newTemp))
														sixfiveeightControl.addCombination(newTemp);
														
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
