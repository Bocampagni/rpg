package characters;

import java.util.List;

public class fabio extends character{
	//Warrior crowd control
	public String name = "Fabius IV";
	
	
	public fabio(int life, int defense, int attack) {
		super(life, defense, attack);
	}
	@Override
	public void ataca(int attack, List<character> soldier, int index, int mana) {
		if(attack == 0 && mana >= 1) {
			soldier.get(index).setLife(soldier.get(index).getLife() - 70);
			System.out.println(getName() + " has attacked " + soldier.get(index).getName());
			mana -= 1;
		}
		else if(attack == 1 && mana >= 2) {
			for(int it = 0; it < soldier.size() ; it ++) {
				soldier.get(it).setLife(soldier.get(it).getLife() - 50);
				System.out.println(getName() + " has attacked " + soldier.get(it).getName());
			}
			mana -= 2;
		}
		else if(attack == 2 && mana >= 2) {
			for(int it = 0; it < soldier.size(); it ++) {
				soldier.get(it).setLife(soldier.get(it).getLife() - 70);
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
		
		
		skill1 = "0: [SINGLE TARGET ATTACK] - Fabius IV throws his spear then jump forward the oponnent, stunning it";
		skill2 = "1: [AREA ATTACK] - Fabius IV spin the spear, hitting all enemies.";
		skill3 = "2: [CATACLYSM] - Fabius go after all of enemies buffed with the whey's power, catching ALL ENEMIES and STUNNING them.";
		
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
		return "Fabius IV: \nLife = " + life + ", Defense = " + defense + ", attack = " + attack;
	}
	
	public String getName() {
		return this.name;
	}
}
