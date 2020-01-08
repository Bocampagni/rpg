package characters;

import java.util.List;

public class lucas extends character {
	//Warrior buffed
	
	
	public String name = "Lucas";
	
	
	public lucas(int life, int defense, int attack) {
		super(life, defense, attack);
	}
	
	@Override
	public void ataca(int attack, List<character> soldier, int index, int mana) {

		if(attack == 0 && mana >= 1) {
			setLife(getLife() + 5);
			setDefense(getDefense() + 15);
			setAttack(getAttack() + 10);
			mana -= 1;
		}
	
		else if(attack == 1 && mana >= 2) {
			for(int i = 0; i < soldier.size(); i++) {
				soldier.get(i).setLife(soldier.get(i).getLife() - 30);
				System.out.println(getName() + " has attacked " + soldier.get(i).getName());
			}
			
			setLife(getLife() + 5);	
			mana -= 2;
		}
		
		
		else if(attack == 2 && mana == 3 && this.attack > 110) {
			
			soldier.get(index).setLife(soldier.get(index).getLife() - 100);
			System.out.println(getName() + " has attacked " + soldier.get(index).getName());
			mana -= 3;
		}
		

	}
	@Override
	public void getSkills(int mana, List<character> deathList, List<character> list1) {
		String skill1;
		String skill2;
		String skill3;
		
		
		skill1 = "0: [BUFF] - BUFF ITSELF. +15 DEFENSE, +10 ATTACK, +5 HEAL";
		skill2 = "1: [AREA DAMAGE AND HEAL ITSELF - 30 DMG - 5 HEAL - 1 mana] - Lucas Attacks all enemies, throwing punches";
		skill3 = "2: [ONE PUNCH MAN] - Kill an enemy";
		
		
		if(mana == 1) {
			System.out.println(skill1);
		}
		
		else if(mana == 3 && getAttack() >= 150){
			System.out.println(skill1 + "\n" + skill2 + "\n" + skill3);
		}
		
		else if(mana >= 2) {
			System.out.println(skill1 + "\n" + skill2);
		}
		

	}
	
	public String getName() {
		return this.name;
	}
	@Override
	public String toString() {
		return "Lucas: \nLife = " + this.life + ", Defense = " + this.defense + ", attack = " + this.attack;
	}
	
	
}
