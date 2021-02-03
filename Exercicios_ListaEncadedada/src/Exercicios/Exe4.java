package Exercicios;

import java.util.LinkedList;

public class Exe4 {

	public static void main(String[] args) {
		
		LinkedList<Integer> lista = new LinkedList <Integer>();
		
		lista.add(20);
		lista.add(352);
		lista.add(4);
		lista.add(80);
		lista.add(6);
		lista.addFirst(29);
		lista.addLast(7);
		
		Integer maior = 0;
		for(Integer valor : lista) {  
		      if(valor > maior) {
		            maior = valor;
		      }
		}
		
		System.out.println(maior);
	}

      
}
