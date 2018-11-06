package Pecas.Xadrez;

import jogo_de_tabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.Peca_De_Xadrez;

public class Torre extends Peca_De_Xadrez {
//esse construtor vai apenas repassar a chamada para a subclasse
	public Torre(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "T";
	}

}
