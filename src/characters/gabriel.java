package characters;

import java.util.List;

public class gabriel extends character{
	//Marksmen 
	
	public String name = "Gabriel";
	public gabriel(int life, int defense, int attack) {
		super(life, defense, attack);
	}
	
	@Override
	public void ataca(int attack, List<character> soldier, int index, int mana) {
		if(attack == 0 && mana >= 1) {
			for(int it = 0; it < soldier.size() - 1 ; it ++) {
				soldier.get(it).setLife(soldier.get(it).getLife() - 20);
				System.out.println(getName() + " has attacked " + soldier.get(it).getName());
			}
			mana -= 1;
		}
		else if(attack == 1 && mana >= 2) {
			setAttack(getAttack() + 50);
			soldier.get(index).setLife(soldier.get(index).getLife() - 50);
			setAttack(getAttack() - 50);
			System.out.println(getName() + " has attacked " + soldier.get(index).getName());
			mana -= 2;
		}
		else if(attack == 2 && mana >= 2) {
			for(int it = 0; it < soldier.size(); it ++) {
				soldier.get(it).setLife(soldier.get(it).getLife() - 20);
				soldier.get(it).setLife(soldier.get(it).getLife() - 20);
				System.out.println(getName() + " has attacked " + soldier.get(it).getName());
				System.out.println(getName() + " has attacked " + soldier.get(it).getName());
			}
			mana -= 2;
		}
		
	}
	
	@Override
	public void getSkills(int mana, List<character> deathList, List<character> list1) {
		String skill1;
		String skill2;
		String skill3;
		
		
		skill1 = "0: [DOUBLE ATTACK] - Hit two enemies";
		skill2 = "1: [DASH AND HIT - Buff itself for a while then hit an enemy";
		skill3 = "2: [PURGE] - Gabriel hits all enemies multiple times";
		
		if(mana == 1) {
			System.out.println(skill1);
		}
		
		else if(mana == 2) {
			System.out.println(skill1 + "\n" + skill2);
		}
		
		else if(mana == 3) {
			System.out.println(skill1 + "\n" + skill2 + "\n" + skill3);
		}
	}

	@Override
	public String toString() {
		return "Gabriel: \nLife = " + life + ", Defense = " + defense + ", attack = " + attack;
	}
	
	public String getName(){
		return this.name;
		
	}
}
