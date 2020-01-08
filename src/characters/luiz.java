package characters;

import java.util.List;

public class luiz extends character{
	//Necro mage
	public int id = 002;
	public String name = "Luiz";
	
	
	public int getId() {
		return this.id;
	}
	
	public luiz(int life, int defense, int attack) {
		super(life, defense, attack);
	}
	
	
	@Override
	public void ataca(int attack, List<character> soldier, int index, int mana, List<character> deathList, List<character> list1, int indexAlly) {

		if(attack == 0 && mana >= 1) {
			for(int i = 0; i < soldier.size(); i++) {
				soldier.get(i).setLife(soldier.get(i).getLife() - 40);
				System.out.println(getName() + " has attacked " + soldier.get(i).getName());
			}
		}
		else if(attack == 1 && mana >= 2) {
			soldier.get(index).setLife(soldier.get(index).getLife() - 40);
			System.out.println(getName() + " has attacked " + soldier.get(index).getName());
			if(getLife() + 40 <= 100) {
				setLife(getLife() + 40);
			}
			else {
				setLife(100);
				
			}
		}
		else if(attack == 2 && mana == 3 && deathList.size() > 0) {
			for(int i = 0; i < deathList.size(); i++) {
				System.out.println(i + ": " + deathList.get(i).getName());
			}
			ultimate_especial(deathList, indexAlly, list1);
			deathList.remove(deathList.get(indexAlly));
			System.out.println(getName() + " has survived " + list1.get(indexAlly).getName());
		}
		
	}
	
	@Override
	public void getSkills(int mana, List<character> deathList, List<character> list1) {
		String skill1;
		String skill2;
		String skill3;
		
		
		skill1 = "0: [AREA ATTACK] - Skeleton army";
		skill2 = "1: [HEAL ATTACK] - Drain enemy life";
		skill3 = "2: [REVIVE A CHARACTER] - Revive a character randomly";
		
		
		if(mana == 1) {
			System.out.println(skill1);
		}
		
		else if(mana == 3 && deathList.isEmpty() == false && list1.size() < 3){
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
		return "Luiz: \nLife = " + life + ", Defense = " + defense + ", attack = " + attack;
	}
	
	public static void ultimate_especial(List<character> ally, int index, List<character> list1) {
		list1.add(ally.get(index));
		
	}
	
	
}
