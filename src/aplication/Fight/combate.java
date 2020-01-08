package aplication.Fight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import characters.character;

public class combate {
	
	
	public static int mana1 = 3;
	public static int mana2 = 3;
	public static int turn = 1;
		
	public static void start(List<character> list1, List<character> list2) {
		Scanner sc = new Scanner(System.in);
		List<character> deathList = new ArrayList<>();
		
		while(true){
			
			mana.refresh(mana1, mana2);
			
			if(list1 != null) {
				message.yourstatus(list1, list2);
				int soldier = sc.nextInt();
				
				message.soldierSkill(list1,soldier, mana1, deathList);
				int choosen = sc.nextInt();
				
				message.enemyStatus(list1, list2);
				int enemy = sc.nextInt();
				
				if(list1.get(soldier).getId() == 002) {
					list1.get(soldier).ataca(choosen, list2, enemy, mana1, deathList, list1, (int) getRandomDoubleBetweenRange(0, deathList.size()-1));
				}
				else {
					list1.get(soldier).ataca(choosen, list2, enemy, mana1);
				}
				Collections.sort(list2);
				for(int i = 2; i > -1; i-- ){
					try{
						if(list2.get(i).getLife() <= 0) {
							deathList.add(list2.get(i));
							list2.remove(list2.get(i));
						}
					} catch (IndexOutOfBoundsException e) {						
					}
				}
				if(list2.isEmpty()) {
					System.out.println("You won");
					break;
				}
				
				int enemysoldier = (int) getRandomDoubleBetweenRange(0, list2.size()-1);
				int enemyskill = (int) getRandomDoubleBetweenRange(0, list2.size()-1);
				int enemytarget = (int) getRandomDoubleBetweenRange(0, list1.size()-1);
				
				//alte fut
				if(list2.get(enemysoldier).getId() == 002) {
					list2.get(enemysoldier).ataca(enemyskill, list1, enemytarget, mana2, deathList, list2, (int) getRandomDoubleBetweenRange(0, deathList.size()-1));
				}
				else {
					list1.get(enemysoldier).ataca(enemyskill, list1, enemytarget, mana2);
				}
								
				
				Collections.sort(list1);
				for(int i = 2; i > -1; i--) {
					try {
						if(list1.get(i).getLife() <= 0) {
							deathList.add(list1.get(i));
							list1.remove(list1.get(i));
						}
					} catch (IndexOutOfBoundsException e) {
						System.out.println("\n");
					}
				}
				if(list1.isEmpty()) {
					System.out.println("You lost");
					break;
				}
			}
			
			System.out.println("Death List:");
			for(int i = 0; i < deathList.size(); i++) {
				deathList.get(i).setLife(30);
				System.out.println(deathList.get(i).getName());
			}
		}
	}
	public static double getRandomDoubleBetweenRange(double min, double max){
	    double x =  (Math.random()*((max-min)+1))+min;
	    return x;
}
	
	

}
