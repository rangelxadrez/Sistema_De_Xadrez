package xadrez;

import Pecas.Xadrez.Torre;
import jogo_de_tabuleiro.Posicao;
import jogo_de_tabuleiro.Tabuleiro;

//essa classe vai ser o cora��o do nosso sistema
//eh nessa classe que vai ter as regras do xadrez
public class Partida_De_Xadrez {
// toda partida de xadrez tem que ter um tabuleiro
	private Tabuleiro tabuleiro;
	
	//aqui vamos criar um construto
	public Partida_De_Xadrez() {
		tabuleiro = new Tabuleiro (8,8);
		inicializarJogo();
	}
	//este m�todo vai retornar uma matriz de pecas de xadrez
	//correspondente a essa partida
	public Peca_De_Xadrez[][] getPecas(){
		//essa variaveo Peca_De_Xadrez eh uma variavel temporaria
		Peca_De_Xadrez[][] mat = new Peca_De_Xadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		//esse � um for para percorrer as colunas da matriz
		for (int i=0; i<tabuleiro.getLinhas(); i++){
			for (int j=0; j<tabuleiro.getColunas(); j++) {
				//nesse momento ele faz um downCast para peca de xadrez
				//pois a� ele vai interpretar isso como uma peca de Xadrez e nao como uma 
				//pe�a comum
				mat[i][j] = (Peca_De_Xadrez) tabuleiro.peca(i,j);
			}
		}
		return mat;
	}
	private void inicializarJogo() {
		tabuleiro.colocarPeca(new Torre(tabuleiro,Cor.BRANCO), new Posicao (2, 1));
	}
}
