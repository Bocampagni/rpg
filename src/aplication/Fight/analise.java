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
	
	
	public static void deathListAnalise(List<character> deathList) {
		
		System.out.println("Death List:");
		for(int i = 0; i < deathList.size(); i++) {
			deathList.get(i).setLife(30);
			System.out.println(deathList.get(i).getName());
		}
		
	}

}
