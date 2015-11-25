package model;

import java.util.Random;

import persistence.Configuracao;

public class Tabuleiro {
	private int[][] minas;
	private char[][] tabuleiro;
	private char[][] tabuleiroJogo;
	Random random = new Random();
	Configuracao config;

	public Tabuleiro(Configuracao config) {
		this.config = config;
		iniciaJogo();
	}

	public void iniciaJogo() {
		minas = new int[config.getLinha()][config.getColuna()];
		tabuleiro = new char[config.getLinha()][config.getColuna()];
		tabuleiroJogo = new char[config.getLinha()][config.getColuna()];
		iniciaMinas();
		sorteiaMinas();
		preencheDicas();
		iniciaTabuleiro();
		iniciaTabuleiroJogo();
	}

	public boolean isVencedor() {
		int count = 0;
		for (int linha = 1; linha < config.getLinha(); linha++)
			for (int coluna = 1; coluna < config.getColuna(); coluna++)
				if (tabuleiroJogo[linha][coluna] == '_')
					count++;
		if ((count == config.getBomba()))
			return true;
		else
			return false;
	}

	public void abrirVizinhas(int linha, int coluna) {

		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 2; j++)
				if (linha != 0 && coluna != 0
						&& (minas[linha + i][coluna + j] != -1)) {
					tabuleiro[linha + i][coluna + j] = Character.forDigit(
							minas[linha + i][coluna + j], 10);
				}
	}

	public void preencheDicas() {
		for (int linha = 1; linha < config.getLinha(); linha++)
			for (int coluna = 1; coluna < config.getColuna(); coluna++) {

				for (int i = -1; i <= 1; i++)
					for (int j = -1; j <= 1; j++) {

						// INCLUSÃO do if para comparar os limites não
						// permitidos do array
						if ((linha != 0 && linha != config.getLinha() - 1
								&& coluna != 0 && coluna != config.getColuna() - 1)) {

							if (minas[linha][coluna] != -1)
								if (minas[linha + i][coluna + j] == -1)
									minas[linha][coluna]++;
						}
					}
			}

	}

	// alteração = incluí o -1 depois de getlinha e coluna
	public void iniciaTabuleiro() {
		for (int i = 1; i < config.getLinha(); i++)
			for (int j = 1; j < config.getColuna(); j++)
				tabuleiro[i][j] = '_';
	}

	public void iniciaTabuleiroJogo() {
		for (int i = 1; i < config.getLinha(); i++)
			for (int j = 1; j < config.getColuna(); j++)
				if (minas[i][j] != -1)
					tabuleiroJogo[i][j] = tabuleiro[i][j];
				else
					tabuleiroJogo[i][j] = '_';
	}

	public void iniciaMinas() {
		for (int i = 1; i < config.getLinha(); i++)
			for (int j = 1; j < config.getColuna(); j++)
				minas[i][j] = 0;
	}

	public void sorteiaMinas() {
		boolean sorteado;
		int linha, coluna;
		for (int i = 0; i < config.getBomba(); i++) {

			do {
				// EXCLUSÃO do random.nextInt(config.getLinha()-3)+1;
				linha = random.nextInt(config.getLinha() - 1);
				coluna = random.nextInt(config.getColuna() - 1);

				if (minas[linha][coluna] == -1)
					sorteado = true;
				else
					sorteado = false;
			} while (sorteado);

			minas[linha][coluna] = -1;
		}
	}

	public boolean isDerrota(int x, int y) {
		if (minas[x][y] == -1)
			return true;
		else
			return false;

	}

	public int[][] getMinas() {
		return minas;
	}

	public char[][] getTabuleiro() {
		return tabuleiro;
	}

	public char[][] getTabuleiroJogo() {
		return tabuleiroJogo;
	}

}
