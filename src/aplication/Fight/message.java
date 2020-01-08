package aplication.Fight;

import java.util.List;

import characters.character;

//The purpose of this class is to keep combate class clean and easy to read.
public class message {
	
	public static void yourstatus(List<character> list1, List<character>list2) {
		
		System.out.println("It is your time to attack !");
		System.out.println("Choose your soldier:\n ");
		for(int c = 0; c < list1.size(); c++) {
			System.out.println(c + ": " + list1.get(c) + "\n");
		}
	}
	
	public static void enemyStatus(List<character> list1, List<character>list2) {
		System.out.println("Targets able to attack:\n ");
		for(int c = 0; c < list2.size(); c++) {
			System.out.println(c + ": " + list2.get(c) + "\n");
		}	
	}
	
	public static void soldierSkill(List<character> list1, int index, int mana, List<character> deathList) {
		list1.get(index).getSkills(mana, deathList, list1 );
	}
}
