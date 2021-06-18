package entities;

public class Exame extends Solicitacao {
	public Exame() {

	}

	public Exame(String nome, int duracao) {
		super(nome, duracao);
		custo = duracao * 20.0;
	}
}