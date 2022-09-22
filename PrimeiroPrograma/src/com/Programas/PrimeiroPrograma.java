package com.Programas;

import com.Programas.segundo.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Gato gato = new Gato();
		Livros livro = new Livros();
		
		System.out.println(gato);
		System.out.println(livro);

	}

}
class Livros {
	public String nome;
	public Integer npag;
}