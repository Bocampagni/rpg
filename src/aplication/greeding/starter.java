package aplication.greeding;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import characters.character;

public class starter {
	
	
	public static List<character> comeco(int primeiro, int segundo, int terceiro, Map personagens) {
		List<character> list = new ArrayList<>();
		
		list.add((character) personagens.get(primeiro));
		list.add((character) personagens.get(segundo));
		list.add((character) personagens.get(terceiro));

		
		
		
		return list;
	}
}
