package xadrez;

import jogo_de_tabuleiro.Peca;
import jogo_de_tabuleiro.Tabuleiro;

public class Peca_De_Xadrez extends Peca{
	
	private Cor cor; //eh o atributo da minha classe

	public Peca_De_Xadrez(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);//O tabuleiro repassa a chamada para o construtor da super classe que eh o construtor da classe peca 
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}
//apaguei o set da cor pois nao quero que 
	//a cor de uma peça nao seja modificada

}

