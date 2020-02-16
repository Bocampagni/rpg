package aplication.lvl;

import java.util.ArrayList;
import java.util.List;

import aplication.Fight.combate;
import characters.character;
import characters.nonplayer.bot;

public class lvl3 {
	
	
	public static Integer start(List<character> list1){
		List<character> list2 = new ArrayList<>();
		list2.add(new bot(1,2,3));
		list2.add(new bot(1,2,3));
		list2.add(new bot(1,2,3));
		
		Integer escolha = combate.start(list1, list2);
		
		
		
		return escolha;
		
	}
	

}
