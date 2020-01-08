package characters;

import java.util.List;

public class higor extends character{
	//Mage assasin
	public String name = "Higor";
	
	public higor(int life, int defense, int attack) {
		super(life, defense, attack);
	}

	
	@Override
	public void ataca(int attack, List<character> soldier, int index, int mana) {
		if(attack == 0 && mana >= 1) {
			soldier.get(index).setLife(soldier.get(index).getLife() - 50);
			//Furtividade
			System.out.println(getName() + "has attacked" + soldier.get(index).getName());
			mana -= 1;
		}
		
		
		else if(attack == 1 && mana >= 2) {
			soldier.get(index).setLife(soldier.get(index).getLife() - 70);
			setLife(getLife() - 10);
			System.out.println(getName() + "has attacked" + soldier.get(index).getName());
			mana -= 2;
			
		}
		else if(attack == 2 && mana >= 3) {
			//Invulneravel por 2 duas rodadas
			System.out.println(getName() + " is hided on bush");
			mana -= 3;
		}
		
	}
	
	@Override
	public void getSkills(int mana, List<character> deathList, List<character> list1) {
		String skill1;
		String skill2;
		String skill3;
		
		
		skill1 = "0: [SINGLE TARGET ATTACK AND FURTIVITY - 50 DMG - 2 MANAS] - Soul burner";
		skill2 = "1: [AREA ATTACK - 70 DMG - 2 MANAS] - Fire ball";
		skill3 = "2: [UNSTOPAPLE - 3 MANAS] - Hide on bush";
		
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
		return "Higor: \nLife = " + life + ", Defense = " + defense + ", attack = " + attack;
	}
	
	public String getName() {
		return this.name;
	}
}
