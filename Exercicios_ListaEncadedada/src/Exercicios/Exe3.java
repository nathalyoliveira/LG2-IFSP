package Exercicios;

import java.util.LinkedList;

public class Exe3 {

	public static void main(String[] args) {
		
		LinkedList<Integer> lista = new LinkedList <Integer>();
		
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		lista.add(6);
		lista.addFirst(1);
		lista.addLast(7);
		
		Integer s = 0;
		for (int i=0;i<lista.size();++i) {
			s = s + lista.get(i);
		}   System.out.println(s);
	}
}
