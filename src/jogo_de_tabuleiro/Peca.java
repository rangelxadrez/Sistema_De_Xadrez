package jogo_de_tabuleiro;

//aqui terá a posição que estará protegida (protect) uma vez que
//ela é uma posição simples de matriz, não é a posição do xadrez 
//ela nao pode estar visivel na camada de xadrez
//essa peça conhece o tabuleiro onde estar 
public class Peca {
	
	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	public Peca(Tabuleiro tabuleiro) {
		//super();
		this.tabuleiro = tabuleiro;
		posicao = null;//posição de uma peça recem criada
	}
	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	
	
	
}
