package jogo_de_tabuleiro;

public class Tabuleiro {

	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	//Construtor
	public Tabuleiro(int linhas, int colunas) {
		//super();
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}
	public int getLinhas() {
		return linhas;
	}
	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}
	public int getColunas() {
		return colunas;
	}
	public void setColunas(int colunas) {
		this.colunas = colunas;
	}
	
	//aqui vamos criar um metodo para retornar
	//a peça dada a uma linha e uma coluna
	public Peca peca (int linha, int coluna) {
		//vai me retornar a matriz pecas na linha e coluna 
		return pecas [linha][coluna];
	}
	//agora aqui vamos criar uma sobrecarga do metodo
	//criado acima
	public Peca peca (Posicao posicao) {
		return pecas [posicao.getLinha()][posicao.getColuna()];
		
	}
	public void colocarPeca(Peca peca, Posicao posicao) {
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}
}
