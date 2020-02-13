package aplication.Fight;

import java.util.List;

import characters.character;

public class ataca {
	
	public static void atack(List<character> listQueAtaca,List<character> listQueApanha, List<character> deathList, int soldier, int choosen, int mana1, int enemy ) {
		if(listQueAtaca.get(soldier).getId() == 002) {
			listQueAtaca.get(soldier).ataca(choosen, listQueApanha, enemy, mana1, deathList, listQueAtaca, (int) getRandomDoubleBetweenRange(0, deathList.size()-1));
		}
		else {
			listQueAtaca.get(soldier).ataca(choosen, listQueApanha, enemy, mana1);
		}
	}




public static double getRandomDoubleBetweenRange(double min, double max){
    double x =  (Math.random()*((max-min)+1))+min;
    return x;
}

}