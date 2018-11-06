package principal;

import xadrez.Peca_De_Xadrez;

public class UI {
	public static void imprimirTabuleiro(Peca_De_Xadrez[][] pecas){
	for (int i =0; i<pecas.length; i++) {
		 System.out.print((8 - i)+ " ");
			 for (int j=0; j<pecas.length; j++) {
				 imprimirPeca(pecas[i][j]);
			 }
			 System.out.println();
		 }
		 System.out.println("  a b c d e f g h");
	}
		
	//metodo auxiliar
	private static void imprimirPeca (Peca_De_Xadrez peca) {
		if (peca == null) {//isso signifa que nao tinha peca nessa posicao do tabuleiro
			System.out.print("-");
	}
	else {
		System.out.print(peca);
	}
	System.out.println(" ");
}
}
