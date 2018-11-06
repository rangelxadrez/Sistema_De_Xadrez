package principal;

import jogo_de_tabuleiro.Tabuleiro;
import xadrez.Partida_De_Xadrez;

public class Principal {

	public static void main(String[] args) {
		Tabuleiro tabuleiro =  new Tabuleiro (8,8);
	//vamos agora instaciar uma partidas de xadrez aqui e imprimir uma partida de xadrez
	Partida_De_Xadrez partida_de_xadrez = new Partida_De_Xadrez();
	//fazer uma função para imprimir as pecas da partida
	//UI siginifica user interface e dentro dessa interface vou criar um metodo impressao de tabuleiro
	//recebe a matriz de pecas da minha partida
	UI.imprimirTabuleiro(partida_de_xadrez.getPecas());
	
	}

}
