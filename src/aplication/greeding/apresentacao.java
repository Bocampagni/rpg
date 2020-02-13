package aplication.greeding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class apresentacao {
	;
	
	public static List<Integer> show() {
		List<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Escolha 3 personagens: \n");
		System.out.println("1 - Fábio - Warrior");
		System.out.println("2 - Fernando - Mage");
		System.out.println("3 - Gabriel - Marksmen");
		System.out.println("4 - Higor - Assasin");
		System.out.println("5 - Lucas - Warrior");
		System.out.println("6 - Luiz - Witcher");
		System.out.println("7 - Samuel - Marksmen");
		
		int primeiro, segundo, terceiro;
		primeiro = sc.nextInt();
		segundo = sc.nextInt();
		terceiro = sc.nextInt();
		
		list.add(primeiro);
		list.add(segundo);
		list.add(terceiro);
		
		return list;
	}

}
