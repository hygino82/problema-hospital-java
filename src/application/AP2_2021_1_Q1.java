package application;

import java.util.Arrays;

import entities.Cirurgia;
import entities.Exame;
import entities.Medicamento;
import entities.Solicitacao;

public class AP2_2021_1_Q1 {
	
	public static void main(String[] args) {
		Solicitacao sangue = new Exame("Exame de Sangue", 20);
		Solicitacao biopsia = new Cirurgia("Biopsia", 30);
		Solicitacao analiseAlergia = new Solicitacao();
		analiseAlergia.adicionaSolicitacao(Arrays.asList(sangue, biopsia));
		System.out.println(analiseAlergia);
		/*Solicitacao anestesia = new Medicamento("Anestesia", 1000);
		Solicitacao septo = new Cirurgia("Corre��o de Septo", 120);
		Solicitacao correcaoSepto = new Solicitacao();
		correcaoSepto.adicionaSolicitacao(anestesia);
		correcaoSepto.adicionaSolicitacao(septo);
		System.out.println(correcaoSepto);
		Solicitacao cisto = new Cirurgia("Extra��o de Cisto", 60);
		Solicitacao extracaoCisto = new Solicitacao();
		extracaoCisto.adicionaSolicitacao(Arrays.asList(analiseAlergia, anestesia,
		cisto));
		System.out.println(extracaoCisto);*/
		}
}
