package curso23_10;

public class Principal_Biblioteca {

	public static void main(String[] args) {
		Livro livro = new Livro("É assim que acaba", "collen holver");
		Biblioteca biblioteca = new Biblioteca("Cantinho da leitura", livro);
		System.out.println("A biblioteca se chama: " + biblioteca.getNome()+ "\nNome do Livro: " + livro.getTitulo()+ "\nAutora: " + livro.getAutor());


	}

	}


