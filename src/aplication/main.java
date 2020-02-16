package aplication;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import aplication.greeding.apresentacao;
import aplication.greeding.starter;
import aplication.lvl.*;
import characters.character;
public class main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		int resultado = 0;
		Map personagens = alocamento.start();
		
		System.out.println(
				  "1 - Início: \n"
				+ "2 - Como jogar\n"
				+ "3 - Ficha dos personagens\n"
				+ "4 - Fases\n"
				+ "5 - Reportar bug"
				);
		while(true) {
			int x  = sc.nextInt();
			
			if(x == 1) {
				List<Integer> list = apresentacao.show();
				List<character> escolhas = starter.comeco(list.get(0), list.get(1), list.get(2), personagens);
				
				System.out.println("Seus personagens são: \n");
				escolhas.forEach(p1 -> System.out.println(p1 + "\n"));
				
				resultado = lvl1.start(escolhas);
				if(resultado == 1) {
					resultado = lvl2.start(escolhas);
					if(resultado == 1) {
						resultado = lvl3.start(escolhas);
						if(resultado == 1) {
							
							System.out.println("Zerou");
							break;
							
						}
					}
				}
				
				
				
			}
		}
	}
	

}
