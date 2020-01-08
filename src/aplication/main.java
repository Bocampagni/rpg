package aplication;
import java.util.ArrayList;
import java.util.List;

import aplication.Fight.combate;
import characters.*;

public class main {

	public static void main(String[] args) {
		character player1 = new fabio(100,95,95);
		character player2 = new luiz(90,100,60);
		character player3 = new luiz(60,95,90);
		character player4 = new gabriel(95,100,85);
		character player5 = new samuel(65,70,95);
		character player6 = new lucas(90,97,100);
		
		List list1  = new ArrayList();
		List list2  = new ArrayList();
		
		list1.add(player1);
		list2.add(player2);
		list1.add(player3);
		list2.add(player4);
		list1.add(player5);
		list2.add(player6);
		
		combate.start(list1, list2);
		
	}
	

}
