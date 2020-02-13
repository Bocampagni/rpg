package aplication;

import java.util.HashMap;
import java.util.Map;

import characters.character;
import characters.fabio;
import characters.fernando;
import characters.gabriel;
import characters.higor;
import characters.lucas;
import characters.luiz;
import characters.samuel;

public class alocamento {
	
	public static Map<Integer, character> start(){
		
		
		Map<Integer, character> map = new HashMap<Integer, character>(); 
	    map.put(1, new fabio(1,2,3));
	    map.put(2, new fernando(1,2,3));
	    map.put(3, new gabriel(1,2,3));
	    map.put(4, new higor(1,2,3));
	    map.put(5, new lucas(1,2,3));
	    map.put(6, new luiz(1,2,3));
	    map.put(7, new samuel(1,2,3));
		return map;
	}

}
