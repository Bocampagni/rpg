package characters;

import java.util.List;

public class samuel extends character{
	 //Marksman
	public String name = "Samuel";
	public samuel(int life, int defense, int attack) {
		super(life, defense, attack);
		}
	
	@Override
	public void ataca(int attack, List<character> soldier, int index, int mana) {
		if(attack == 0 && mana >= 1) {
			for(int it = 0; it < soldier.size() ; it ++) {
				soldier.get(it).setLife(soldier.get(it).getLife() - 10 + it * 5);
				System.out.println(getName() + " has attacked " + soldier.get(it).getName());
			}
			mana -= 1;
		}
		else if(attack == 1 && mana >= 2) {
			for(int it = 0; it < soldier.size() ; it ++) {
				soldier.get(it).setLife(soldier.get(it).getLife() - 30);
				System.out.println(getName() + " has attacked " + soldier.get(it).getName());
			}
			mana -= 2;
		}
		else if(attack == 2 && mana >= 2) {
			//Buff e invuneravilidade
			mana -= 2;
		}
	
	}

	@Override
	public void getSkills(int mana, List<character> deathList, List<character> list1) {
		String skill1;
		String skill2;
		String skill3;
	
	
		skill1 = "0: [Scale attack] - Hit everyenemy on the fild, the last hitten get the most damage";
		skill2 = "1: [AREA ATTACK] - Chopper attack";
		skill3 = "2: [Critic status] - Cannot be hitten for 1 turn and every single hit give extra damage based on the max life of the target";
	
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
			return "Samuel: \nLife = " + life + ", Defense = " + defense + ", attack = " + attack;
		}
	public String getName() {
		return this.name;
	}
	
	}
