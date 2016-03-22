package br.com.maykonhs.jornada.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.maykonhs.jornada.modelo.Livro;

public class TestaInsereLivro {
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("controlejornada");
		EntityManager manager = factory.createEntityManager();
		
		Livro livro = new Livro();
		livro.setTitulo("Harry Potter");
		livro.setAutor("JK Rowling");
		livro.setDescricao("Magia e bruxaria");
		livro.setPreco(50);
		
		manager.getTransaction().begin();
		manager.persist(livro);
		manager.getTransaction().commit();
		manager.close();
		
		System.out.println("Livro salvo com sucesso!");
	}

}
