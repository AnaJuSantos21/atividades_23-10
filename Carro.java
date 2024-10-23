package curso23_10;

public class Carro extends Brinquedo {
		public Carro(String nome, int velocidade, String tipo, String cor) {
		super(nome,velocidade,tipo,cor);
		}
		@Override
		public void mover() {
		System.out.println("O carro está se movendo na estrada");
		}
		

}
