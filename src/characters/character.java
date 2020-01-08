package characters;

import java.util.List;

public class character implements Comparable<character>{
	protected Integer life;
	protected int defense;
	protected int attack;
	protected int id;
	protected String name;

	
	
	public character(int life, int defense, int attack) {
		this.life = life;
		this.defense = defense;
		this.attack = attack;
	}
	
	public int getId() {
		return this.id;
	}

	public int getLife() {
		return life;
	}


	public void setLife(int life) {
		this.life = life;
	}


	public int getDefense() {
		return defense;
	}


	public void setDefense(int defense) {
		this.defense = defense;
	}


	public int getAttack() {
		return attack;
	}


	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	public String getName() {
		return this.name;
	}

	public void ataca(int attack, List<character> soldier, int index, int mana) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(character o) {
		return life.compareTo(o.getLife());
	}


	public void ataca(int attack, List<character> soldier, int index, int mana, List<character> deathList,
			List<character> list1, int indexAlly) {
		// TODO Auto-generated method stub
		
	}

	public void getSkills(int mana) {
		// TODO Auto-generated method stub
		
	}

	public void getSkills(int mana, List<character> deathList, List<character> list1) {
		// TODO Auto-generated method stub
		
	}


	
}
