package jogo_de_tabuleiro;

public class Posicao {
	
	private int linha;
	private int coluna;
	
	public Posicao(int linha, int coluna) {
		//super();
		this.linha = linha;
		this.coluna = coluna;
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	
	//para imprimir a posição na tela
	@Override
	public String toString() {
		return linha + "," + coluna;
	}

}
