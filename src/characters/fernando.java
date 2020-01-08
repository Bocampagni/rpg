package characters;

import java.util.List;

public class fernando extends character{
	//Mage hook
	public int id = 002;
	public String name = "Fernando";
	
	
	public fernando(int life, int defense, int attack) {
		super(life, defense, attack);
	}
	
	@Override
	public void ataca(int attack, List<character> soldier, int index, int mana, List<character> deathList, List<character> list1, int indexAlly) {

		if(attack == 0 && mana >= 1) {
			soldier.get(index).setLife(soldier.get(index).getLife() - 10);
			System.out.println(getName() + "has attacked" + soldier.get(index).getName());
		}
		
		
		else if(attack == 1 && mana >= 2) {
			for(int i = 0; i < list1.size(); i++) {
				if(list1.get(i).getLife() + 30 > 100) {
					soldier.get(i).setLife(soldier.get(i).getLife() - 10);
					list1.get(i).setLife(100);
					System.out.println(getName() + "has healed" + soldier.get(i).getName());
				}
				else {
					list1.get(i).setLife(list1.get(i).getLife() + 30);
					soldier.get(i).setLife(soldier.get(i).getLife() - 20);
					System.out.println(getName() + "has healed" + soldier.get(i).getName());
				}	
			}
		}
		
		else if(attack == 2 && mana >= 2) {
			for(int i = 0; i < soldier.size(); i++) {
				soldier.get(i).setLife(soldier.get(i).getLife() - 30);
				System.out.println(getName() + "has attacked" + soldier.get(i).getName());
			}
		}
	}
	@Override
	public void getSkills(int mana, List<character> deathList, List<character> list1) {
		String skill1;
		String skill2;
		String skill3;
		
		
		skill1 = "0: [HOOK ATTACK - 20 dmg - 1 mana] - Hook an enemy, stunning it.";
		skill2 = "1: [AREA DAMAGE AND HEAL ALLIES - 10 DMG - 30 heal - 1 mana] - Heal all allies";
		skill3 = "2: [AREA STUN - 30 dmg - 2 mana] - Throw a black hole, stunning all enemies";
		
		
		if(mana == 1) {
			System.out.println(skill1);
		}
		
		else if(mana == 2) {
			System.out.println(skill1 + "\n" + skill2);
		}
		
		else if(mana == 3){
			System.out.println(skill1 + "\n" + skill2 + "\n" + skill3);
		}
	}
	
	public String getName() {
		return this.name;
	}
	public int getId() {
		return this.id;
	}
	
	@Override
	public String toString() {
		return "Fernando: \nLife = " + life + ", Defense = " + defense + ", attack = " + attack;
	}
	
	
}
