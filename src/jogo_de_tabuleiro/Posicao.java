package jogo_de_tabuleiro;

public class Posicao {
	//Aqui a gente faz o encapsulamento dos campos
	private int linha;
	private int coluna;
	//aqui eh os construtores recebendo os argumentos
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
	//aqui aplica o conceito de que a classe Object é uma subclasse de todas as classes
	//o conceito de sobrescrição
	@Override
	public String toString() {
		return linha + "," + coluna;
	}

}
