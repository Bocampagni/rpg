package aplication.Fight;

import java.util.Collections;
import java.util.List;

import characters.character;

public class analise {
	
	public static void fight_analise(List<character> list, List<character> deathList) {
		Collections.sort(list);
		for(int i = 2; i > -1; i--) {
			try {
				if(list.get(i).getLife() <= 0) {
					deathList.add(list.get(i));
					list.remove(list.get(i));
				}
			} catch (IndexOutOfBoundsException e) {
				System.out.println("\n");
			}
		}
				
	}

}
