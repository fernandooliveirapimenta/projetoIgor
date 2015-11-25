package model;

import persistence.Configuracao;



public class Layout {

	Tabuleiro tabuleiro;
	Configuracao config;
	
	public Layout(Tabuleiro tabuleiro, Configuracao config)
	{
		this.config = config;
		this.tabuleiro =tabuleiro;
	}
	
public void exibeMinas() {
		
		for (int i = 1; i < config.getLinha(); i++)
			for (int j = 1; j < config.getColuna(); j++)
				if (tabuleiro.getMinas()[i][j] == -1)
					tabuleiro.getTabuleiro()[i][j] = '*';

		exibe();
	}


public void exibe() {
	
	for (int linha = 1; linha < config.getLinha(); linha++) {
		for (int coluna = 1; coluna < config.getColuna(); coluna++) {
			System.out.print("   " + tabuleiro.getTabuleiro()[linha][coluna]);
		}

		System.out.println();
	}

	System.out.println("\n");

}

	
}
