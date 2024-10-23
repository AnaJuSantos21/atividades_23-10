package curso23_10;

public class Principal_ContaBancaria {

	public static void main(String[] args) {
		ContaBancaria contaBancaria = new ContaBancaria ("00000", 0070477.50);
		Cliente cliente = new Cliente ("Maria", contaBancaria);
		System.out.println("Estudante: " + cliente.getNome() + "\nConta Bancaria: " + contaBancaria.getConta());
		}

	}


