package entities;

public class Cirurgia extends Solicitacao {
	public Cirurgia() {

	}

	public Cirurgia(String nome, int duracao) {
		super(nome, duracao);
		custo = duracao * 100.0;
	}
}