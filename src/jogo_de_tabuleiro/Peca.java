package jogo_de_tabuleiro;

//aqui ter� a posi��o que estar� protegida (protect) uma vez que
//ela � uma posi��o simples de matriz, n�o � a posi��o do xadrez 
//ela nao pode estar visivel na camada de xadrez
//essa pe�a conhece o tabuleiro onde estar 
public class Peca {
	
	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	public Peca(Tabuleiro tabuleiro) {
		//super();
		this.tabuleiro = tabuleiro;
		posicao = null;//posi��o de uma pe�a recem criada
	}
	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	
	
	
}
