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
				ataca.atack(list1,list2,deathList,soldier, choosen, mana1, enemy);
				
				Collections.sort(list2);
						
				
				analise.fight_analise(list2, deathList);
				
				if(list2.isEmpty()) {
					System.out.println("You won");
					break;
				}
				
				int enemysoldier = (int) getRandomDoubleBetweenRange(0, list2.size()-1);
				int enemyskill = (int) getRandomDoubleBetweenRange(0, list2.size()-1);
				int enemytarget = (int) getRandomDoubleBetweenRange(0, list1.size()-1);
				
				ataca.atack(list2, list1,  deathList, enemysoldier, enemyskill, mana1, enemytarget);
								
				
				Collections.sort(list1);
				analise.fight_analise(list1, deathList);
				
				if(list1.isEmpty()) {
					System.out.println("You lost");
					break;
				}
			}
			
			
			
			analise.deathListAnalise(deathList);
		}
	}

	public static double getRandomDoubleBetweenRange(double min, double max){
	    double x =  (Math.random()*((max-min)+1))+min;
	    return x;
}
	
	

}
