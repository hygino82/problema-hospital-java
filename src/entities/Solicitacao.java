package entities;

import java.util.Locale;

public class Solicitacao {

	protected String nome;
	protected double custo;
	protected int duracao;

	public Solicitacao() {
	}

	public Solicitacao(String nome, double custo) {
		this.nome = nome;
		this.custo = custo;
	}

	public Solicitacao(String nome, int duracao) {
		this.nome = nome;
		this.duracao = duracao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		Locale.setDefault(Locale.US);
		return nome + ", " + String.format("%.1f", custo);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(custo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Solicitacao other = (Solicitacao) obj;
		if (Double.doubleToLongBits(custo) != Double.doubleToLongBits(other.custo))
			return false;
		return true;
	}
}