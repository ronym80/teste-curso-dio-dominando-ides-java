package Pacote1;

import Pacote2.Gato;

public class primeiro_programa {

	public static void main(String[] args) {
		
		Gato gato = new Gato(null, null, null);
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);
		//int a = 2;
		//int b = 3;
		//System.out.println("Hello World! "+ (a + b));
	}

}

class Livros {
	private String nome;
	private String npag;
}